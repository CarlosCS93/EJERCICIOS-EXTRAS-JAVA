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
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        
        numPrimo(num);

        /*System.out.println(analisis(num));

    
    /*public static boolean analisis (int num){
        int contador =2;
        boolean primo = true;
        
        while ((primo) && (contador != num)){            
            if (num % contador ==0) {
                primo = false;
            }
        contador++;
        }
        
        
        return primo;
    }*/
    }
    public static boolean numPrimo (int num){
        int j = 0;
        boolean primo = true;

        for (int i = 2; i <= num; i++) {
            int resultado = (num % i);
                if (resultado == 0) {
                    j++;
                }
        }
        if (j == 1) {
            System.out.println(primo);
        } else {
            primo = false;
            System.out.println(primo);
        }
        
    return primo;    
    }
}
