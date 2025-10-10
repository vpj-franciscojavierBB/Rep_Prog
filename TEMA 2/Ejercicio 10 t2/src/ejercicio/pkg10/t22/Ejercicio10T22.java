/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg10.t22;

/**
 *
 * @author Jav1e7
 */
public class Ejercicio10T22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int n1 = 1; //Valor de la primera variable
    int n2 = 2; //Valor de la segunda variable
    
    System.out.println("La variable n1 contiene el valor " +n1+ " y la variable n2 contiene el valor " +n2);
    int memoria = n1; // creacion  variable memoria para intercambiar
    n1=n2; //nuevo valor n1
    n2 = memoria; // nuevo valor n2
    System.out.println("Ahora la variable n1 contiene el valor " +n1+ " y la variable n2 contiene el valor " +n2);
        // TODO code application logic here
    }
    
}
