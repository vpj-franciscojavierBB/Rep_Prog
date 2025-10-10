/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg21.t2;

import java.util.Scanner;

/**
 *
 * @author Jav1e7
 */
public class Ejercicio21T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Introduce los segundos ");
    
     double segundos = entrada.nextDouble();
    
     int total =(int) segundos;
    
    int horas = total/3600;
    
    int minutos = (total%3600)/ 60;
    
    int seg = total % 60;
    
    System.out.println("Los segundos " + total + " son " + horas + " horas, " + minutos + " minutos y " + seg + " segundos");
           
        // TODO code application logic here
    }
    
}
