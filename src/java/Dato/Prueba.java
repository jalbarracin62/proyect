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
public class Prueba {

    public static void main(String[] args) {
        ClienteJc newCleinte = new ClienteJc(1, 1018460477, "Mario", "bolaños", 1, 98876);

     //   CotizacionJc newCotizacion = new CotizacionJc(1, 1, "21/10/2017", 23456, 1, 2, 3, 4, 5);
        System.out.println(newCleinte.toString() + newCleinte.getApellido());

    }

}
