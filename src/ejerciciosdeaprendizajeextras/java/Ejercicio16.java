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
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
        las personas ingresadas por teclado e indique si son mayores o menores de edad.
        Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
        mostrando personas y frenar cuando el usuario ingrese la palabra “No”.*/
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Tamaño del muestreo y analisis de datos ingresados");
        int tamaño = leer.nextInt();
        String[] n = new String[tamaño];
        int[] e = new int[tamaño];
        int i = 0;
        String nombre;
        int edad;
        int aux = tamaño;

        for (int j = 0; j < tamaño; j++) {
            
            System.out.println("Ingrese su nombre");
            nombre = leer.next();
            n[j] = nombre;

            System.out.println("Ingrese su edad");
            edad = leer.nextInt();
            e[j] = edad;
        }
        System.out.println("");
        for (int j = 0; j < tamaño; j++) {
            aux--;
            System.out.println("Nombre: "+ n[j]+ " Edad: "+e[j]);
            System.out.println("");
            if (e[j] < 18) {
                System.out.println("Es menor de edad");
            } else {
                System.out.println("Cumple con la mayoria de edad");
                
            }
            System.out.println("");
            System.out.println("Desea seguir mostrando personas");
            String respuesta = leer.next();
            if (respuesta.equals("si")) {
                
                System.out.println("Quedan " + (aux) + " datos por mostrar");
                System.out.println("");
            } else {
                System.out.println("Hasta pronto");
                break;
            }

        }

    }
}
