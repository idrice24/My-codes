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
public class OddorEven {

    /**
     *
     * @param args
     * @return
     */
    public static void main(String[] args){
            Scanner user = new Scanner(System.in);
            int a;
            System.out.print("enter a number: ");
            a = user.nextInt();
            if( a%2 == 0){
                System.out.println("the number is even: "+a);
            }else{
                System.out.println("the number is Odd: "+a);
            
            }
            System.out.println("BYE!!");
    }
    
}
