/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg15.t2;

/**
 *
 * @author Jav1e7
 */
public class Ejercicio15T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int tiempo = 10000;//valor del tiempo
    int horas = tiempo / 3600;//tiempo en horas
    tiempo = tiempo - (horas * 3600);//renombrar el tiempo
    int minutos = (tiempo/60);//tiempo en minutos con el nuevo tiempo
    int segundos = tiempo - (minutos*60);//tiempo en segundos con el nuevo tiempo
    
    System.out.println("10.000 segundos hacen un total de " + horas + " horas," + minutos + " minutos y " +segundos+ " segundos");// TODO code application logic here
    }
    
}
