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
public class extra_6 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double estatura, suma=0, sumaenanos = 0, promedio = 0;
        int N = 0, j= 0;
        System.out.println("cuantas personas son a medir");
        N = scanner.nextInt();
        for (int i = 0; i < N + 1; i++);{
          System.out.println("estatura de persona:");
            estatura = scanner.nextDouble();
           suma =estatura+suma;
            if (estatura < 1.60) {
                sumaenanos= sumaenanos+estatura;
                j++;
            }System.out.println("estura promedio enanos"+(sumaenanos/j));
            System.out.println("estatura promedio general"+(suma/N));
        }
    }
}
