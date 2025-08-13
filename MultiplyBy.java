// Ejercicio 00 - Multiplicacion
import java.util.Scanner;

public class MultiplyBy {
    public static void main(String[] args) {
        int a, b;
        int resultado = 0;
        boolean isNegative = false;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insert number a: ");
        a = entrada.nextInt();

        System.out.print("Insert number b: ");
        b = entrada.nextInt();

        if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
            isNegative = true;
        }

        a = Math.abs(a);
        b = Math.abs(b);

        for (int i = 0; i < b; i++) {
            resultado += a;
        }

        if (isNegative) {
            resultado = -resultado;
        }
        
        System.out.println("Result: " + resultado);
    }
}


