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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
        una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
        tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
        iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.*/
        
        int a=4;
        int b=9;
        int c=6;
        int d=3;
        
        System.out.println("a = "+a );
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
        invertir(a, b, c, d);
         
   
        
    }
    public static int invertir (int a,int b,int c,int d){
        int aux;
        aux=b;
         b=c;
         c=a;
         a=d;
         d=aux;
         
        System.out.println("INTERCAMBIO DE VALORES");
        System.out.println("b = "+b+" --> c");
        System.out.println("c = "+c+" --> a");
        System.out.println("a = "+a+" --> d");
        System.out.println("d = "+aux+" --> b");
        
        
     return (0);   
    }
}
