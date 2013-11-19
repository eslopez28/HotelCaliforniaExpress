<%-- 
    Document   : index
    Created on : 12-nov-2013, 7:01:20
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
        <a href="sgldij"> <input type="button"> </a>
        
        <%   //Borrar cuando se haga el login!!!  %>
        <h1><% response.sendRedirect("testMantenimiento"); %></h1>
        
    </body>
</html>
