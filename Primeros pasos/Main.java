/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jazna.conceptosoo.sesion1;

/**
 *
 * @author Jazna
 */
public class Main {

    public static void main(String[] args) {
        /* Declara el objeto */
        Vehiculo v;
        /* Crea el objeto */
        //v = new Vehiculo("CDRT-56");
        v = new Vehiculo();
        /* Imprime el valor de la patente */
        System.out.println("Patente " + v.patente);
        System.out.println("Kilometraje " + v.kilometraje);
        /* Modifica la patente del vehículo */
        v.patente = "JFXL-23";
        /* Modifica el kilometraje del vehiculo */
        v.kilometraje = 36700;
        /* Imprime el estado del objeto */
        System.out.println("Patente " + v.patente);
        System.out.println("Kilometraje " + v.kilometraje);
        
    }
}
