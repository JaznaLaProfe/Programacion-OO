/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canal;

/**
 *
 * @author Jazna
 */
public class Arma {

    public String nombre;
    public int puntosDano;

    public Arma(String nombre, int puntosDano) {
        this.nombre = nombre;
        this.puntosDano = puntosDano;
    }

    @Override
    public String toString() {
        return this.nombre + " con " + this.puntosDano + " puntos de daño";
    }

    @Override
    public boolean equals(Object otro) {
        if (otro instanceof Arma) {
            Arma otra_arma = (Arma) otro;
            return this.nombre.equalsIgnoreCase(otra_arma.nombre) &&
                    this.puntosDano == otra_arma.puntosDano; 
        }
        return false;
    }

}
