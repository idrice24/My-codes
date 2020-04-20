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
public class MinuteToDaysAndYears {
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);
        double a, x, y;
        System.out.print("enter the minute: ");
        a= user.nextInt();
        x =  (a/1440);
        y = (a/525600);
        System.out.println("in Days it is: "+x+"days");
        System.out.println("in Year it is: "+y+"years");
    }
    
}
