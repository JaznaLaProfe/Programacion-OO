/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jazna.conceptosoo.arreglos;

/**
 *
 * @author Jazna
 */
public class Poder {
    public String nombre;
    public float potenciaDestruccion;
    
    @Override
    public String toString(){
        return "{" + this.nombre + " con " + 
                this.potenciaDestruccion + 
                " potencia de destrucción}";
    }
    
    @Override
    public boolean equals(Object otro){
        if (otro instanceof Poder p){
            return this.nombre.equalsIgnoreCase(p.nombre) && 
                this.potenciaDestruccion == p.potenciaDestruccion;
        }
        return false;
    }
}
