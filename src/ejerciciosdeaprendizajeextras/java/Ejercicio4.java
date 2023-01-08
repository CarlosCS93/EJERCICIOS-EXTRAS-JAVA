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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 4. Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
        equivalente en romano.*/
        
        Scanner leer = new Scanner(System.in);
        boolean var;

        do {

            System.out.println("Ingrese un numero entre el 1 y 10");
            int num = leer.nextInt();

            switch (num) {
                case 1:
                    System.out.println("Su equivalencia en numeros romanos");
                    System.out.println("I");
                    var = true;
                    break;
                case 2:
                    System.out.println("Su equivalencia en numeros romanos");
                    System.out.println("II");
                    var = true;
                    break;
                case 3:
                    System.out.println("Su equivalencia en numeros romanos");
                    System.out.println("III");
                    var = true;
                    break;
                case 4:
                    System.out.println("Su equivalencia en numeros romanos");
                    System.out.println("IV");
                    var = true;
                    break;
                case 5:
                    System.out.println("Su equivalencia en numeros romanos");
                    System.out.println("V");
                    var = true;
                    break;
                case 6:
                    System.out.println("Su equivalencia en numeros romanos");
                    System.out.println("VI");
                    var = true;
                    break;
                case 7:
                    System.out.println("Su equivalencia en numeros romanos");
                    System.out.println("VII");
                    var = true;
                    break;
                case 8:
                    System.out.println("Su equivalencia en numeros romanos");
                    System.out.println("VIII");
                    var = true;
                    break;
                case 9:
                    System.out.println("Su equivalencia en numeros romanos");
                    System.out.println("IX");
                    var = true;
                    break;
                case 10:
                    System.out.println("Su equivalencia en numeros romanos");
                    System.out.println("X");
                    var = true;
                    break;
                default:
                    System.out.println("Numero fuera de rango");
                    var = false;

            }
        } while (var == true);

    }

}
