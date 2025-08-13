//Ejercicio 01 - Número menor
import java.util.Scanner;

public class MinNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("¿Cuántos números quieres comparar? (mínimo 10): ");
        int cantidad = sc.nextInt();

        //Restricción para minímo 10 números
        while (cantidad < 10) {
            System.out.print("Debe ser al menos 10. Ingresa nuevamente: ");
            cantidad = sc.nextInt();
        }

        System.out.print("Ingresa el número 1: ");
        int menor = sc.nextInt();

        
        for (int i = 2; i <= cantidad; i++) {
            System.out.print("Ingresa el número " + i + ": ");
            int num = sc.nextInt();

            if (num < menor) {
                menor = num;
            }
        }

        System.out.println("El número menor es: " + menor);

        if (menor < 10) {
            System.out.println("¡El número menor es menor que 10!");
        } else {
            System.out.println("¡El número menor es igual o mayor que 10!");
        }

        sc.close();
    }
}
