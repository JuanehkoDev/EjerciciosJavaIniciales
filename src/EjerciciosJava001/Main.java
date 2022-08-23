package EjerciciosJava001;/*ENUNCIADO DEL EJERCICIO
 *
 * Genera un número aleatorio entre 0 y 100 (no incluido) y usando exclusivamente el operador condicional,
 * junto con operadores de relación, lógicos y de asignación, escribe un código en Java que muestre por
 * pantalla si el número aleatorio generado está entre los rangos siguientes:
 *
 *    • Si el número está entre 0 y 20, 20 no incluido.
 *    • Si el número está entre 20 y 50, ambos incluidos.
 *    • Si el número está entre 50 y 75, ninguno incluido.
 *    • Si el número está entre 75 y 100, ambos incluidos.
 *
 *   Para crear un numero aleatorio podemos usar: "double d=Math.random()*100";
 */

public class Main {
    public static void main(String[] args) {
        //Declaracion de variables

        //d contendrá un número aleatorio entre 0 y 100.
        double d = Math.random() * 100;

        String cad;
        // Comprobamos si d está entre 0 y 20, 20 no incluido.
        cad = (d < 20) ? "Si está entre 0 y 20." : "No está entre 0 y 20.";
        System.out.println(cad);
        // Comprobamos si d está entre 20 y 50, ambos incluidos.
        cad = (d >= 20 && d <= 50) ? "Si está entre 20 y 50." : "No está entre 20 y 50.";
        System.out.println(cad);
        // Comprobamos si d está entre 50 y 75, ninguno incluido.
        cad = (d > 50 && d < 75) ? "Si está entre 50 y 75." : "No está entre 50 y 75.";
        System.out.println(cad);
        // Comprobamos si d está entre 75 y 100, ambos incluidos.
        cad = (d >= 75 && d <= 100) ? "Si está entre 75 y 100" : "No está entre 75 y 100.";
        System.out.println(cad);
        // Mostramos el número aleatorio
        System.out.println("El número aleatorio es:" + d);
    }
}