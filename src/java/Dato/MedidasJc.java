/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dato;

/**
 *
 * @author Mario-Bx
 */
public class MedidasJc {

    private int Ancho;
    private int Alto;
    private int Grosor;
    private int Cantidad;

    public MedidasJc() {
    }

    public MedidasJc(int Ancho, int Alto, int Grosor, int Cantidad) {
        this.Ancho = Ancho;
        this.Alto = Alto;
        this.Grosor = Grosor;
        this.Cantidad = Cantidad;
    }

    public int getAncho() {
        return Ancho;
    }

    public void setAncho(int Ancho) {
        this.Ancho = Ancho;
    }

    public int getAlto() {
        return Alto;
    }

    public void setAlto(int Alto) {
        this.Alto = Alto;
    }

    public int getGrosor() {
        return Grosor;
    }

    public void setGrosor(int Grosor) {
        this.Grosor = Grosor;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    @Override
    public String toString() {
        return "MedidasJc{" + "Ancho=" + Ancho + ", Alto=" + Alto + ", Grosor=" + Grosor + ", Cantidad=" + Cantidad + '}';
    }

}
