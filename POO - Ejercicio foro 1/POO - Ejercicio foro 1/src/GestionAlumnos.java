import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GestionAlumnos {
    private static Map<String, String> alumnos = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Ingresar alumno");
            System.out.println("2. Buscar alumno");
            System.out.println("3. Eliminar alumno");
            System.out.println("4. Mostrar todos los alumnos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    ingresarAlumno();
                    break;
                case 2:
                    buscarAlumno();
                    break;
                case 3:
                    eliminarAlumno();
                    break;
                case 4:
                    mostrarAlumnos();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 5);
    }

    private static void ingresarAlumno() {
        System.out.print("Ingrese el carnet del alumno: ");
        String carnet = scanner.nextLine();
        System.out.print("Ingrese el nombre completo del alumno: ");
        String nombre = scanner.nextLine();
        alumnos.put(carnet, nombre);
        System.out.println("Alumno ingresado exitosamente.");
    }

    private static void buscarAlumno() {
        System.out.print("Ingrese el carnet del alumno a buscar: ");
        String carnet = scanner.nextLine();
        if (alumnos.containsKey(carnet)) {
            System.out.println("Alumno encontrado: " + alumnos.get(carnet));
        } else {
            System.out.println("Alumno no encontrado, no se puede Mostrar.");
        }
    }

    private static void eliminarAlumno() {
        System.out.print("Ingrese el carnet del alumno a eliminar: ");
        String carnet = scanner.nextLine();
        if (alumnos.containsKey(carnet)) {
            alumnos.remove(carnet);
            System.out.println("Alumno eliminado exitosamente.");
        } else {
            System.out.println("Alumno no encontrado, no se puede Eliminar.");
        }
    }

    private static void mostrarAlumnos() {
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
        } else {
            System.out.println("\nLista de Alumnos:");
            for (Map.Entry<String, String> entry : alumnos.entrySet()) {
                System.out.println("Carnet: " + entry.getKey() + " - Nombre: " + entry.getValue());
            }
        }
    }
}