<%-- 
    Document   : CotizacionIndex
    Created on : 30/10/2017, 08:11:10 PM
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
        <jsp:forward page="/CotizacionClontroller?action=ListarClientesAC" />
    </body>
</html>
