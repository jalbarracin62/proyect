<%-- 
    Document   : ProductoLista
    Created on : 30/10/2017, 09:15:04 PM
    Author     : Juan Albarracin
--%>

<%@page import="Dato.ClienteJc"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Squemas</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum.scale=1.0">
        <link rel="stylesheet" href="ui/Css/MenuDesplegableSub.css">
        <link rel="stylesheet" href="ui/Css/Etilo Fomulario.css">
    </head>

    <body>
        <div id="Centrar">
            <div id="Telon" align="center">
                <div class="Menu">
                    <header class="Menu_Des">
                        <input type="checkbox" id="btn_Menu">
                        <label for="btn_Menu"> <img class="icon"  src="ui/Imagenes/menu-icon.png"></label>
                        <nav class="MenuCss">
                            <ul>
                                <li><a href="index.jsp"><span class="uno"><img class="icon" src="ui/Imagenes/icon1.png" /></span>Inicio</a></li>
                                <li><a href="ClienteIndex.jsp"><span class="dos"><img class="icon" src="ui/Imagenes/Esquema.png" /> </span>Clientes</a></li>
                                <li><a href=""><span class="tres"><img class="icon" src="ui/Imagenes/Database-Table-icon.png" /> </span>Tablas</a></li>
                                <li><a href=""><span class="cuatro"><img class="icon" src="ui/Imagenes/Columna.png" /> </span>Columnas</a></li>
                            </ul>
                        </nav>
                    </header>                
                </div>


                <div class="form-style-5">
                    <a href="ClienteClontroller?action=incertarAc"><input type="submit" value="Add Cliente"/></a>
                    <table border=1>
                        <thead>
                            <tr>
                                <th>Cliente Id</th>
                                <th>Cedula</th>
                                <th>Nombre</th>
                                <th>Apellido</th>
                                <th>Nivel Del Cliente</th>
                                <th>Total Compras</th>
                                <th colspan=2>Action</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                List<ClienteJc> newCliente = (List<ClienteJc>) request.getAttribute("ClienteBD");
                                if (newCliente != null) {
                                    for (ClienteJc cliente : newCliente) {
                            %>
                            <tr>
                                <td><%=cliente.getClientID()%></td>
                                <td><%=cliente.getCedula()%></td>
                                <td><%=cliente.getNombre()%></td>
                                <td><%=cliente.getApellido()%></td>
                                <td><%=cliente.getNivle()%></td>
                                <td><%=cliente.getTotalCompras()%></td>
                                <td><a href="ClienteClontroller?action=edit&ClienteID=<%=cliente.getClientID() %>">Aatualizar</a></td>
                                <td><a href="ClienteClontroller?action=delete&ClienteID=<%=cliente.getClientID() %>">Eliminar</a></td>
                            </tr>

                            <%
                                    }

                                }

                            %>

                        </tbody>
                    </table>

                </div>

            </div>
        </div>

    </body>
</html>

