/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27.t3;
import java.util.Scanner;
/**
 *
 * @author Jav1e7
 */


public class Ejercicio27T3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        int opcion;

        System.out.print("Introduce el primer numero: ");
        num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo numero: ");
        num2 = scanner.nextDouble();

        do {
            System.out.println("--- MENU ---");
            System.out.println("1.- Sumar los numeros");
            System.out.println("2.- Restar los numeros");
            System.out.println("3.- Multiplicar los numeros");
            System.out.println("4.- Dividir los numeros");
            System.out.println("5.- Salir del programa");
            System.out.print("Elige una opcion: ");
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
                    if (num2 == 0) {
                        System.out.println("Error: No se puede dividir entre cero.");
                    } else {
                        System.out.println("Resultado de la division: " + (num1 / num2));
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intenta de nuevo.");
            }

        } while (opcion != 5);
    }
}