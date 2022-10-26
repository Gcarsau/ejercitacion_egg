package javaapplication2;

import java.util.Scanner;

public class actividad_1 {

    /**
     *
     */
    public static void main(String[] args) {
        /*Variables*/
        int num;
        int num2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa numero");
        num = scanner.nextInt();

        System.out.println("Ingresa numero");
        num2 = scanner.nextInt();

        System.out.println("Resultado de la suma es " + (num+num2));

    }

}
