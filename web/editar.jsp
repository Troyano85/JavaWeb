<%@page import="logica.Cliente"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <link href="css/principal.css" rel="stylesheet">
        <title>Formulario de Mascotas</title>

    </head>
    <body>
        <% Cliente client = (Cliente) request.getSession().getAttribute("clienteEditar");  %>

        <div class="container">
            <h2>Datos cliente</h2>
            <form action="SvEditar" method="POST">
                <label for="nombreDueño">Nombre del Dueño:</label>
                <input type="text" id="nombreDueno" name="txtNombreDueno" value="<%=client.getNombreDueno()%>" required>

                <label for="celular">Celular:</label>
                <input type="text" id="celular" name="txtCelular" value="<%=client.getCelular()%>" required>

                <label for="nombreMascota">Nombre de la mascota:</label>
                <input type="text" id="nombreMascota" name="txtNombreMascota" value="<%=client.getNombreMascota()%>" required>

                <label for="raza">Raza:</label>
                <input type="text" id="raza" name="txtRaza" value="<%=client.getRaza()%>" required>

                <label for="observaciones">Observaciones:</label>
                <textarea id="observaciones" name="txtObservaciones" value="<%=client.getObservaciones()%>" ></textarea>
                <button type="submit">Guardar</button>
            </form>

        </div>

    </body>
</html>