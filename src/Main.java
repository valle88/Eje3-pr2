import Paquetes.hause.Deposito;

public class Main {
    public static void main(String[] args) {

        Deposito mialmacen = Deposito.generarDeposito();

        for (int i = 0; i < 5; i++) {
            mialmacen.removeRobot();
        }
    }
}