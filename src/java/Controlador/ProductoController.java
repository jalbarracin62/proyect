/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.ProductoDao;
import Dato.ProductoJc;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mario-Bx
 */
public class ProductoController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static String INSERT_OR_EDIT = "/Producto.jsp";
    private static String LIST_USER = "/ProductoLista.jsp";
   private ProductoDao dao;

    public ProductoController() {
        super();
        dao = new ProductoDao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward = "";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")) {
            System.out.println("Entro a la accion eliminar");
            int clienteId = Integer.parseInt(request.getParameter("ClienteID"));
            dao.deleteProducto(clienteId);
            forward = LIST_USER;
            ///primero va la tabla de sql
            request.setAttribute("ClienteBD", dao.getAllClientes());
            System.out.println(" Realizo la accion de eliminar");
        } else if (action.equalsIgnoreCase("edit")) {
            forward = INSERT_OR_EDIT;
            int clienteID = Integer.parseInt(request.getParameter("ClienteID"));
          // ProductoJc newCliente = dao.getClienteById(clienteID);
          //  request.setAttribute("Cliente", newCliente);
        } else if (action.equalsIgnoreCase("ListarClientesAC")) {
            forward = LIST_USER;
            request.setAttribute("ClienteBD", dao.getAllClientes());
        } else {
            forward = INSERT_OR_EDIT;
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProductoJc newCliente = new ProductoJc();
        newCliente.setIdProducto(Integer.parseInt(request.getParameter("cedulaHtml")));
         newCliente.setAlto(Integer.parseInt(request.getParameter("altoHtml")));
       
        newCliente.setAncho(Integer.parseInt(request.getParameter("anchoHtml")));
       newCliente.setCantidad(Integer.parseInt(request.getParameter("cantidadHtml")));
      newCliente.setIdFKCotizacion(Integer.parseInt(request.getParameter("fkcotizacionHtml")));
      
        String clienteid = request.getParameter("clienteIdHtml");

        if (clienteid == null || clienteid.isEmpty()) {
            dao.addCliente(newCliente);
        } else {
            newCliente.setIdProducto(Integer.parseInt(clienteid));
            int clienteId = Integer.parseInt(request.getParameter("productoHtml"));
            dao.updateCliente(newCliente, clienteId);
        }
        RequestDispatcher view = request.getRequestDispatcher(LIST_USER);
        request.setAttribute("ProductoBD", dao.getAllClientes());
        view.forward(request, response);
    }
}
