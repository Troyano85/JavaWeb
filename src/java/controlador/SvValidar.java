package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SvValidar", urlPatterns = {"/SvValidar"})
public class SvValidar extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");

        String user = request.getParameter("txtUser");
        String pass = request.getParameter("txtPass");
        if (accion.equalsIgnoreCase("ingresar")) {
            if ("David".equals(user) && "123".equals(pass)) {
                // Usuario y contraseña válidos, redirigir a una página de éxito
                response.sendRedirect("principal.jsp");
            } else {
                // Usuario o contraseña incorrectos, redirigir a una página index
                response.sendRedirect("index.jsp");
            }
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
