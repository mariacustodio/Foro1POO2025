package javaapplication3;

import java.util.ArrayList;
import java.util.List;

public class JavaApplication3 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>(); // 1- declaracion y creacion de una lista tipo cadena
        nombres.add("Steven"); // 2- assigno los valores usando add
        nombres.add("Rodrigo");
        
        System.out.println("Lista de nombres: " + nombres);
         nombres.add(1, "Carlos"); // agrego valor en una posicion especifica
         System.out.println("Lista después de insertar 'Carlos': " + nombres);
         //3-  Eliminar por índice (elimina el valor en la posición 1)
        nombres.remove(1); // Elimina "Carlos"
        System.out.println("Lista después de eliminar el elemento en índice 1: " + nombres);

        nombres.remove("Steven"); // Elimina "Steven"
        System.out.println("Lista después de eliminar 'Steven': " + nombres);

        // Eliminar todos los elementos
        nombres.clear(); // Vacia la lista
        System.out.println("Lista después de vaciarla con clear(): " + nombres);
    }
}
