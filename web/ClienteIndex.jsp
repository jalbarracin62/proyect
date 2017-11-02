<%-- 
    Document   : ClienteIndex
    Created on : 21/10/2017, 05:36:58 PM
    Author     : Mario-Bx
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio Cliente</title>
    </head>
    <body>
        <jsp:forward page="/ClienteClontroller?action=ListarClientesAC" />
    </body>
</html>
