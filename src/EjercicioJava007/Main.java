package EjercicioJava007;

import java.util.Scanner;

/*ENUNCIADO DEL EJERCICIO
 *Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones reales.
 * Si no existen,debe indicarlo.
 */
public class Main {
    public static void main(String[] args) {
        //Declaración de variables
        double a, b, c;
        double sol1, sol2;

        System.out.println("Sabiendo que la formula general de una ecuación de segundo grado es:\n" +
                " ax2+ bx +c = 0, vamos a resolverla introduciendo los valores de a, b y c.");
        //Solicitud de la entrada de números por teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor de a:");
        a=sc.nextInt();
        System.out.println("Introduce el valor de b:");
        b=sc.nextInt();
        System.out.println("Introduce el valor de c:");
        c=sc.nextInt();

        //Resolvemos el ejercicio
        double raiz = Math.pow(b, 2)-(4*a*c);

        if (raiz>0){
            sol1 = ((-b)+Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
            sol2 = ((-b)-Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);

            System.out.println("sol1 = " + sol1);
            System.out.println("sol2 = " + sol2);

        }else{
            System.out.println("La ecuación no tiene solución");
        }
    }
}
