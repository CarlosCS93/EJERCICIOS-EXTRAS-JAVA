/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeaprendizajeextras.java;

import static java.util.Objects.isNull;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
        que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
        20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
        será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
        rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
        por pantalla la sopa de letras creada.
        Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
        de Java substring(), Length() y Math.random().*/
        Scanner leer = new Scanner(System.in);
        String sopa[][] = new String[20][20];

        int lon;
        String palabra;
        int k = 0;
        int cont = 0;
        String[] frase = new String[5];
        String a = "";

        
        llenarMatriz(sopa);
        
        do {
            System.out.println("Ingrese 5 palabras de minimo 3 y hasta 5 caracteres");
            palabra = leer.next();
            lon = palabra.length();
            cont++;
            for (int i = (int) (Math.random() * 9); i < sopa.length; i++) {
                frase[i] = palabra;
                a = frase[i];
                break;
            }

            if (lon >= 3 && lon <= 5) {

                for (String[] sopa1 : sopa) {
                    String b = a;
                    for (int j = 0; j < sopa.length; j++) {
                        if (j < lon) {
                            String sub = b.substring(j, j + 1);
                            sopa1[j] = sub;
                        } else if (j >= lon - 1) {
                            int aux = (int) (Math.random() * 10);
                            String cadena = String.valueOf(aux);
                            sopa[k][j] = cadena;
                        }
                        k = ((int) (Math.random() * 19 + 1));
                    }
                }
            }

        } while (cont < 5);

        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa.length; j++) {
                if (sopa[i][j] == null) {
                    int aux = (int) (Math.random() * 10);
                    String cadena = String.valueOf(aux);
                    sopa[i][j] = cadena;
                }
            }

        }

        for (String[] sopa1 : sopa) {
            for (int j = 0; j < sopa.length; j++) {
                System.out.print("[" + sopa1[j] + "]");
            }
            System.out.println("");
        }

    }

    public static void llenarMatriz(String sopa[][]) {

        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa.length; j++) {

                int aux = (int) (Math.random() * 10);
                String cadena = String.valueOf(aux);
                sopa[i][j] = cadena;
            }
        }

            
    }
}
