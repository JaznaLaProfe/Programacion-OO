package colecciones;

import java.util.ArrayList;

public class Veterinaria {
    public ArrayList<Mascota> mascotas;
    public String nombre;

    public Veterinaria(String nombre){
        this.nombre = nombre;
        this.mascotas = new ArrayList<>();
    }

    public boolean agregarMascota(Mascota nueva){
        if (!this.mascotas.contains(nueva)){
            this.mascotas.add(nueva);
            return true;
        }
        return false;
    }

    public int totalMascotas(){
        return this.mascotas.size();
    }

    public double promedioEdad(){
        double suma = 0;
        for(Mascota alguna : this.mascotas){
            suma += alguna.edad;
        }
        return (this.mascotas.isEmpty()?0:suma/this.mascotas.size());
    }
}
