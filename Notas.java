//Ejercicio 2 13/08/2025

import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        
        double promedioA = 0, promedioR = 0, oneCal = 0, cal, promedio;
        int A = 0,B = 0,C = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor ingrese 20 calificaciones 1 por una: ");

        for(int i=1; i<=20; i++) {
            System.out.print("Ingrese nota " + i +":");
            cal = sc.nextInt();

            if (cal >= 6) {
                A = A + 1;
                promedioA = promedioA + cal;
            }

            else if (cal < 6 && cal > 1) {
                B = B +1;
                promedioR = promedioR + cal;
            }

            else if (cal == 1) {
                C = C + 1;
                oneCal = oneCal + cal;
            }

            else if(cal<0) {
                System.out.println("Error, valor fuera de rango");
                System.exit(A);
            }
            

        }

        if(A > 0 && B > 0 ) {
        System.out.println("El promedio de las notas mayores a 6 es: " + promedioA/A);
        System.out.println("El promedio de las notas menores a 6 es: " + promedioR/B);
        System.out.println("Las calificaciones iguales a 1 son: " + C);
        }

        promedio = (promedioA + promedioR + oneCal) / 20; 
        System.out.println("El promedio final es de: " + promedio);
        

    }
    

    
}


/* 
 * Inputs 20 notas
    Restricciones
    Escala del 1 al 10
    Decimales double

    Outputs
    Promedio de notas mayores o iguales 6

    Promedio de notas inferiores a 6

    cantidad de notas iguales a 1 

    promedio total
 */