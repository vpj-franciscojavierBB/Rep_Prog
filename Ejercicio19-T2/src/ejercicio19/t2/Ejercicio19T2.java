/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19.t2;

/**
 *
 * @author Jav1e7
 */
public class Ejercicio19T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int a = 3, b = 6, c;
    c = a % b;  
    System.out.println("El valor de c es: " + c);
    a++;
    System.out.println("El valor de a es: " + a);
    ++a;
    System.out.println("El valor de a es: " + a);
    c = ++a + b++;
    System.out.println("El valor de a es: " + a);
    System.out.println("El valor de b es: " + b);
    System.out.println("El valor de c es: " + c);
    c = ++a + ++b;
    System.out.println("El valor de a es: " + a);
    System.out.println("El valor de b es: " + b);
    System.out.println("El valor de c es: " + c);
    
    
    
    
    
// TODO code application logic here
    }
    
}
