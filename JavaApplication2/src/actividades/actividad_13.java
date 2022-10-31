/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades;

import java.util.Scanner;

/**
 * 13. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
 * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo
 * siguiente:
 *
 * @author maxia
 */
public class actividad_13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Ingrese la cantidad de elementos");
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
      
        System.out.println();
        for (int i = 0; i < n ; i++) {
            System.out.print("*");
            for (int j = 0; i < n-2 ; i++) {
                System.out.print("");
            }
            System.out.println("  *");
        }

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}