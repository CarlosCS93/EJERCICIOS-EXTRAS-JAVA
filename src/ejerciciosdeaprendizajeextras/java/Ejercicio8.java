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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
        detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
        la cantidad de números impares. Al igual que en el ejercicio anterior los números
        negativos no deben sumarse. Nota: recordar el uso de la sentencia break.*/
        
        Scanner leer = new Scanner(System.in);
        int i =0;
        int j=0;
        int k=0;
        int num;
        
        do {            
            System.out.println("Ingrese una serie de numero");
            num = leer.nextInt();
            if (num %2 ==0) {
                j++;
                
            }else {
                k++;
            }
            if (num %5 ==0) {
                i++;
                break;
                
            }
           i++; 
            
            
        } while (num>0);
        
        System.out.println("Programa detenido debido a que se encontro numero multiplo de 5 ---> "+ num );
        System.out.println("La cantidad de numeros leidos es: "+ i);
        System.out.println("La cantidad de numeros pares es: "+j);
        System.out.println("La cantidad de numeros impares es: "+k);
        
        
    }
    
}
