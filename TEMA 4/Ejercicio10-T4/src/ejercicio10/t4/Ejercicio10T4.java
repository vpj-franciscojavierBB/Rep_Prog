/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10.t4;

import java.util.Scanner;

/**
 *
 * @author Jav1e7
 */
public class Ejercicio10T4 {

    // Método para pedir el número al usuario
    public static int pedirNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero para ver su tabla de multiplicar: ");
        int numero = scanner.nextInt();
        return numero;
    }

    // Método para imprimir solo los resultados numéricos
    public static void imprimirTabla(int numero) {
        System.out.println("Resultados de la tabla del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero * i);
        }
    }

    // Método principal
    public static void main(String[] args) {
        int numero = pedirNumero();
        imprimirTabla(numero);
    }
}

