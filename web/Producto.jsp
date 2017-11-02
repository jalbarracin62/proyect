<%-- 
    Document   : Producto
    Created on : 30/10/2017, 09:14:20 PM
    Author     : Juan Albarracin
--%>

<%-- 
    Document   : Cliente
    Created on : 21/10/2017, 08:19:55 PM
    Author     : Mario-Bx
--%>
<%@page import="Dato.ClienteJc"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Add new Squemas</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum.scale=1.0">
        <link rel="stylesheet" href="ui/Css/MenuDesplegableSub.css">
        <link rel="stylesheet" href="ui/Css/Etilo Fomulario.css">
    </head>

    <body>
        <div id="Centrar">
            <div id="Telon" align="center">
                <div class="Menu">
                    <a href="Cliente.jsp"></a>
                    <header class="Menu_Des">
                        <input type="checkbox" id="btn_Menu">
                        <label for="btn_Menu"> <img class="icon"  src="ui/Imagenes/menu-icon.png"></label>
                        <div class="Menu">
                            <header class="Menu_Des">
                                <input type="checkbox" id="btn_Menu">
                                <label for="btn_Menu"> <img class="icon"  src="ui/Imagenes/menu-icon.png"></label>
                                <nav class="MenuCss">
                                    <ul>
                                        <li><a href="index.jsp"><span class="uno"><img class="icon" src="ui/Imagenes/icon1.png" /></span>Inicio</a></li>
                                        <li><a href="Cliente.jsp"><span class="dos"><img class="icon" src="ui/Imagenes/Esquema.png" /> </span>Cleinte</a></li>
                                        <li><a href=""><span class="tres"><img class="icon" src="ui/Imagenes/Database-Table-icon.png" /> </span>Tablas</a></li>
                                        <li><a href=""><span class="cuatro"><img class="icon" src="ui/Imagenes/Columna.png" /> </span>Columnas</a></li>
                                    </ul>
                                </nav>
                            </header>                
                        </div>
                    </header>                
                </div>

                <div class="form-style-5">
                    <%
                        ClienteJc newSquema = (ClienteJc) request.getAttribute("frmAddSquema");
                        if (request.getParameter("action").equals("incertarAc")) {
                    %>
                    <form method="POST" action='ClienteClontroller' name="frmAddUser">
                        Cliente ID : <input type="text" readonly="readonly" name="clienteIdHtml"/>
                        <br /> 
                        Cedula del Cliente : <input type="text" name="cedulaHtml"/>
                        <br /> 
                        Nombre Cliente : <input type="text" name="nombreHtml"/>
                        <br />
                        Apellido del Cliente : <input type="text" name="ApellidoHtml"/>
                        <br />
                        Nivel del cliente : <input type="text" name="nivelHtml"/>
                        <br /> 
                        Total compras : <input type="text" name="totalHtml"/>
                        <br />
                        <input type="submit" value="Insertar" />
                    </form>
                    <%
                    } else if ((request.getParameter("action").equals("edit"))) {
                        ClienteJc Squemas = (ClienteJc) request.getAttribute("Cliente");
                    %>
                    <form method="POST" action='ClienteClontroller' name="frmAddSquema">
                        Cliente ID : <input type="text" readonly="readonly" name="clienteIdHtml" value="<%=Squemas.getClientID()%>"/>
                        <br /> 
                        Cedula del Cliente : <input type="text" name="cedulaHtml" value="<%=Squemas.getCedula()%>"/>
                        <br /> 
                        Nombre Cliente : <input type="text" name="NombreHtml" value="<%=Squemas.getNombre()%>"/>
                        <br />
                        Apellido del Cliente : <input type="text" name="ApellidoHtml" value="<%=Squemas.getApellido()%>"/>
                        <br />
                        Nivel del cliente : <input type="text" name="nivelHtml" value="<%=Squemas.getNivle()%>"/>
                        <br /> 
                        Total compras : <input type="text" name="totalHtml" value="<%=Squemas.getTotalCompras()%>"/>
                        <br />
                        <input type="submit" value="Editar" />
                    </form>
                    <%
                        }
                    %>
                </div>

            </div>
        </div>

    </body>
</html>

