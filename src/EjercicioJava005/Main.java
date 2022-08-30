package EjercicioJava005;
/*ENUNCIADO DEL EJERCICIO
 * Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es,
 * también debemos indicarlo.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaramos variables
        int numero;
        String resultado;

        Scanner entrada = new Scanner(System.in);

        //Solicitamos el numero por consola
        System.out.println("Introduce el numero que quieres saber si es par:");
        numero = entrada.nextInt();

        //Planteamos la resolucion del problema con el operador ternario:

        /*
        * El operador ternario tiene la siguiente sintaxis:
        * resultado = (condicion)?valor1:valor2;
        *
        * Valor 1 sera verdadero y Valor 2 sera falso.
        */

        resultado = (numero%2==0) ? "El numero es divisible por 2." : "El numero NO " +
                "es divisible por dos.";
        System.out.println(resultado);

        //Planteamos la resolucion del problema con un bucle if:
        //Volverá a pedir otra vez el numero por pantalla

        System.out.println("Introduce el numero que quieres saber si es par:");
        numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero es divisible por 2.");
        } else {
            System.out.println("El numero NO es divisible por 2.");
        }
    }
}
