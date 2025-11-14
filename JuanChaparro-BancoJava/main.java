public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cuenta c1 = new Cuenta("001", "Juan", 1000);
        Cuenta c2 = new Cuenta("002", "Maria", 500);

        banco.agregarCuenta(c1);
        banco.agregarCuenta(c2);

        c1.depositar(200);
        c2.retirar(50);
        banco.transferir("001", "002", 100);
        c1.aplicarInteres(5);

        c1.mostrarHistorial();
        c2.mostrarHistorial();
    }
}