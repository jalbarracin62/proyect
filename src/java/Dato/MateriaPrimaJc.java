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
public class MateriaPrimaJc extends MedidasJc {

    private int idMateriaP;

    public MateriaPrimaJc() {
    }

    public MateriaPrimaJc(int idMateriaP, int Ancho, int Alto, int Grosor, int Cantidad) {
        super(Ancho, Alto, Grosor, Cantidad);
        this.idMateriaP = idMateriaP;
    }

    public int getIdMateriaP() {
        return idMateriaP;
    }

    public void setIdMateriaP(int idMateriaP) {
        this.idMateriaP = idMateriaP;
    }

    @Override
    public String toString() {
        return "MateriaPrimaJc{" + "idMateriaP=" + idMateriaP + '}';
    }

}
