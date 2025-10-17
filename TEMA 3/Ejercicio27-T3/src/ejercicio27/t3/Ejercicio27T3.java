/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27.t3;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Jav1e7
 */


    public class Ejercicio27T3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        int opcion;

        // Solicitar los dos números al usuario
        System.out.print("Introduce el primer numero: ");
        num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo numero: ");
        num2 = scanner.nextDouble();

        // Bucle del menú
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1.- Sumar los numeros");
            System.out.println("2.- Restar los numeros");
            System.out.println("3.- Multiplicar los numeros");
            System.out.println("4.- Dividir los numeros");
            System.out.println("5.- Salir del programa");
            System.out.print("Elige una opción: ");

            try {
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado de la suma: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Resultado de la resta: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Resultado de la multiplicacion: " + (num1 * num2));
                        break;
                    case 4:
                        try {
                            if (num2 == 0) {
                                throw new ArithmeticException("No se puede dividir entre cero.");
                            }
                            System.out.println("Resultado de la division: " + (num1 / num2));
                        } catch (ArithmeticException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    case 5:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no valida. Intenta de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida. Por favor, introduce un numero.");
                scanner.next(); // Limpiar el buffer
                opcion = 0; // Reiniciar opción para continuar el bucle
            }

        } while (opcion != 5);

        scanner.close();
    }
}
