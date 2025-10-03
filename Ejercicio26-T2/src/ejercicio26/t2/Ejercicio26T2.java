/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26.t2;

/**
 *
 * @author Jav1e7
 */
    import java.util.Scanner;
public class Ejercicio26T2 {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.print("Por favor, introduzca un numero de 4 cifras: ");
    
    Scanner scanner = new Scanner(System.in); 
             
     String numero = scanner.nextLine();
        
        // Comprobar que tiene 4 cifras y que son dígitos
        if (numero.length() == 4 && numero.matches("\\d{4}")) {
            System.out.println("La primera cifra es: " + numero.charAt(0));
            System.out.println("La segunda cifra es: " + numero.charAt(1));
            System.out.println("La tercera cifra es: " + numero.charAt(2));
            System.out.println("La cuarta cifra es: " + numero.charAt(3));
        } else {
            System.out.println("Error: Debes introducir un número de exactamente 4 cifras.");
        }
        
    
        // TODO code application logic here
    }
    
}
