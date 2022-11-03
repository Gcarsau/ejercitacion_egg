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
public class extra_3 {
 static Scanner leer = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Ingrese una letra");
        String letra = leer.nextLine();
        switch(letra){
            case "a":
                System.out.println("Tu letra es una vocal");
            break;
            case "e":
                System.out.println("Tu letra es una vocal");
            break;
            case "i":
                System.out.println("Tu letra es una vocal");
            break;
            case "o":
                System.out.println("Tu letra es una vocal");
            break;
            case "u":
                System.out.println("Tu letra es una vocal");
            break;
            default:
                System.out.println("Tu letra no es una vocal.");
        }
    }
}