/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg21.t3;
import java.util.Scanner;
/** 
 *
 * @author Jav1e7
 */
public class Ejercicio21T3 {

    /** 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner (System.in);
            int n1;
        System.err.println("Introduce el primer numero:");
        n1 = entrada.nextInt();
    
            int n2;
        System.err.println("Introduce el segundo numero");
        n2 = entrada.nextInt();
        int c = 0;
        
        try {
            c=n1/n2;
        }
        catch (ArithmeticException e) {
                    System.err.println("Error"+e.getMessage());
                    c=0;
        }                    
        System.err.println("Resultado: " + c);
            
        
    }
        
        
    
        // TODO code application logic here
    }
    

