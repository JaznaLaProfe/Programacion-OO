/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canal;

import java.util.ArrayList;

/**
 *
 * @author Jazna
 */
public class Arsenal {
    public ArrayList<Arma> armas;
    
    public Arsenal(){
        this.armas = new ArrayList();
    }
    
    /**
     * Agrega un arma al arsenal validando que no se repitan
     * @param nueva arma que se pretende agregar
     * @return indicador lógico de éxito/fracaso
     */
    public boolean agregarArma(Arma nueva){
        // Verificar que el arma no esté repetida
        if (!this.armas.contains(nueva)){
            this.armas.add(nueva);
            return true;
        }
        return false;
    }
    
    /**
     * Retorna la cantidad de armas que cumple con el requisito
     * @param minimo valor inicial del umbral
     * @param maximo valor final del umbral
     * @return 
     */
    public int cantidadUmbral(int minimo, int maximo){
        int total = 0;
        for(Arma alguna : this.armas){
            if (alguna.puntosDano >= minimo && alguna.puntosDano <= maximo){
                total += 1;
            }
        }
        return total;
    }
}
