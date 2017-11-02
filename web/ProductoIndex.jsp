<%-- 
    Document   : ProductoIndex
    Created on : 30/10/2017, 09:14:46 PM
    Author     : Juan Albarracin
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