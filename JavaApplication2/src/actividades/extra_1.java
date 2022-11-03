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
public class extra_1 {
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           System.out.println("ingrese los minutos a convertir");
           int minutos = scanner.nextInt();
          int horas = minutos/60,dias =horas /24;
           System.out.println("dias ="+ dias +" y horas" + horas);
       }
}
