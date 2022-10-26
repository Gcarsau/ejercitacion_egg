package javaapplication2;

import java.util.Scanner;

public class actividad_4 {
/**
 
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 
 */
    public static void main(String[] args) {
        int grados;
        int fahr;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese ºC");
        grados = scanner.nextInt();
        
        fahr = 32+(9*grados)/5;
        
        System.out.println("Su equivalente seria "+fahr+" ºF");
        
        
        
        
        
        
        
        
        
    }
    
}
