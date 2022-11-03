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
public class extra_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 1, b = 2, c = 3, d = 4, aux = 0;
        
        aux = b;
        b = c;
        c = a;
        a = d;
        d= aux;
               
       System.out.println("*"+a+"*"+b+"*"+c+"*"+d+"*"); 
    }
}
