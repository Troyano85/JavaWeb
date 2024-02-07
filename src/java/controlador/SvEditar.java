/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Cliente;
import logica.Controladora;


@WebServlet(name = "SvEditar", urlPatterns = {"/SvEditar"})
public class SvEditar extends HttpServlet {
    
     Controladora control=new Controladora();

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int idEditar=Integer.parseInt(request.getParameter("txtIdClienteEditar"));
        Cliente client=control.traerUsuario(idEditar);
        
        HttpSession misesion=request.getSession();
       misesion.setAttribute("clienteEditar",client);
       
       response.sendRedirect("editar.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombreDueno=request.getParameter("txtNombreDueno");
       String celular=request.getParameter("txtCelular");
       String nombreMascota=request.getParameter("txtNombreMascota");
       String raza=request.getParameter("txtRaza");
       String odservaciones=request.getParameter("txtObservaciones");
        
        
       
       //creamos el nuevo odjeto
       
       Cliente client=(Cliente)request.getSession().getAttribute("clienteEditar"); 
        client.setNombreDueno(nombreDueno);
        client.setCelular(celular);
        client.setNombreMascota(nombreMascota);
        client.setRaza(raza);
        client.setObservaciones(odservaciones);
        
        
        control.EditarCliente(client);
        
        response.sendRedirect("mostrarClientes.jsp");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
