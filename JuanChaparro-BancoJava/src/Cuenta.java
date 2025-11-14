public class Cuenta {
    private String titular;
    private double saldo;

    public Cuenta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: El monto debe ser mayor que cero.");
            return;
        }
        saldo += monto;
        System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: El monto debe ser mayor que cero.");
            return;
        }
        if (monto > saldo) {
            System.out.println("Error: Fondos insuficientes.");
            return;
        }
        saldo -= monto;
        System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
    }

    // Nueva funcionalidad 1: Transferencia
    public void transferir(Cuenta destino, double monto) {
        if (destino == null) {
            System.out.println("Error: La cuenta destino no existe.");
            return;
        }
        if (monto <= 0) {
            System.out.println("Error: El monto debe ser mayor que cero.");
            return;
        }
        if (monto > saldo) {
            System.out.println("Error: Fondos insuficientes para transferir.");
            return;
        }

        this.retirar(monto);
        destino.depositar(monto);
        System.out.println("Transferencia de " + monto + " realizada a " + destino.getTitular());
    }

    // Nueva funcionalidad 2: Aplicar interés
    public void aplicarInteres(double porcentaje) {
        if (porcentaje < 0) {
            System.out.println("Error: El interés no puede ser negativo.");
            return;
        }

        double interes = saldo * (porcentaje / 100);
        saldo += interes;
        System.out.println("Interés aplicado (" + porcentaje + "%). Nuevo saldo: " + saldo);
    }
}