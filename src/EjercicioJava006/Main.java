package EjercicioJava006;
/*ENUNCIADO DEL EJERCICIO
 * Escribe una aplicación con un String que contenga una contraseña cualquiera. Después se
 * te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá mas
 * la contraseña y mostrara un mensaje diciendo «Enhorabuena». Piensa bien en la condición
 * de salida (3 intentos y si acierta sale, aunque le queden intentos).
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declaramos dos variables para la contraseña definida y la que vamos a introducir
        String pass = "pass";
        String passTeclado;
        int contador = 1;

        Scanner sc = new Scanner(System.in);

        //Solucionamos el problema con un bucle do-while
        do {
            System.out.println("Introduce la contraseña:");
            passTeclado = sc.nextLine();
                if (passTeclado.equals(pass)) {
                System.out.println("Enhorabuena");
                break;
                } else {
                contador++;
                }
            System.out.println("Contraseña errónea");
        } while (contador < 4);
    }
}
