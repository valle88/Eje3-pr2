package Paquetes.hause;

import Paquetes.DataStructura.GenericFila;
import Paquetes.Utils.RobotUtils;

public class Robot {
    private  String nombre;
    private GenericFila<Producto> almacenamiento = new GenericFila<Producto>();

    public Robot(String nombre){
        this.nombre = nombre;
    }

    public void addProducto(Producto producto){
        almacenamiento.push(producto);
    }

    public int getNumeroProductos(){
        return almacenamiento.getLength();
    }

    public Producto quitarProducto(){
        return almacenamiento.pop();
    }

    public static  Robot generarRobot(){
        String robotNombre = RobotUtils.generarNombreRobot();

        Robot nuevoRobot = new Robot(robotNombre);

        int numeroProducto = (int) (Math.random()* 5) +1;

        for (int i = 0; i < numeroProducto; i++) {
            nuevoRobot.addProducto(Producto.generateProducto());

        }
        return nuevoRobot;
    }
    public String getNombre(){
        return nombre;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
