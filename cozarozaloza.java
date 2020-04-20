/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hnd;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class cozarozaloza {
    public static void main(String[] args){
                Scanner user = new Scanner(System.in);
                System.out.println("the coza roza loza");
                int a = 110;
               // System.out.print("1, 2");
                       for(int i= 1; i<=a; i++){
                           if(i%3 == 0){
                               System.out.print(" Coza, ");
                           }if(i%5 == 0){
                               System.out.print(" Loza, ");
                           }if(i%7 == 0){
                               System.out.print(" Woza, ");
                           }if(i%3 == 0 && i%5 == 0){
                               System.out.print(" CozaLoza, ");
                           }if(i%3 == 0&& i%7 == 0){
                               System.out.print(" CozaWoza, ");
                           }if(i%5 == 0 && i%7 == 0){
                               System.out.print(" LozaWoza, ");
                           }if(i%3 != 0 && i%5 != 0 && i%7 != 0){
                               System.out.print(i+", ");
                           }if(i%11 == 0){
                               System.out.println();
                           }
               }        
    }
    

    cozarozaloza() {
        System.out.println("the coza roza loza");
                int a = 110;
               // System.out.print("1, 2");
                       for(int i= 1; i<=a; i++){
                           if(i%3 == 0){
                               System.out.print(" Coza, ");
                           }if(i%5 == 0){
                               System.out.print(" Loza, ");
                           }if(i%7 == 0){
                               System.out.print(" Woza, ");
                           }if(i%3 == 0 && i%5 == 0){
                               System.out.print(" CozaLoza, ");
                           }if(i%3 == 0&& i%7 == 0){
                               System.out.print(" CozaWoza, ");
                           }if(i%5 == 0 && i%7 == 0){
                               System.out.print(" LozaWoza, ");
                           }if(i%3 != 0 && i%5 != 0 && i%7 != 0){
                               System.out.print(i+", ");
                           }if(i%11 == 0){
                               System.out.println();
                           }
               }        
    }

    
}
