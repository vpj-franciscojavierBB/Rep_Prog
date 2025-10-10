/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2.t3;
        
import java.util.Scanner;       
/**
 *
 * @author Jav1e7
 */
public class Ejercicio2T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
        int num1;
    System.out.println("Por favor, introduzca un numero: ");
    
    num1 = entrada.nextInt();
    
        int num2;
    System.out.println("Ahora, introduzca un segundo numero: ");
    
    num2 = entrada.nextInt();
    
    if (num1 > 10) {
        int producto = num1 * num2;
        System.out.println("La operacion que se realizo es producto y el resultado es: " + producto );
        
    } else {
        int suma = num1 + num2;
        System.out.println("La operacion que se realizo es suma y el resultado es: "+ suma );
        }
    







// TODO code application logic here
    }
    
}
