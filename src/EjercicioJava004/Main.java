package EjercicioJava004;
/*ENUNCIADO DEL EJERCICIO
* Haz una aplicación que calcule el área de un círculo(pi*R2).
* El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble).
* Usa la constante PI y el método pow de Math.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declacion de variable
        double areaCirculo;
        double radio;
        Scanner entrada = new Scanner(System.in);

        //Solicitamos el radio por consola
        System.out.println("Introduce el radio del circulo:");
        radio = Double.parseDouble(entrada.nextLine());

        //Creamos la formula para sacar el resultado
        areaCirculo = Math.pow(radio, 2) * Math.PI;

        //Mostramos el resultado
        System.out.println("El área del circulo es:  = " + areaCirculo);
    }
}
