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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Simular la división usando solamente restas. Dados dos números enteros mayores que
        uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
        Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
        resultado es el residuo, y el número de restas realizadas es el cociente.
        Por ejemplo: 50 / 13:
        50 – 13 = 37 una resta realizada
        37 – 13 = 24 dos restas realizadas
        24 – 13 = 11 tres restas realizadas
        dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
        ¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.*/
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese dos numeros el primero mayor que el segundo");
        int num=leer.nextInt();
        int num2=leer.nextInt();
        int resta;
        int i=0;
        
        do {
            resta = (num - num2);
            int num3=num;
            num =resta;
            System.out.println(num3+"-"+num2+"="+resta);
            i++;
        } while (resta >= num2);
        System.out.println("Se realizaron "+i+" restas sucesivas");
        System.out.println("El residuo es "+resta+" y el cociente es "+num2);
        
        
        
        
        
    }
    
}
