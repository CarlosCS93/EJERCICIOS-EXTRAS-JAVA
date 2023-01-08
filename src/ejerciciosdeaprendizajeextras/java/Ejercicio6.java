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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
        debajo de 1.60 mts. y el promedio de estaturas en general.*/
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de personas para realizar el analisis");
        int poblacion = leer.nextInt();
        int i=0;
        int j=0;
        double suma=0;
        double suma2=0;
        do {
            System.out.println("Ingrese su estatura en metros");
            double tamaño = leer.nextDouble();
            suma2=suma2+tamaño;
            if (tamaño<1.60) {
             suma=suma+tamaño;
             j++;
            }
            i++;
        } while (i<poblacion);
        System.out.println("El numero de personas que tienen una estatura menor a 1.60 mts son: " + j);
        double promedio1=(suma/j);
        System.out.println("El promedio de las personas con menos de 1.60 mts es: "+promedio1+" metros");
        double promedio2=(suma2/i);
        System.out.println("El promedio general de estaturas es:"+promedio2+" metros" );
        
            
        
        
        
        
        
        
    }
    
}
