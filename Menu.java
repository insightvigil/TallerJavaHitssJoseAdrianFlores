//Ejercicio tarea 14/08/2025
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalVentas = 0;
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Registrar un pedido");
            System.out.println("2. Mostrar el total de ventas");
            System.out.println("3. Salir del sistema");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el precio del pedido: ");
                    double precio = sc.nextDouble();
                    if (precio > 0) {
                        totalVentas += precio;
                        System.out.println("Pedido registrado con éxito.");
                    } else {
                        System.out.println("Error: el precio debe ser positivo.");
                    }
                    break;

                case 2:
                    System.out.println("Total de ventas: $" + totalVentas);
                    break;

                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 3);

        sc.close();
    }
}
