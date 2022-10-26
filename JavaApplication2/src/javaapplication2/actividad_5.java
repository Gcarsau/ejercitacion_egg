package javaapplication2;

import java.util.Scanner;

/**
 *
 * Escribir un programa que lea un número entero por teclado y muestre por
 * pantalla el doble, el triple y la raíz cuadrada de ese número.
 */
public class actividad_5 {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero");
        num = sc.nextInt();

        System.out.println("El doble seria: " + 2 * num);
        System.out.println("El triple seria: " + 3 * num);
        System.out.println("El raiz cuadrada seria: " + Math.sqrt(num));
        System.out.println("El cuadrado seria: " + Math.pow(num, 2));
        System.out.println("El cubo seria: " + Math.pow(num, 3));

    }

}
