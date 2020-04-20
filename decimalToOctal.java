/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hnd;

import static java.lang.Integer.toOctalString;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class decimalToOctal {
    public static void main(String[] args){
        int n;
        Scanner user = new Scanner(System.in);
        System.out.printf("enter a number in Base 10!");
        int a = user.nextInt();
        
            n = Integer.toOctalString(a);
            System.out.println(a);
        
          //  System.out.print("pleas enter a number either <0 or >0!");
        
    }
}
