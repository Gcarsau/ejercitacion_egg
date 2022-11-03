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
public class extra_8 {

  static Scanner leer = new Scanner(System.in);
    public static void main(String[] args){
        int n=0,num,numP=0,numI=0;
        boolean con = true;
        while(con){
            System.out.println("Ingrese numeros enteros");
            num = leer.nextInt();
            n++;
            if(num % 2 == 0){
                numP++;
            }else{
                numI++;
            }
            if(num % 5 == 0){
                con = false;
            }
        }
        System.out.println("Los numeros leidos fueron: " + n+", los numeros pares fueron: " + numP+" Y los impares: " + numI);
}
}