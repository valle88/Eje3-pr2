package Paquetes.hause;


import Paquetes.Utils.RobotUtils;

public class Producto {
    private String nombre;
    private  float precio;

    public Producto(String nombre, float precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
    public static Producto generateProducto(){
        String productoNombre = RobotUtils.generarNombreProducto();
        float productoPrecio = (float) RobotUtils.generarNumeroAleatorio(200);
        return new Producto(productoNombre,productoPrecio);
    }
}
