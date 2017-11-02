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
public class FacturaJc {

    private int idFacturaProducto;
    private int numeroFactura;
    private String fechaFactura;
    private int totalFactura;
    private int iDFkEmpleado;
    ArrayList<ProductoJc> listaProductos = new ArrayList<ProductoJc>();

    public FacturaJc() {
    }

    public FacturaJc(int idFacturaProducto, int numeroFactura, String fechaFactura, int totalFactura, int iDFkEmpleado) {
        this.idFacturaProducto = idFacturaProducto;
        this.numeroFactura = numeroFactura;
        this.fechaFactura = fechaFactura;
        this.totalFactura = totalFactura;
        this.iDFkEmpleado = iDFkEmpleado;
    }

    public int getIdFacturaProducto() {
        return idFacturaProducto;
    }

    public void setIdFacturaProducto(int idFacturaProducto) {
        this.idFacturaProducto = idFacturaProducto;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public int getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(int totalFactura) {
        this.totalFactura = totalFactura;
    }

    public int getiDFkEmpleado() {
        return iDFkEmpleado;
    }

    public void setiDFkEmpleado(int iDFkEmpleado) {
        this.iDFkEmpleado = iDFkEmpleado;
    }

    public ArrayList<ProductoJc> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<ProductoJc> listaProductos) {
        this.listaProductos = listaProductos;
    }

    @Override
    public String toString() {
        return "FacturaJc{" + "idFacturaProducto=" + idFacturaProducto + ", numeroFactura=" + numeroFactura + ", fechaFactura=" + fechaFactura + ", totalFactura=" + totalFactura + ", iDFkEmpleado=" + iDFkEmpleado + ", listaProductos=" + listaProductos + '}';
    }

}
