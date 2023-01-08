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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Realice un programa para que el usuario adivine el resultado de una multiplicación entre
            dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
            si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
        al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
        utilizar la función Math.random() de Java.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("ADIVINE EL RESULTADO DE LA MULTIPLICACION");
        int num = (int) (Math.random() * 9 + 1);
        int num2 = (int) (Math.random() * 9 + 1);
        int resultado = (num * num2);
        System.out.println(resultado);
        System.out.println("Ingrese su respuesta");
        int opcion = leer.nextInt();
        
        while (opcion != resultado) {

            System.out.println("Respuesta incorrecta, intente nuevamente");
            opcion = leer.nextInt();

        }

        System.out.println("Respuesta correcta");

    }

}
