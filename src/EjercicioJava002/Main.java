package EjercicioJava002;

/*ENUNCIADO DEL EJERCICIO
 *
 * Declara dos variables numéricas (con el valor que desees), muestra por consola
 * la suma, resta, multiplicación, división y módulo (resto de la división).
 */
public class Main {
    public static void main(String[] args) {

        //Declaramos las variables numericas
        int num1 = 12;
        int num2 = 5;

        //Podemos declarar cada resultado como una variable, pero al ser tan
        //sencilla, se puede realizar directamente
        System.out.println("La suma de las variables es: "+(num1+num2));
        System.out.println("La resta de las variables es: "+(num1-num2));
        System.out.println("La multiplicacion de las variables es: "+(num1*num2));
        System.out.println("La division de las variables es: "+(num1/num2));
        System.out.println("El modulo de las variables es: "+(num1%num2));


    }
}
