/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jazna.conceptosoo.equals;

/**
 *
 * @author Jazna
 */
public class Superheroe {
    /* Atributos */
    public String nombre;
    public int popularidad;
    
    public Superheroe(String nombre, int popularidad){
        this.nombre = nombre;
        this.popularidad = popularidad;
    }
    
    @Override
    public String toString(){
        return "[" + this.nombre + "]";
    }
    
    @Override
    public boolean equals(Object otro){
        if (otro instanceof Superheroe s){
            return this.nombre.equalsIgnoreCase(s.nombre)
                    && this.popularidad == s.popularidad;
        }
        return false;
    }
}
