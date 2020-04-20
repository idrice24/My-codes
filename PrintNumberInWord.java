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
public class PrintNumberInWord {
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);
        System.out.print("enter a number: ");
        int a = user.nextInt();
        switch(a){
            case 1:
                 System.out.println("ONE");
                         break;
            case 2:
                System.out.println("Two");
            break;
            
            case 3:
                 System.out.println("THREE");
                         break;
            case 4:
                System.out.println("Four");
            break;
            
            case 5:
                 System.out.println("Five");
                         break;
            case 6:
                System.out.println("Six");
            break;
            
            case 7:
                 System.out.println("Seven");
                         break;
            case 8:
                System.out.println("Eight");
            break;
            case 9:
                 System.out.println("Nine");
                         break;
            case 10:
                System.out.println("Ten");
            break;
        }
    }
    
}
