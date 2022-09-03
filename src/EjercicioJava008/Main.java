package EjercicioJava008;

import java.util.Scanner;

/*ENUNCIADO DEL EJERCICIO
 *Pedir dos números y decir si uno es múltiplo del otro.
 */
public class Main {
    public static void main(String[] args) {
        //Declaramos variables
        double num1, num2;
        //Pedimos el número por consola
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el valor del primer número");
        num1 = sc.nextInt();
        System.out.println("Introduzca el valor del segundo número");
        num2 = sc.nextInt();

        //Resolvemos el problema
        if (num1 % num2 == 0) {
            System.out.println("El " + num1 + " es múltiplo de " + num2);
        } else if (num2 % num1 == 0) {
            System.out.println("El " + num2 + " es múltiplo de " + num1);
        } else {
            System.out.println("Ninguno de los dos números es múltiplo uno del otro");
        }
    }
}
