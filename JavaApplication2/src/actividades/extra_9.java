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
public class extra_9 {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args){
       int cociente = 0, residuo=0, num2;
        System.out.println("Ingrese dos enteros.");
        residuo = leer.nextInt();
        num2 = leer.nextInt();
        
        while(residuo>num2){   
            residuo = residuo - num2;
            cociente++;
        }
        System.out.println("El residuo es " + residuo+"y el cociente es "+ cociente);
       
}
}