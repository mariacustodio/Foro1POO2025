import java.util.ArrayList;
import java.util.Collection;

public class CollectionExample {
                                                                                                                                                    public static void main(String[] args) {
        // Declaración de una Collection usando ArrayList
        Collection<String> frutas = new ArrayList<>();

        // Asignar valores a la Collection
        frutas.add("Jocote");
        frutas.add("Mango");
        frutas.add("Sandía");
        frutas.add("Jícama");

        // Mostrar los elementos de la Collection
        System.out.println("Frutas en la colección: " + frutas);

        // Eliminar un valor de la Collection
        frutas.remove("Mango");
        System.out.println("Después de eliminar 'Mango': " + frutas);
    }
}


