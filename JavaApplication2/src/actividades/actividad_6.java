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
public class actividad_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero;
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese un numero ");
        numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("es un numero par");

        }else{
             System.out.println("es un numero impar");
        }

    }
}
