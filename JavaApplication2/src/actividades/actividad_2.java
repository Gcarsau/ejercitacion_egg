package actividades;

import java.util.Scanner;

public class actividad_2 {
/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.   
*/
    public static void main(String[] args) {
        String nombre;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa nombre");
        
        nombre = scanner.next();
       
        System.out.println("El nombre ingresado fue "+ nombre);
        
        
        
    }
    
}
