package actividades;

import java.util.Scanner;

public class actividad_3 {
/**
 * 
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
 * en minúsculas. 
 */

    public static void main(String[] args) {
       String frase;
       Scanner scanner = new Scanner(System.in);
       
        System.out.println("Ingrese una frase");
        frase = scanner.nextLine();
        
        System.out.println(frase.toUpperCase());
        
        System.out.println(frase.toLowerCase());
        
        
       
       
    }
    
}
