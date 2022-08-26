package EjercicioJava003;

/*ENUNCIADO DEL EJERCICIO
 * Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida
 * por consola.
 * Por ejemplo: si introduzco «Fernando», me aparezca «Bienvenido Fernando».
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaracion de la variable String
        String nombre;
        //Creamos la entrada por teclado.
        Scanner entrada = new Scanner(System.in);
        //Salida por consonla del mensaje:
        System.out.println("Introduza un nombre:");
        nombre = entrada.nextLine();
        System.out.println("Bienvenido " + nombre);
    }
}
