import java.util.HashMap;
import java.util.Scanner;

public class GestionAlumnos {
    public static void main(String[] args) {
        HashMap<String, String> alumnos = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {//Inicio de Menú Do-While
            System.out.println("\n GESTIÓN DE ALUMNOS ");
            System.out.println("1. Ingresar alumno");
            System.out.println("2. Buscar alumno");
            System.out.println("3. Eliminar alumno");
            System.out.println("4. Mostrar todos los alumnos");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            switch (opcion) {//Inicio Switch
                case 1://Depende que opcion elija el usuario se presentan los siguientes casos
                    System.out.print("Ingrese el carnet del alumno: ");
                    String carnet = scanner.nextLine();
                    System.out.print("Ingrese el nombre completo del alumno: ");
                    String nombre = scanner.nextLine();
                    alumnos.put(carnet, nombre);
                    System.out.println("Alumno ingresado exitosamente.");
                    break;

                case 2:
                    System.out.print("Ingrese el carnet del alumno a buscar: ");
                    String buscarCarnet = scanner.nextLine();
                    if (alumnos.containsKey(buscarCarnet)) {
                        System.out.println("Alumno encontrado: " + alumnos.get(buscarCarnet));
                    } else {
                        System.out.println("No se puede encontrar el alumno.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el carnet del alumno a eliminar: ");
                    String eliminarCarnet = scanner.nextLine();
                    if (alumnos.remove(eliminarCarnet) != null) {
                        System.out.println("Alumno eliminado correctamente.");
                    } else {
                        System.out.println("Alumno no encontrado, no se puede eliminar.");
                    }
                    break;

                case 4:
                    System.out.println("\n Lista de alumnos:");
                    if (alumnos.isEmpty()) {
                        System.out.println("No hay alumnos registrados.");
                    } else {
                        alumnos.forEach((carnetAlumno, nombreAlumno) -> 
                            System.out.println("Carnet: " + carnetAlumno + " | Nombre: " + nombreAlumno)
                        );
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }
}
