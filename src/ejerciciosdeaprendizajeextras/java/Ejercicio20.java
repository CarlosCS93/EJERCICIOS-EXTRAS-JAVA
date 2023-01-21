/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeaprendizajeextras.java;

/**
 *
 * @author Usuario
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
        parámetro. Después haremos otra función o procedimiento que imprima el vector.*/
        
        int [] v = new int [3];
        llenarVector(v);
        imprimirVector(v);
        
    }
    
    public static int llenarVector ( int v []){
        int i;
        for ( i = 0; i < v.length; i++) {
            v[i]= (int) (Math.random()*9);
        }
        
     return (i);   
    }
    public static int imprimirVector (int v []){
        int i;
        for ( i = 0; i < v.length; i++) {
            System.out.print("["+v[i]+"]");
            
        }
    return i ;
    }
    
}
