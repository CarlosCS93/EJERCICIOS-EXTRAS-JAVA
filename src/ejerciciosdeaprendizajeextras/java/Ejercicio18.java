/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeaprendizajeextras.java;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Usuario
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
        N, con los valores ingresados por el usuario.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de vector");
        int n = leer.nextInt();
        int[] v;
        v = new int[n];
        int num2;

        System.out.println("Ingrese valores para realizar una suma");
        for (int i = 0; i < n; i++) {
            v[i] = num2 = leer.nextInt();
        }
        sumar(v, n);
    }

    public static int sumar(int v[], int n) {

        int suma = 0;

        for (int i = 0; i < n; i++) {
            suma += v[i];
        }

        System.out.println("La suma de los valores ingresados en el vector es: " + suma);

        return suma;
    }
}
