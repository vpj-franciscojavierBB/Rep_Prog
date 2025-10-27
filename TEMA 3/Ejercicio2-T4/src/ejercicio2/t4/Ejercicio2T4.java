/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2.t4;

import java.util.Scanner;       // Importamos Scanner para leer datos del usuario
import ejercicio2.t4.suma;       // Importamos la clase suma que contiene los métodos suma y producto

/**
 *
 * @author Jav1e7
 */
public class Ejercicio2T4 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in); // Creamos el objeto Scanner para capturar la entrada del usuario
        
        float n1, n2; // Declaramos las variables donde guardaremos los números ingresados por el usuario

        System.out.print("Por favor, introduzca un numero: ");
        n1 = entrada.nextFloat(); // Leemos y guardamos el primer número

        System.out.print("Ahora, introduzca un segundo numero: ");
        n2 = entrada.nextFloat(); // Leemos y guardamos el segundo número

        float resultado; // Variable para almacenar el resultado de la operación
        String operacion; // Variable para saber qué operación se hizo

        // Si el primer número es mayor que 10, hacemos la operación producto
        if (n1 > 10) {
            resultado = suma.producto(n1, n2); // Llamamos al método producto de la clase suma
            operacion = "producto";
        } else {
            // Si no, realizamos una suma
            resultado = suma.suma(n1, n2); // Llamamos al método suma de la clase suma
            operacion = "suma";
        }

        // Imprimimos el resultado
        System.out.println("La operación que se realizó es: " + operacion + " y el resultado es: " + resultado);
    }
}