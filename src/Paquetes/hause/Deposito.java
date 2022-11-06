package Paquetes.hause;

import Paquetes.DataStructura.GeneraQueque;

public class Deposito {
    private String nombre;
    private GeneraQueque<Robot> robotQueque;

    public Deposito(String nombre) {
        this.nombre = nombre;
        robotQueque =  new GeneraQueque<Robot>();
    }

    public void addRobot(Robot robot){
        System.out.println("Añadir Robot: " +robot.getNombre());
        robotQueque.enqueue(robot);
    }

    public Robot removeRobot(){
        Robot robot = robotQueque.dequeue();
        System.out.println("Eliminando robot "+robot.getNombre()+ "del queque");
        while (robot.getNumeroProductos()>0){
            System.out.println("\t" + robot.quitarProducto());
        }
        return  robot;
    }

    public static  Deposito generarDeposito(){
        Deposito miDeposito = new Deposito("Pipolin");
        for (int i = 0; i < 5; i++) {
            miDeposito.addRobot(Robot.generarRobot());

        }
        return miDeposito;
    }
}
