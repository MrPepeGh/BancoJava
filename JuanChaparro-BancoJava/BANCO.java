import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Cuenta> cuentas;

    public Banco() {
        cuentas = new ArrayList<>();
    }

    public void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    public void transferir(String origenNum, String destinoNum, double monto) {
        Cuenta origen = buscarCuenta(origenNum);
        Cuenta destino = buscarCuenta(destinoNum);

        if (origen != null && destino != null && origen.getSaldo() >= monto) {
            origen.retirar(monto);
            destino.depositar(monto);
            System.out.println("Transferencia exitosa de " + monto + " entre " + origenNum + " y " + destinoNum);
        } else {
            System.out.println("Error en la transferencia");
        }
    }

    private Cuenta buscarCuenta(String numero) {
        for (Cuenta c : cuentas) {
            if (c.getNumeroCuenta().equals(numero)) {
                return c;
            }
        }
        return null;
    }
}