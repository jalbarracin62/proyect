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
public class PersonaJc {

    private int cedula;
    private String nombre;
    private String Apellido;

    public PersonaJc() {
    }

    public PersonaJc(int cedula, String nombre, String Apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.Apellido = Apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    @Override
    public String toString() {
        return "PersonaJc{" + "cedula=" + cedula + ", nombre=" + nombre + ", Apellido=" + Apellido + '}';
    }

}
