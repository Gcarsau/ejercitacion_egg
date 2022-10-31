/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades;

import java.util.Scanner;

/**
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232,
 * este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas
 * deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres
 * de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
 * Las secuencias leídas que respeten el formato se consideran correctas, la
 * secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y
 * toda secuencia distinta de FDE, que no respete el formato se considera
 * incorrecta. Al finalizar el proceso, se imprime un informe indicando la
 * cantidad de lecturas correctas e incorrectas recibidas. Para resolver el
 * ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java
 * Substring(), Length(), equals().
 *
 * @author maxia
 */
public class activad_12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        num1 = 0;
        num2 = 0;
        String cara;

        do {

            System.out.println("Ingrese la secuencia deseada:");
            cara = leer.nextLine();
            while (cara.length() != 5) {
                System.out.println("La secuencia necesita 5 caracteres. Ingrese uno nuevo:");
                cara = leer.nextLine();
            }
            if (cara.substring(0, 1).equals("x") && cara.substring(4, 5).equals("o")) {
                num1++;
            } else {
                num2++;
            }
        } while (!cara.equals("&&&&&"));

        System.out.println("Hay " + num1 + " informes correctos, y " + num2 + " informes incorrectos.");

    }
}


