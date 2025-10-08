/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6.t3;

import java.util.Scanner;

/**
 *
 * @author Jav1e7
 */
public class Ejercicio6T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
        
       
    System.out.print("Introduzca la nota del alumno (0 - 10): ");// Pedir al usuario que introduzca una nota
    
    int nota = entrada.nextInt();
        
     
        if (nota < 0 || nota > 10) {// Comprobar si la nota es válida
            System.out.println("Error: la nota introducida no es válida. Debe estar entre 0 y 10.");
        } else {
            
        if (nota <= 4) {//  rango de la nota
                System.out.println("Suspenso.");
        } else if (nota >= 5 && nota <= 6) {
                System.out.println("Bien.");
        } else if (nota >= 7 && nota <= 8) {
                System.out.println("Notable.");
        } else {
        System.out.println("Sobresaliente.");
    }
        }
        // TODO code application logic here
    }
    
}
