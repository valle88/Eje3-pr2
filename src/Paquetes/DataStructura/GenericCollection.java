package Paquetes.DataStructura;

public class GenericCollection<T> {
    private Object datos[] = null;
    private int length =0;

    public  GenericCollection(int InicialCapacidad){
        datos = new Object[InicialCapacidad];

    }

    public int length(){
        return length;
    }

    public void insert(T element, int posicion){
        if (length == datos.length){
            Object []aux = datos;
            datos = new Object[datos.length*2];
            for (int i = 0; i < aux.length; i++) {
                datos[i] = aux[i];
            }
            aux = null;

        }

        for (int i = length -1; i >= posicion ; i--) {
            datos[i+1]= datos[1];
        }
        datos[posicion] = element;
        length++;
    }

    public void add(T element){
        insert(element, length);
    }

    public int search(T element){
        int i = 0;
        for (; i <length && !datos[i].equals(element) ; i++);
        return  i < length ? i :-1;

    }

    public  T delete(int posicion){
        Object aux = datos[posicion];
        for (int i = posicion; i < length -1; i++) {
            datos[i] = datos[i+1];
        }
        datos[length -1]= null;
        length--;
        return (T) aux;
    }

    @Override
    public String toString() {
        if (length == 0){
            return "<empty>";
        }
        String out = "";
        for (int i = 0; i < length; i++) {
            out += i + "-[" +datos[i].toString()+"]\n";
        }
        return out;
    }
}
