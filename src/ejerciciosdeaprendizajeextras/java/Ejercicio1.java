/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeaprendizajeextras.java;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
        usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tiempo a transformar en minutos");
        int minutos = leer .nextInt();
        System.out.println("Usted ingreso "+ minutos+ " minutos");
        double dia,hora ;
        
        dia = (minutos/1440);
        if (dia>1440){
        System.out.println("La equivalencia es "+dia+" dia");
        }else {
            System.out.println("La equivalencia es "+dia+" dias");
        }
    }
    
}
