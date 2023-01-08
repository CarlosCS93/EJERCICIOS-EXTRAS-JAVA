/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio7_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
        de n números (n>0). El valor de n se solicitará al principio del programa y los números
        serán introducidos por el usuario. Realice dos versiones del programa, una usando el
        bucle “while” y otra con el bucle “do - while”.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la muestra de numeros");
        int n = leer.nextInt();
        int i = 0;
        double suma = 0;
        int max = 0;
        int min = 10;

        do {

            System.out.println("Ingrese los numeros");
            int num = leer.nextInt();
            suma = suma + num;
            if (max < num) {
                max = num;

            } else {
                if (min > num) {
                    min = num;
                }
            }

            i++;
        } while (i < n);

        System.out.println("El numero maximo es: " + max);
        System.out.println("El numero minimo es: " + min);
        double promedio = (suma / i);
        System.out.println("El promedio de los numeros ingresados es:" + promedio);

    }

}
