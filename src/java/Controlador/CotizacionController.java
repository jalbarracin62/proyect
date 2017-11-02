package Controlador;

import DAO.CotizacionDao;
import Dato.CotizacionJc;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Juan Albarracin
 */
public class CotizacionController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static String INSERT_OR_EDIT = "/Cotizacion.jsp";
    private static String LIST_USER = "/CotizacionLista.jsp";
    private CotizacionDao dao;
    

    public CotizacionController() {
        super();
        dao = new CotizacionDao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward = "";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")) {
            System.out.println("Entro a la accion eliminar");
            int cotizacionId = Integer.parseInt(request.getParameter("CotizacionID"));
            dao.deleteCotizacion(cotizacionId);
            forward = LIST_USER;
            ///primero va la tabla de sql
            request.setAttribute("CotizacionBD", dao.getAllCotizaciones());
            System.out.println(" Realizo la accion de eliminar");
        } else if (action.equalsIgnoreCase("edit")) {
            forward = INSERT_OR_EDIT;
            int clienteID = Integer.parseInt(request.getParameter("ClienteID"));
           // CotizacionJc newCotizacion = dao.getCotizacionById(cotizacionID);
            //request.setAttribute("Cotizacion", newCotizacion);
        } else if (action.equalsIgnoreCase("ListarClientesAC")) {
            forward = LIST_USER;
            request.setAttribute("ClienteBD", dao.getAllCotizaciones());
        } else {
            forward = INSERT_OR_EDIT;
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CotizacionJc newCliente = new CotizacionJc();
        
       // newCliente.setFechaCotizacion(.parseInt(request.getParameter("cedulaHtml")));
        newCliente.setIdFKCliente(Integer.parseInt((request.getParameter("nombreHtml"))));
       

        String clienteid = request.getParameter("clienteIdHtml");

        if (clienteid == null || clienteid.isEmpty()) {
            dao.addCotizacion(newCliente);
        } else {
            newCliente.setCotizacionN(Integer.parseInt(clienteid));
            int clienteId = Integer.parseInt(request.getParameter("clienteIdHtml"));
            dao.updateCliente(newCliente, clienteId);
        }
        RequestDispatcher view = request.getRequestDispatcher(LIST_USER);
        request.setAttribute("ClienteBD", dao.getAllCotizaciones());
        view.forward(request, response);
    }
}
