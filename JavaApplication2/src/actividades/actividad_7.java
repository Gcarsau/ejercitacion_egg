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
public class actividad_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String eureka;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el usuario ");
        eureka = scanner.nextLine();
        if (eureka.equals("eureka")) {
            System.out.println("hola señor ");
            

        }else{
             System.out.println("porfavor reescriba el  usuario");
        }

    }
}
    
