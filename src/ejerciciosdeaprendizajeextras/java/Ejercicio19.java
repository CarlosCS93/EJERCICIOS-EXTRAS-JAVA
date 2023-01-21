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
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
        comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
        elementos).*/

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int v[] = new int[n];
        int ve[] = new int[n];
        boolean verdad = true;
        for (int i = 0; i < n; i++) {
            v[i] = /*(int)(Math.random()*9); */ leer.nextInt();
            ve[i] = /*(int)(Math.random()*9);*/ leer.nextInt();
        }
        for (int i = 0; i < n ; i++) {
            if (v[i] != ve[i]) {
                verdad = false;
                System.out.println("Vectores Diferentes");
                break;
            }

        }

        if (verdad) {
            System.out.println("Vectores Iguales");
        }
    }

}
