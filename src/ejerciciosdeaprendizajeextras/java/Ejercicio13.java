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
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Crear un programa que dibuje una escalera de números, donde cada línea de números
        comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
        usuario al comenzar. Ejemplo: si se ingresa el número 3:
        1
        12
        123*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la altura de la escalera");
        int x = leer.nextInt();

        for (int i = 1; i <= x; i++) {
            System.out.println("");
            for (int j = 1; j <= i; j++) {
                System.out.print(j);

            }

        }
        System.out.println("");
        System.out.println("Excelente...");
    }

}
