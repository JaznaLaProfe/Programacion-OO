package e2;

public class MainEjercicio4 {
    public static void main(String[] args) {
        // Creación de objetos usando distintas sobrecargas de constructor
        Alcancia ax = new Alcancia();
        Alcancia ay = new Alcancia("Lucas");
        Alcancia az = new Alcancia("Sofía", 150.50);

        // Operaciones y llamadas a métodos
        ax.depositar(50.0);
        ay.depositar(100.25);
        az.depositar(-20.0);

        // Cambio de estado mediante reglas de negocio
        double retirado = az.romperYVaciar();
        az.depositar(200.0);

        // Impresión final de estados
        System.out.println(ax);
        System.out.println(ay);
        System.out.println(az);
        System.out.println("Monto retirado de a3: $" + retirado);
    }
}
