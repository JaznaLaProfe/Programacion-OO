/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canal;

/**
 *
 * @author Jazna
 */
public class Main {
    public static void main(String[] args) {
        Arma a = new Arma("Rayo Laser", 9);
        Arma b = new Arma("Cuchillo mortal", 15);
        System.out.println(a);
        System.out.println(b);
        
        System.out.println(a.equals(b));
        
        Arsenal ax = new Arsenal();
        System.out.println("Arma 1? " + ax.agregarArma(a));
        System.out.println("Arma 1? " + ax.agregarArma(b));
        
        /* Imprime el contenido del arsenal */
        System.out.println("----\nContenido del arsenal\n---");
        for(Arma alguna : ax.armas){
            System.out.println(alguna);
        }
        
        /* Mostrar la cantiad de armas qu cumplen con el requisito del umbral */
        int umbral_minimo = 5, umbral_maximo = 20;
        System.out.println("Hay " + ax.cantidadUmbral(umbral_minimo, umbral_maximo) +
                " armas cuyo poder de daño está dentro de los límites " + 
                umbral_minimo + " y " + umbral_maximo);
    }
}
