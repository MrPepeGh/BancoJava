public class Main {
    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta("Juanes", 1000);
        Cuenta cuenta2 = new Cuenta("Camila", 500);

        System.out.println("=== Operaciones de cuenta ===");


        cuenta1.depositar(200);
        cuenta1.retirar(100);

        cuenta1.transferir(cuenta2, 300);

        cuenta1.aplicarInteres(5);

        System.out.println("\nSaldo final de " + cuenta1.getTitular() + ": " + cuenta1.getSaldo());
        System.out.println("Saldo final de " + cuenta2.getTitular() + ": " + cuenta2.getSaldo());
    }

}
