<%-- 
    Document   : CotizacionLista
    Created on : 30/10/2017, 08:10:28 PM
    Author     : Juan Albarracin
--%>

<%@page import="Dato.CotizacionJc"%>
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
                                <li><a href="CotizacionLista"><span class="tres"><img class="icon" src="ui/Imagenes/Database-Table-icon.png" /> </span>Tablas</a></li>
                                <li><a href=""><span class="cuatro"><img class="icon" src="ui/Imagenes/Columna.png" /> </span>Columnas</a></li>
                            </ul>
                        </nav>
                    </header>                
                </div>


                <div class="form-style-5">
                    <a href="CotizacionController?action=incertarAc"><input type="submit" value="Add Cliente"/></a>
                    <table border=1>
                        <thead>
                            <tr>
                                <th>Cotizacion Id</th>
                                <th>fecha </th>
                                <th>fk producto</th>
                                <th colspan=2>Action</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                List<CotizacionJc> newCliente = (List<CotizacionJc>) request.getAttribute("CotizacionBD");
                                if (newCliente != null) {
                                    for (CotizacionJc cliente : newCliente) {
                            %>
                            <tr>
                                <td><%=cliente.getOtizacionProductoID()%></td>
                                <td><%=cliente.getFechaCotizacion()%></td>
                                  <td><%=cliente.getFechaCotizacion()%></td>
                                <td><a href="ClienteClontroller?action=edit&ClienteID=<%=cliente.getOtizacionProductoID()%>">Aatualizar</a></td>
                                <td><a href="ClienteClontroller?action=delete&ClienteID=<%=cliente.getOtizacionProductoID()%>">Eliminar</a></td>
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

