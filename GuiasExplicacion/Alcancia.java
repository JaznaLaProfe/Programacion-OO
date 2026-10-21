package e2;

public class Alcancia {
    public String nombreDuenio;
    public double saldo;
    public boolean estaRota;

    // Constructor por defecto
    public Alcancia() {
        this.nombreDuenio = "Anónimo";
    }

    // Constructor sobrecargado 1
    public Alcancia(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    // Constructor sobrecargado 2
    public Alcancia(String nombreDuenio, double saldoInicial) {
        this.nombreDuenio = nombreDuenio;
        if (saldoInicial > 0) {
            this.saldo = saldoInicial;
        }
    }
    public boolean estaRota() {
        return this.estaRota;
    }
    public void depositar(double monto) {
        if (!this.estaRota && monto > 0) {
            this.saldo += monto;
        }
    }
    public double romperYVaciar() {
        if (!this.estaRota) {
            this.estaRota = true;
            double total = this.saldo; this.saldo = 0.0;
            return total;
        }
        return 0.0;
    }
    public String toString() {
        return "Alcancía de " + this.nombreDuenio +
                " | Saldo: $" + this.saldo +
                " | Estado: " + (this.estaRota ? "ROTA" : "INTACTA");
    }
}
