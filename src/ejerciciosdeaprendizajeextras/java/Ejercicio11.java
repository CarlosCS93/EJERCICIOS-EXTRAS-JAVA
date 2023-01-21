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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Escribir un programa que lea un número entero y devuelva el número de dígitos que
        componen ese número. Por ejemplo, si introducimos el número 12345, el programa
        deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
        de división. Nota: recordar que las variables de tipo entero truncan los números o
        resultados.*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        int num2;
        int j = 0;
        
        //PRIMERA MANERA DE RESOLVER CON BUCLE FOR
        for (int i = 0; i - i < num; i++) {
            num2 = (num / 10);
            num = num2;
            if (num < 0) {
                break;
            }
            j++;
        }
        System.out.println("La cantidad de digitos del numero ingresado es: " + j);
        
        /* OTRA FORMA CON EL BUCLE WHILE MAS SENCILLA
        while (num != 0) {
            int num2 = (num / 10);
            num = num2;
            i++;
        }*/
    }
}
