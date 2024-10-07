import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menuCola();
    }


    public static void menuCola() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero de citas: ");
        int capacidad = scanner.nextInt();
        Cola cola = new Cola(capacidad);

        while (true) {
            System.out.println("\n1. Agregar Paciente: ");
            System.out.println("2. Paciente atendido: ");
            System.out.println("3. Mostrar pacientes en espera: ");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el NSS del paciente: ");
                    String nss = scanner.next();
                    try {
                        cola.encolar(nss);
                        System.out.println("El paciente " + nss + " ha sido registrado exitosamente!!! ");
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        String elementoDesencolado = cola.desencolar();
                        System.out.println(elementoDesencolado + " El paciente " + elementoDesencolado + "ha sido atendido.");
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    cola.mostrarCola();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
//Ángel Gabriel Guzmán Ramírez
//Jimena Hernández Luna
//Luis Manuel Pérez González
