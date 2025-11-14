import java.util.ArrayList;
import java.util.List;

public class Cuenta {
    private String numeroCuenta;
    private String titular;
    private double saldo;
    private List<String> historial;

    public Cuenta(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
        this.historial = new ArrayList<>();
    }

    public void depositar(double monto) {
        saldo += monto;
        historial.add("Depósito: +" + monto);
    }

    public void retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            historial.add("Retiro: -" + monto);
        } else {
            historial.add("Error: fondos insuficientes para retirar " + monto);
        }
    }

    public void aplicarInteres(double porcentaje) {
        double interes = saldo * (porcentaje / 100);
        saldo += interes;
        historial.add("Interés aplicado: +" + interes);
    }

    public void mostrarHistorial() {
        System.out.println("Historial de la cuenta " + numeroCuenta + ":");
        for (String registro : historial) {
            System.out.println(registro);
        }
        System.out.println("Saldo actual: " + saldo);
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}