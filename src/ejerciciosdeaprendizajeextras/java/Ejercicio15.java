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
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
        restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
        matemática y deben devolver sus resultados para imprimirlos en el main.*/
        
        Scanner leer = new Scanner(System.in);
        boolean var = true;
        System.out.println("Ingrese el primer valor");
        int num = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();

        do {
            System.out.println("<< SELECCIONE LA OPERACION A REALIZAR >>");
            System.out.println("1. SUMA");
            System.out.println("2. RESTA");
            System.out.println("3. MULTIPLICACION");
            System.out.println("4. DIVISION");
            System.out.println("5. SALIR");
            System.out.println("Elija una opcion");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    sumar(num, num2);
                    break;
                case 2:
                    restar(num, num2);
                    break;
                case 3:
                    multiplicacion(num, num2);
                    break;
                case 4:
                    dividir(num, num2);
                    break;
                case 5:
                    var = false;
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            System.out.println("");
        } while (var == true);
    }
    
    // FUNCIONES
    
    public static int sumar(int num, int num2) {
        int suma = num + num2;
        System.out.println("El resultado de la suma es: " + suma);
        return suma;
    }
    public static int restar(int num, int num2) {
        int resta = num - num2;
        System.out.println("El resultado de la resta es: " + resta);
        return resta;
    }
    public static int multiplicacion(int num, int num2) {
        int multiplicacion = (num * num2);
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
        return multiplicacion;
    }
    public static double dividir(int num, int num2) {
        double division = (num / num2);
        System.out.println("El resultado de la division es: " + division);
        return division;
    }
}
