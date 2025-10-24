/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2.t4;
import java.util.Scanner;
import ejercicio2.t4.suma; 
/**
 *
 * @author Jav1e7
 */
public class Ejercicio2T4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float n1, n2;

        System.out.print("Por favor, introduzca un numero: ");
        n1 = entrada.nextFloat();

        System.out.print("Ahora, introduzca un segundo numero: ");
        n2 = entrada.nextFloat();

        float resultado;
        String operacion;

        if (n1 > 10) {
            resultado = suma.producto(n1, n2);
            operacion = "producto";
        } else {
            resultado = suma.suma(n1, n2);
            operacion = "suma";
        }

        System.out.println("La operación que se realizó es " + operacion + " y el resultado es " + resultado);
    }
}
