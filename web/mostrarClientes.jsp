<%@page import="java.util.List"%>
<%@page import="logica.Cliente"%>
<%@page import="persistencia.ControladoraPersistencia"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <link href="css/estilos.css" rel="stylesheet">
        <title>Lista de Clientes</title>
       
    </head>
    <body>

        <div class="container">
            <h1>Lista de Clientes</h1>
            <table>
                <tr>
                    <th>Id</th>
                    <th>Nombre del Dueño</th>
                    <th>Celular</th>
                    <th>Nombre de la Mascota</th>
                    <th>Raza</th>
                    <th>Observaciones</th>
                </tr>
                <% List<Cliente> listaClientes = (List<Cliente>) request.getSession().getAttribute("listaClientes");
                    if (listaClientes != null) {
                        for (Cliente cliente : listaClientes) {
                %>
                <tr>
                    <td><%=cliente.getId()%></td>
                    <td><%=cliente.getNombreDueno()%></td>
                    <td><%=cliente.getCelular()%></td>
                    <td><%=cliente.getNombreMascota()%></td>
                    <td><%=cliente.getRaza()%></td>
                    <td><%=cliente.getObservaciones()%></td>
                </tr>
                <%     }
                } else {
                %>
                <tr>
                    <td colspan="5">No hay clientes registrados.</td>
                </tr>
                <% }%>
            </table>
            <h2>Eliminar Cliente</h2>
            <p>Ingrese el Id del cliente que quiere Eliminar</p>
            <form action="SvEliminar" method="POST">
                <label for="IDDueño">Id:</label>
                <input type="text" id="idCliente" name="txtIdCliente" required>
                <button type="submit">Eliminar Cliente</button>
            </form> 
            <h2>Editar Cliente</h2>
            <p>Ingrese el Id del cliente que quiere Editar</p>
            <form action="SvEditar" method="GET">
                <label for="idDueño">Id:</label>
                <input type="text" id="idCliente" name="txtIdClienteEditar" required>
                <button type="submit">Editar Cliente</button>
            </form>
        </div>

    </body>
</html>




