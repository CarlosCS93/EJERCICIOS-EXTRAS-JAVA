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
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
        muestre la suma de sus elementos.*/
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el tamaño de la matriz");
        int x = leer.nextInt();
        int y = leer.nextInt();
        int [][] m = new int[x][y];
     
        
        llenarMatriz(m);
        mostrarMatriz(m);
        sumarMatriz(m);
    }
    public static int llenarMatriz ( int m [][]){
        
        int i;
        int j;
        for ( i = 0; i < m.length; i++) {
            for ( j = 0; j < m.length; j++) {
                m [i][j]= (int)(Math.random()*9+1);
            }
        }
        
        return i;
    }
    public static int sumarMatriz (int m [][]){
    
        int suma =0;
        for (int[] m1 : m) {
            for (int j = 0; j < m.length; j++) {
                suma += m1[j];
            }
        }
    System.out.println("La suma de todos los elementos de la matriz es: ["+suma+"]");    
    return suma;
    }
    public static int mostrarMatriz (int m [][]){
        
        int i;
        int j;
        for ( i = 0; i < m.length; i++) {
            for ( j = 0; j < m.length; j++) {
                System.out.print("["+m[i][j]+"]");
            }
        System.out.println("");
        }
        
        return i;
        
    }
    


}

