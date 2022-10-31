/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades;

import java.util.Scanner;

/**
 *
 * @author maxia
 */
public class activdad_11 {

    public static void main(String[] arg) {
        int num_1, num_2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese 2 numero para iniciar el menu ");
        num_1 = scanner.nextInt();
        num_2 = scanner.nextInt();
        do {
            System.out.println("*****este es el menu*****");
            System.out.println("1.la suma de los dos numeros es");
            System.out.println("2.1.la suma de los dos numeros es");
            System.out.println("3. los dos numeros es");
            System.out.println("4 la suma de los dos numeros es");
            System.out.println("5 la suma de los dos numeros es");

        } while (num_1 < num_2 );
    }
}
