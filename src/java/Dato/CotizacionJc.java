/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dato;

import java.util.*;

/**
 *
 * @author Mario-Bx
 */
public class CotizacionJc extends MedidasJc {

    private int iDCotizacion;
    private int numeroCotizacion;
    private Date fechaCotizacion;
    private int precioCotizacion;
    private int idFKCliente;
    ArrayList<ProductoJc> listaProductos = new ArrayList<ProductoJc>();

    public CotizacionJc() {
    }

    public CotizacionJc(int otizacionProductoID, int cotizacionN, Date fechaCotizacion, int precioCotizacion, int idFKCliente, int Ancho, int Alto, int Grosor, int Cantidad) {
        super(Ancho, Alto, Grosor, Cantidad);
        this.iDCotizacion = otizacionProductoID;
        this.numeroCotizacion = cotizacionN;
        this.fechaCotizacion = fechaCotizacion;
        this.precioCotizacion = precioCotizacion;
        this.idFKCliente = idFKCliente;
    }

    public int getOtizacionProductoID() {
        return iDCotizacion;
    }

    public void setOtizacionProductoID(int otizacionProductoID) {
        this.iDCotizacion = otizacionProductoID;
    }

    public int getCotizacionN() {
        return numeroCotizacion;
    }

    public void setCotizacionN(int cotizacionN) {
        this.numeroCotizacion = cotizacionN;
    }

    public Date getFechaCotizacion() {
        return fechaCotizacion;
    }

    public void setFechaCotizacion(Date fechaCotizacion) {
        this.fechaCotizacion = fechaCotizacion;
    }

    public int getPrecioCotizacion() {
        return precioCotizacion;
    }

    public void setPrecioCotizacion(int precioCotizacion) {
        this.precioCotizacion = precioCotizacion;
    }

    public int getIdFKCliente() {
        return idFKCliente;
    }

    public void setIdFKCliente(int idFKCliente) {
        this.idFKCliente = idFKCliente;
    }

    public ArrayList<ProductoJc> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<ProductoJc> listaProductos) {
        this.listaProductos = listaProductos;
    }

    @Override
    public String toString() {
        return "CotizacionJc{" + "otizacionProductoID=" + iDCotizacion + ", cotizacionN=" + numeroCotizacion + ", fechaCotizacion=" + fechaCotizacion + ", precioCotizacion=" + precioCotizacion + ", idFKCliente=" + idFKCliente + ", listaProductos=" + listaProductos + '}';
    }

}
