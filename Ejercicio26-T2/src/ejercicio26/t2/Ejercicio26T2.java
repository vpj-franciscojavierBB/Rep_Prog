/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26.t2;

/**
 *
 * @author Jav1e7
 */
    import java.util.Scanner;
public class Ejercicio26T2 {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero de 4 cifras: ");
        int numero = scanner.nextInt();

        // Comprobar que tiene 4 cifras
        if (numero >= 1000 && numero <= 9999) {
            int primera = numero / 1000;
            int segunda = (numero / 100) % 10;
            int tercera = (numero / 10) % 10;
            int cuarta = numero % 10;

            System.out.println("La primera cifra es: " + primera);
            System.out.println("La segunda cifra es: " + segunda);
            System.out.println("La tercera cifra es: " + tercera);
            System.out.println("La cuarta cifra es: " + cuarta);
        } else {
            System.out.println("Error: Debes introducir un numero de exactamente 4 cifras.");
        }
    }
}
    

