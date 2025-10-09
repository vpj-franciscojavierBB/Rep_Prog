/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9.t3;

import java.util.Scanner;

/**
 *
 * @author Jav1e7
 */
public class Ejercicio9T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
          Scanner entrada = new Scanner(System.in);
 
        System.out.print("Por favor, introduzca el primer numero: ");// Pedir los cuatro números
        int a = entrada.nextInt();

        System.out.print("Introduzca un segundo numero: ");
        int b = entrada.nextInt();

        System.out.print("Introduzca el tercer numero: ");
        int c = entrada.nextInt();

        System.out.print("Intruduzca el ultimo numero: ");
        int d = entrada.nextInt();
        
        int numeros;// Ordenar los números 

        if (a > b) { numeros = a; a = b; b = numeros; }
        if (a > c) { numeros = a; a = c; c = numeros; }
        if (a > d) { numeros = a; a = d; d = numeros; }
        if (b > c) { numeros = b; b = c; c = numeros; }
        if (b > d) { numeros = b; b = d; d = numeros; }
        if (c > d) { numeros = c; c = d; d = numeros; }

        System.out.println("El orden es  " + a + " - " + b + " - " + c + " - " + d);
    
        // TODO code application logic here
    }
    
}
