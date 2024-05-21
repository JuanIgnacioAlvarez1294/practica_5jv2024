package practica_5jv2024;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del equipo:");
        String nombreEquipo = scanner.nextLine();

        System.out.println("Ingrese la universidad:");
        String universidad = scanner.nextLine();

        System.out.println("Ingrese el lenguaje de programación:");
        String lenguaje = scanner.nextLine();

        int tamañoEquipo = 0;
        boolean tamañoValido = false;

        // Bucle para asegurar que el tamaño del equipo es válido (2 o 3)
        while (!tamañoValido) {
            try {
                System.out.println("Ingrese el tamaño del equipo (2 o 3):");
                tamañoEquipo = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                if (tamañoEquipo == 2 || tamañoEquipo == 3) {
                    tamañoValido = true;
                } else {
                    System.out.println("Error: El tamaño del equipo debe ser 2 o 3.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número válido.");
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        }

        EquipoProgramacion equipo = new EquipoProgramacion(nombreEquipo, universidad, lenguaje, tamañoEquipo);

        for (int i = 0; i < tamañoEquipo; i++) {
            System.out.println("Ingrese el nombre y apellidos del programador " + (i + 1) + ":");
            String nombreProgramador = scanner.nextLine();

            try {
                equipo.validarNombreApellido(nombreProgramador);
                equipo.añadirProgramador(nombreProgramador);
            } catch (InputMismatchException e) {
                System.out.println("Error: " + e.getMessage());
                i--; // Volver a solicitar los datos del programador
            } catch (IllegalStateException e) {
                System.out.println("Error: " + e.getMessage());
                break;
            }
        }
        
        scanner.close();

        System.out.println("Información del equipo:");
        System.out.println(equipo);
        System.out.println("Lista de programadores:");
        System.out.println(equipo.getProgramadores());
    }
}
