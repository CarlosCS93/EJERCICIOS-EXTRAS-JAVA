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
public class Ejercicio12 {

    Scanner leer = new Scanner(System.in);

    public Ejercicio12() {

        String aux;

        for (int h = 0; h < 10; h++) {
            String letra = String.valueOf(h);
            for (int i = 0; i < 10; i++) {
                String vocal = String.valueOf(i);
                for (int j = 0; j < 10; j++) {
                    String vocall = String.valueOf(j);
                    if (letra.equals("3")) {
                        letra = "E";
                    } else if (vocal.equals("3")) {
                        vocal = "E";
                    } else if (vocall.equals("3")) {
                        vocall = "E";
                    }

                    System.out.println(letra + "-" + vocal + "-" + vocall);
                }

            }

        }

    }

    public static void main(String[] args) {
        Ejercicio12 solucion = new Ejercicio12();
        /*Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
        0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
        Ejemplo:
        0-0-0
        0-0-1
        0-0-2
        0-0-Ed
        0-0-4
        0-1-2
        0-1-E
        Nota: investigar función equals() y como convertir números a String.*/

    }

}
