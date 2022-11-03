/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package actividades;

import java.util.Scanner;

/**
 *
 * @author maxia
 */
public class actividad_14 {

    public static void main(String[] args) {
        double euros = eurosintroducida();
        String moneda = monedaintroducida();
        double cambio = cambiodemoneda(euros, moneda);
    }

    public static double eurosintroducida() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("la cantidad de euros");
        double euros = scanner.nextInt();
        return euros;
    }

    public static String monedaintroducida() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introdusca la cantidad de monedas que  desea cambiar");
        String moneda = scanner.next();
        System.out.println("la cantidad de monedas introducidas para cmabiar son :" + moneda);
        return moneda;
    }

    public static double cambiodemoneda(double euros, String moneda,) {
        double cambio = 0,0;
        return =0;
        
 
    }
}
