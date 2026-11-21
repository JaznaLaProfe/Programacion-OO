package colecciones;

public class MainVeterinaria {
    public static void main() {
        Veterinaria vx = new Veterinaria("Patitas felices");
        Mascota mx = new Mascota("Don gato", 3);
        Mascota my = new Mascota("Don perro", 2);
        Mascota mz = new Mascota("Don gato", 1);
        System.out.println("Cantidad de mascotas en la veterinaria " + vx.nombre + " es " + vx.totalMascotas());
        /* Agregar objetos a la colección */
        boolean respuesta = vx.agregarMascota(mx);
        System.out.println("Agrega a " + mx.nombre + "? " + respuesta);
        respuesta = vx.agregarMascota(my);
        System.out.println("Agrega a " + my.nombre + "? " + respuesta);
        respuesta = vx.agregarMascota(mz);
        System.out.println("Agrega a " + mz.nombre + "? " + respuesta);
        System.out.println("-----");
        System.out.println("Cantidad de mascotas en la veterinaria " + vx.nombre + " es " + vx.totalMascotas());
        System.out.println("Promedio de edad de las mascotas de " + vx.nombre + " es de " + vx.promedioEdad()  + " anios");
    }
}
