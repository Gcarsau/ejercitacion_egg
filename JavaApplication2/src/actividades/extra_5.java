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
public class extra_5 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("ingrese que tipo de socio es");
        String socio= scanner.nextLine();
        int tratamiento=100;
        switch(socio){
            case"a": System.out.println("costo del tratamiento es sin descuento:"+ tratamiento);
                System.out.println("con descuent"+ (tratamiento*0.5) );
            break;     
            case"b": System.out.println("costo del tratamiento es sin descuento:"+ tratamiento);
                System.out.println("con descuent"+ (tratamiento*0.65) );
                break;
                 case"c": System.out.println("costo del tratamiento es sin descuento:"+ tratamiento);
                     System.out.println("usted no posee ningun tratamiento");
                     break;
                
    }
}
}
