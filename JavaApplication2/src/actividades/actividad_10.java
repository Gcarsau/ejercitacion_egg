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
public class actividad_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num,num_1;
       Scanner  Scanner = new Scanner(System.in);
       do{ System.out.println("ingrese un numero");
          num = Scanner.nextInt();
           num_1 = Scanner.nextInt();
       if (num == 100 )
               System.out.println("la suma debe superar al limite");
            num = Scanner.nextInt();
           num_1 = Scanner.nextInt();
 
   } while (num > 100 );
       { System.out.println(num + num_1 );}
 
}
