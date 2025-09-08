/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion1;

/**
 *
 * @author Jazna
 */
public class Globo {
    /* Definción de atributos */
    public String color;
    public int tamano;
    /* Definición de constructor */
    public Globo(String color, int tamano){
        this.color = color;
        this.tamano = tamano;
    }
    /* Definición de métodos */
    public boolean desinflar(){
        /* Verifica si el tanño dle globo */
        if (this.tamano != 0){
            this.tamano = 0;
            return true;
        }
        return false;
    }
    
    public boolean pintar(String nuevoColor){
        /* Verifica si el globo se encuentra inflado */
        if (this.tamano != 0){
            this.color = nuevoColor;
            return true;
        }
        return false;
    }
}
