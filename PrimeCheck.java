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
public class PrimeCheck {
    public static void main(String[] args){
            Scanner user = new Scanner(System.in);
            int a;
            System.out.print("enter a number: ");
            a = user.nextInt();
            System.out.print("2, 3,");
            for(int i=2; i<=a; i++){
            if(i%2 !=0 && i%3 !=0){
                
                System.out.print(i+",");
           }
    }
    }
}
