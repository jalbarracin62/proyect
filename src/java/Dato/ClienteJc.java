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
public class ClienteJc extends PersonaJc {

    private int idCliente;
    private int nivelCliente;
    private int totalComprasCliente;
    ArrayList<CotizacionJc> listaCotizaciones = new ArrayList<CotizacionJc>();

    public ClienteJc() {
    }

    public ClienteJc(int idCliente, int cedula, String nombre, String Apellido, int nivelCliente, int totalComprasCliente) {
        super(cedula, nombre, Apellido);
        this.idCliente = idCliente;
        this.nivelCliente = nivelCliente;
        this.totalComprasCliente = totalComprasCliente;
    }

    public int getClientID() {
        return idCliente;
    }

    public void setClientID(int clientID) {
        this.idCliente = clientID;
    }

    public int getNivle() {
        return nivelCliente;
    }

    public void setNivle(int nivle) {
        this.nivelCliente = nivle;
    }

    public int getTotalCompras() {
        return totalComprasCliente;
    }

    public void setTotalCompras(int totalCompras) {
        this.totalComprasCliente = totalCompras;
    }

    public ArrayList<CotizacionJc> getListacotizaciones() {
        return listaCotizaciones;
    }

    public void setListacotizaciones(ArrayList<CotizacionJc> listacotizaciones) {
        this.listaCotizaciones = listacotizaciones;
    }

    @Override
    public String toString() {
        return "ClienteJc{" + "idCliente=" + idCliente + ", nivelCliente=" + nivelCliente + ", totalComprasCliente=" + totalComprasCliente + ", listaCotizaciones=" + listaCotizaciones + '}';
    }
}
