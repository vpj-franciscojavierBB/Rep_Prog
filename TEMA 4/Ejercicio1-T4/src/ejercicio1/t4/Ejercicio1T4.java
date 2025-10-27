/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1.t4;
import java.util.Scanner;
/**
 *
 * @author Jav1e7
 */
public class Ejercicio1T4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número: ");
        int num = entrada.nextInt();
        String resultado = positivoNegativo(num);  // Llamamos al método
        System.out.println("El número introducido es " + resultado + ".");// Mostramos el resultado
    }

    
    public static String positivoNegativo(int numero) {
        if (numero > 0) {
            return "positivo";
        } else if (numero < 0) {             // Método que devuelve si el número es positivo, negativo o cero
            return "negativo";
        } else {
            return "cero";
        }
    }
}
       
    

