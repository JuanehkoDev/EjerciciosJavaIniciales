package EjercicioJava009;

import java.util.Scanner;

/*ENUNCIADO DEL EJERCICIO
 *Pedir cinco números y mostrarlos ordenados de mayor a menor.
 */
public class Main {
    public static void main(String[] args) {
        //Declaramos variables
        //Creamos un array donde introducir los 5 números
        int[] numeros = new int[5];

        //Pedimos los numeros por pantalla
        Scanner sc = new Scanner(System.in);
        //Llenamos el array con los numeros en su posición.
        //Solucionamos el problema con el ordenamiento "burbuja"

        for (int y = 0; y < numeros.length; y++) {
            System.out.println("Introduce el número en la posición " + (y + 1));
            numeros[y] = sc.nextInt();
            for (int i = 0; i < numeros.length - 1; i++) {
                if (numeros[i] < numeros[i + 1]) {
                    int tmp = numeros[i + 1];
                    numeros[i + 1] = numeros[i];
                    numeros[i] = tmp;
                }
            }
        }

        for(int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i]+", ");
        }
    }
}
