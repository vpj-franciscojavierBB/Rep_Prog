/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23.t2;

import java.util.Scanner;

/**
 *
 * @author Jav1e7
 */
public class Ejercicio23T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Cuantos articulos quieres comprar?");
    
    double cantidad = entrada.nextDouble();            
    
    System.out.println("Cuantas unidades quieres comprar?");
    
    int unidades = entrada.nextInt();
    
    double total = cantidad * unidades;
    
    System.out.println("El total de la compra es " + total);
    
    
    
    
    
        // TODO code application logic here
    }
    
}
