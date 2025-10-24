/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9.t4;
import java.util.Scanner;
/**
 *
 * @author Jav1e7
 */
public class Ejercicio9T4 {

    public static int pedirprimerdato() {
        Scanner entrada = new Scanner(System.in);      //pedir el primer número
        System.out.println("Introduzca el primer numero: ");
        return entrada.nextInt();
    }   

    public static int pedirsegundodato() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el segundo numero: ");           //pedir el segundo número
        return entrada.nextInt();
    }

    public static int pedirtercerdato() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el tercer numero: ");        //pedir el tercer número
        return entrada.nextInt();
    }

    public static void main(String[] args) {
        int num1 = pedirprimerdato();
        int num2 = pedirsegundodato();           //llamamos al método y analizamos con un "if" cual es el menos de los 3
        int num3 = pedirtercerdato();
        int menor = num1;
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }
        System.out.println("El menor de los tres numeros es: " + menor);
    }
}