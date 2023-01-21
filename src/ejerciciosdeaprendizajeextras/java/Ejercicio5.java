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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Una obra social tiene tres clases de socios:
        
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.*/
        Scanner leer = new Scanner(System.in);

        System.out.println("CENTRO SOCIAL IECZ");

        System.out.println("Ingrese el usuario y contraseña");
        int i = 0;
        boolean aux = true;
        int valorO = 55;
        int valorT = 120;
        int valorM = 38;
        double precioFinal;
        System.out.println("USUARIO");
        String usuario = leer.nextLine();

        while (!usuario.equals("carlos93")){
                System.out.println("Usuario Incorrecto, intente nuevamanete");
                usuario = leer.next();
                i++;

        }
        System.out.println("Usuario Correcto");
        

        System.out.println("CONTRASEÑA");
        int clave = leer.nextInt();

        while (clave != 23456){
                System.out.println("Clave incorrecta, intente nuevamanete");
                clave = leer.nextInt();
                i++;

        }

        do {

            System.out.println("   MENU   ");
            System.out.println("1.PROCEDIMIENTO");
            System.out.println("2.SALIR");
            System.out.println("Ingrese una opcion");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("TRATAMIENTOS");
                    System.out.println("1.TRATAMIENTOS ODONTOLOGICOS");
                    System.out.println("2.TRATAMIENTOS TRAUMATOLOGICOS");
                    System.out.println("3.TRATAMIENTO MEDICINA GENERAL");
                    System.out.println("Selecione el tipo de tratamiento");
                    int opcionT = leer.nextInt();
                    switch (opcionT) {
                        case 1:
                            System.out.println("TRATAMIENTO ODONTOLOGICO");
                            String tratamiento1 = "TRATAMIENTO ODONTOLOGICO";
                            System.out.println("Precio del tratamiento: $ "+ valorO);
                            break;
                        case 2:
                            System.out.println("TRATAMIENTO TRAUMATOLOGICO");
                            String tratamiento2 = "TRATAMIENTO TRAUMATOLOGICO";
                            System.out.println("Precio del tratamiento: $ "+ valorT);
                            break;
                        case 3:
                            System.out.println("TRATAMIENTO MEDICINA GENERAL");
                            String tratamiento3 = "TRATAMIENTO MEDICINA GENERAL";
                            System.out.println("Precio del tratamiento: $ "+ valorM);
                            break;
                    }

                    System.out.println("TIPO DE SOCIO");
                    System.out.println("A. TIPO A");
                    System.out.println("B. TIPO B");
                    System.out.println("C. TIPO C");
                    System.out.println("Selecione el tipo");
                    String opcion3 = leer.next();
                    switch (opcion3) {
                        case "A":
                            System.out.println("SOCIO TIPO A");
                            String tipo = "SOCIO TIPO A";
                            System.out.println("Tipo de socio recibe 50 % descuento");
                            
                            
                            break;
                        case "B":
                            System.out.println("SOCIO TIPO B");
                            String tipoo = "SOCIO TIPO B";
                            System.out.println("Tipo de socio recibe 35 % descuento");
                            
                            break;
                        case "C":
                            System.out.println("SOCIO TIPO C");
                            String tipooo = "SOCIO TIPO C";
                            System.out.println("Tipo de socio no recibe descuento");
                            break;
                    }
                    System.out.println("VALORES A PAGAR");

                    switch (opcionT) {
                        case 1:
                            switch (opcion3) {
                                case "A":
                                    precioFinal = (valorO * 0.50);
                                    System.out.println("Valor a pagar $" + precioFinal);
                                    break;
                                case "B":
                                    precioFinal = (valorO * 0.65);
                                    System.out.println(precioFinal);
                                    break;
                                case "C":
                                    precioFinal = valorO;
                                    System.out.println(precioFinal);
                                    break;
                                default:
                                    break;
                            }
                            break;
                        case 2:
                            switch (opcion3) {
                                case "A":
                                    precioFinal = (valorT * 0.50);
                                    System.out.println(precioFinal);
                                    break;
                                case "B":
                                    precioFinal = (valorT * 0.65);
                                    System.out.println(precioFinal);
                                    break;
                                case "C":
                                    precioFinal = valorT;
                                    System.out.println(precioFinal);
                                    break;
                                default:
                                    break;
                            }
                            break;
                        default:
                            switch (opcion3) {
                                case "A":
                                    precioFinal = (valorM * 0.50);
                                    System.out.println(precioFinal);
                                    break;
                                case "B":
                                    precioFinal = (valorM * 0.65);
                                    System.out.println(precioFinal);
                                    break;
                                case "C":
                                    precioFinal = valorM;
                                    System.out.println(precioFinal);
                                    break;
                            }

                    }
                    break;
                case 2:
                    System.out.println("GRACIAS POR USAR NUESTROS SERVICIOS");
                    aux = false;

            }

        } while (aux == true);

    }
}
    



