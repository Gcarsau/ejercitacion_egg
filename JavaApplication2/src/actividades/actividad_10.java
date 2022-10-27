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
public class actividad_10 {

    /**
     * Escriba un programa en el cual se ingrese un valor límite positivo, y a
     * continuación solicite números al usuario hasta que la suma de los números
     * introducidos supere el límite inicial.
     */
    public static void main(String[] args) {
        int limitePositivo;
        int num;
        int suma;

        Scanner scanner = new Scanner(System.in);
        suma = 0;

        System.out.println("Ingrese limite");
        limitePositivo = scanner.nextInt();

        do {
            System.out.println("El resultado de la suma hasta ahora es " + suma);

            System.out.println("Ingrese numero a sumar");
            num = scanner.nextInt();
            suma = suma + num;
        } while (limitePositivo > suma);

    }
}
