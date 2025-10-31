/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17.t4;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Jav1e7
 */
public class Ejercicio17T4 {
    // Subprograma para generar una letra aleatoria entre 'a' y 'z'
    public static char generarLetraAleatoria() {
        Random rand = new Random();
        return (char) (rand.nextInt(26) + 97); // 97 es el código ASCII de 'a'
    }

    // Subprograma para comparar letras y dar pistas
    public static void darPista(char letraUsuario, char letraObjetivo) {
        if (letraUsuario < letraObjetivo) {
            System.out.println("La letra que buscas esta despues en el abecedario.");
        } else if (letraUsuario > letraObjetivo) {
            System.out.println("La letra que buscas esta antes en el abecedario.");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char letraObjetivo = generarLetraAleatoria();
        int intentos = 0;
        char letraUsuario;

        System.out.println("Adivina la letra minuscula entre 'a' y 'z'!");

        do {
            System.out.print("Introduce una letra: ");
            letraUsuario = entrada.nextLine().charAt(0);
            intentos++;

            if (letraUsuario != letraObjetivo) {
                darPista(letraUsuario, letraObjetivo);
            }

        } while (letraUsuario != letraObjetivo);

        System.out.println("Correcto! La letra era '" + letraObjetivo + "'.");
        System.out.println("Has necesitado " + intentos + " intentos.");
    }
}
