/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades;

import java.util.Scanner;

/**
 *
 * @author Daniel Alderete
 */
public class actividad_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String letra;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el usuario ");
        letra = scanner.nextLine();
        if (letra.toLowerCase().startsWith("a")) {
            System.out.println("correcto ");

        } else {
            System.out.println("incorrecto");
        }

    }
}
