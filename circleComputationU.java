/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hnd;

import java.math.RoundingMode;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class circleComputationU {
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);
        double pie = 3.14;
        double area;
        System.out.printf("enter a radius: ");
        int r = user.nextInt();
        if(r == -1){
            
        }else{
            area =(pie * r * r);
            System.out.printf("the area is %.2f%n ", area);
            System.out.println();
        }
        
    }
    
}
