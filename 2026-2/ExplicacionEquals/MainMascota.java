package equals;

public class MainMascota {
    public static void main() {
        Mascota mx = new Mascota();
        Mascota my = new Mascota("mefistofeles", 2);
        Mascota mz = new Mascota("mefistofeles", 20);

        //System.out.println(mx.equals(my));
        System.out.println(mz.equals(my));

        System.out.println(mz);

    }
}
