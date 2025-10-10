/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16.t2;

/**
 *
 * @author Jav1e7
 */
public class Ejercicio16T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int total = 130;
        int billeteCicuenta = 50;
        int billeteDiez = 10;
       
        int numeroCicuenta = total / billeteCicuenta;
        int loQueMeQueda = total % billeteCicuenta;//Resto de la division
        int numeroDiez = loQueMeQueda / billeteDiez;
        
        System.out.println(total + " euros hacen un total de: " + numeroCicuenta + " billetes de " + billeteCicuenta + " euros y " + numeroDiez + " billetes de " + billeteDiez + " euros");
        // TODO code application logic here
    }
    
}
