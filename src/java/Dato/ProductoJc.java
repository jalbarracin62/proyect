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
public class ProductoJc extends MedidasJc {

    private int idProducto;
    private int idFKCotizacionProducto;
    private int numeroFKCotizacion;
    private int idFKFactura;

    public ProductoJc() {
    }

    public ProductoJc(int idProducto, int idFKCotizacionProducto, int idFKCotizacion, int idFKCotizacionFactuta, int Ancho, int Alto, int Grosor, int Cantidad) {
        super(Ancho, Alto, Grosor, Cantidad);
        this.idProducto = idProducto;
        this.idFKCotizacionProducto = idFKCotizacionProducto;
        this.numeroFKCotizacion = idFKCotizacion;
        this.idFKFactura = idFKCotizacionFactuta;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdFKCotizacionProducto() {
        return idFKCotizacionProducto;
    }

    public void setIdFKCotizacionProducto(int idFKCotizacionProducto) {
        this.idFKCotizacionProducto = idFKCotizacionProducto;
    }

    public int getIdFKCotizacion() {
        return numeroFKCotizacion;
    }

    public void setIdFKCotizacion(int idFKCotizacion) {
        this.numeroFKCotizacion = idFKCotizacion;
    }

    public int getIdFKCotizacionFactuta() {
        return idFKFactura;
    }

    public void setIdFKCotizacionFactuta(int idFKCotizacionFactuta) {
        this.idFKFactura = idFKCotizacionFactuta;
    }

    @Override
    public String toString() {
        return "ProductoJc{" + "idProducto=" + idProducto + ", idFKCotizacionProducto=" + idFKCotizacionProducto + ", idFKCotizacion=" + numeroFKCotizacion + ", idFKCotizacionFactuta=" + idFKFactura + '}';
    }

    public int getprecio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
