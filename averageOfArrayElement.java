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
public class averageOfArrayElement {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);
        int sum = 0, b;
        double avg;
        int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for(int i = 0; i<a.length; i++){
            sum += a[i];
            
        }
        avg = sum /a.length;
        System.out.println(avg);
            System.out.println("enter a number to check: ");
            b = user.nextInt();
            for(int i = 0; i<a.length; i++){
                if(b == a[i]){
                System.out.println("yes");
                System.out.println(i);
                
                              }
                                            }
            for(int j = 0; j<a.length; j++){
                if(Math.max(a[j], a.length) > Math.min(a[j], a.length)){
                    System.out.println(Math.max(a[j], a[j]));
                }else{
                     System.out.println(Math.min(a[j], a[j]));
            }
            
            }
            
            }
}
