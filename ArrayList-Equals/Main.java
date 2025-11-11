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
        Arma a = new Arma("Rayo laser", 9);
        Arma b = new Arma("Cuchillo mortal", 15);
        
        System.out.println("Estado del objeto: " + a);
        System.out.println("Estado del objeto: " + b);
        
        System.out.println("Equals " + a.equals(b));
        
        Arsenal ax = new Arsenal();
        System.out.println("Agregar arma 1? " + ax.agregarArma(a));
        System.out.println("Agregar arma 2? " + ax.agregarArma(b));
        
        /* Imprime el contenido del arsenal */
        System.out.println("----\nContenido del arsenal");
        for(Arma alguna : ax.armas){
            System.out.println(alguna);
        }
        
        int umbral_minimo = 5, umbral_maximo = 20;
        
        System.out.println("Armas con poder de daño entre " +
                umbral_minimo + " y " + umbral_maximo + " es " + 
                ax.cantidadUmbral(umbral_minimo, umbral_maximo));
    }
}
