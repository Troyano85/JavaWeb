<%-- 
    Document   : index
    Created on : 26/01/2024, 7:42:15 p. m.
    Author     : ferch
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link href="css/estilos.css" rel="stylesheet">
        <title>Login </title>
       
    </head>
    <body>

        <div class="login-container">
            <img src="img/logo.png" alt=""/>
            <h2>Iniciar Sesión</h2>
            <form  action="SvValidar" method="POST">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Nombre de usuario" required name="txtUser">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" placeholder="Contraseña" required name="txtPass">
                </div>
                <button type="submit" name="accion" value="ingresar" class="btn btn-primary btn-block">Iniciar Sesión</button>
            </form>
        </div>

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.8/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </body>

</html>
