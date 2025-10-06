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
        
        int temp;// Ordenar los números 

        if (a > b) { temp = a; a = b; b = temp; }
        if (a > c) { temp = a; a = c; c = temp; }
        if (a > d) { temp = a; a = d; d = temp; }
        if (b > c) { temp = b; b = c; c = temp; }
        if (b > d) { temp = b; b = d; d = temp; }
        if (c > d) { temp = c; c = d; d = temp; }

        System.out.println("El orden es  " + a + " - " + b + " - " + c + " - " + d);
    
        // TODO code application logic here
    }
    
}
