<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <link href="css/principal.css" rel="stylesheet">
        <title>Formulario de Mascotas</title>

    </head>
    <body>

        <div class="container">
            <h2>Formulario de Mascotas</h2>
            <form action="SvClientes" method="POST">
                <label for="nombreDueño">NombreDueño:</label>
                <input type="text" id="nombreDueño" name="txtNombreDueno" required>

                <label for="celular">Celular:</label>
                <input type="text" id="celular" name="txtCelular" required>

                <label for="nombreMascota">Nombre de la mascota:</label>
                <input type="text" id="nombreMascota" name="txtNombreMascota" required>

                <label for="raza">Raza:</label>
                <input type="text" id="raza" name="txtRaza" required>

                <label for="observaciones">Observaciones:</label>
                <textarea id="observaciones" name="txtObservaciones"></textarea>
            </form>
            <form action="SvClientes" method="GET">
                <input type="submit" value="Mostrar Tabla">

            </form>
        </div>

    </body>
</html>