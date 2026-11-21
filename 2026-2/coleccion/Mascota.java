package colecciones;

public class Mascota {
    public String nombre;
    public int edad;

    public Mascota(){}

    public Mascota(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }


    @Override
    public boolean equals(Object o){
        if (o instanceof Mascota) {
            Mascota m = (Mascota) o;
            return this.nombre.equalsIgnoreCase(m.nombre);
        }
        return false;
    }

    @Override
    public String toString(){
        return "[" + this.nombre + "] de " + this.edad + " anios";
    }
}
