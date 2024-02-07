
package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import logica.Cliente;
import logica.Controladora;


@WebServlet(name = "SvClientes", urlPatterns = {"/SvClientes"})
public class SvClientes extends HttpServlet {
    
    Controladora control=new Controladora();

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
       List<Cliente>listaClientes=new ArrayList<>();
       listaClientes= control.traerClientes();
        
       
       HttpSession misesion=request.getSession();
       misesion.setAttribute("listaClientes",listaClientes);
       
       response.sendRedirect("mostrarClientes.jsp");
       
       
       
       
       
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
       
       Cliente client=new Cliente();
        client.setNombreDueno(nombreDueno);
        client.setCelular(celular);
        client.setNombreMascota(nombreMascota);
        client.setRaza(raza);
        client.setObservaciones(odservaciones);
        
        
        control.crearCliente(client);
        
       
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
