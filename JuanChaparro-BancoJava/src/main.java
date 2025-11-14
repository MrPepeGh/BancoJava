public class Main {
    public static void main(String[] args) {
        // Crear dos cuentas de ejemplo
        Cuenta cuenta1 = new Cuenta("Juanes", 1000);
        Cuenta cuenta2 = new Cuenta("Camila", 500);

        System.out.println("=== Operaciones de cuenta ===");

        // Operaciones básicas
        cuenta1.depositar(200);
        cuenta1.retirar(100);

        // Nueva funcionalidad 1: Transferencia
        cuenta1.transferir(cuenta2, 300);

        // Nueva funcionalidad 2: Aplicar interés
        cuenta1.aplicarInteres(5);

        // Mostrar saldos finales
        System.out.println("\nSaldo final de " + cuenta1.getTitular() + ": " + cuenta1.getSaldo());
        System.out.println("Saldo final de " + cuenta2.getTitular() + ": " + cuenta2.getSaldo());
    }
}