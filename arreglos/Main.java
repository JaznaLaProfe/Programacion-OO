/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jazna.conceptosoo.arreglos;

/**
 *
 * @author Jazna
 */
public class Main {
    public static void main(String[] args) {
        /* Crea objetos que representan poderes */
        Poder px = new Poder();
        Poder py = new Poder();
        /* Setea el estado del objeto */
        px.nombre = "Rayo laser";
        px.potenciaDestruccion = 0.6f;
        /* Imprime el objeto */
        System.out.println(px);
        
        py.nombre = "Congelamiento instantáneo";
        py.potenciaDestruccion = 0.7f;
                /* Imprime el objeto */
        System.out.println(py);
        
        /* Crea el objeto que representa al jugador */
        Jugador jx = new Jugador("Neon Flash", 4);
        /* Imprime el objeto */
        System.out.println(jx);
                
        /* Le asigna un poder */
        System.out.println(jx.agregarPoder(px));

        System.out.println(jx.reemplaza(py, 1));
    }
}
