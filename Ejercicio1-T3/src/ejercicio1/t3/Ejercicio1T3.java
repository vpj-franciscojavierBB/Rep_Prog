/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1.t3;
import java.util.Scanner;

/**
 *
 * @author Jav1e7
 */
public class Ejercicio1T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);
    
     System.out.print("Por favor, introduzca un numero: ");
    
    double numero = entrada.nextDouble();
        
     if (numero > 0) {
            System.out.println("El numero introducido es positivo.");
        } else if (numero < 0) {
            System.out.println("El numero introducido es negativo.");
        } else {
            System.out.println("El numero introducido es cero.");
        }
        // TODO code application logic here
    }
    
}
