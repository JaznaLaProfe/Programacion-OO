/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion1;

/**
 *
 * @author Jazna
 */
public class MainGlobo {

    public static void main(String[] args) {
        Globo gx = new Globo("azul", 7);
        System.out.println(gx.color);
        System.out.println(gx.tamano);
        boolean resultado = gx.desinflar();
        if (resultado) {
            System.out.println("Globo desinflado con éxito");
        } else {
            System.out.println("No se logra desinflar el Globo");
        }
        System.out.println(gx.tamano);
        /* Intenta volver a desinflar el globo */
        resultado = gx.desinflar();
        if (resultado) {
            System.out.println("Globo desinflado con éxito");
        } else {
            System.out.println("No se logra desinflar el Globo");
        }
    }
}
