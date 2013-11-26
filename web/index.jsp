<%-- 
    Document   : index
    Created on : 12-nov-2013, 7:01:20 Hola!!
    Author     : laboratorio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="LoginUsuario" method="post">
            <fieldset><legend>Hotel California Express</legend><br />
                Usuario:      <input type="text" name="username"><br /><br />
                Contraseña:   <input type="password" name="password"><br /><br />
                <input type="submit" name="Ingresar" value="Ingresar" class="botones">
            </fieldset>
        </form>
    </body>
</html>
