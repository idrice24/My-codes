/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hnd;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Exam {
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);
        int [] a = new int[10];
        int [] b = new int[10];
        int [] c = new int[10];
        double AVG, AV = 0;
       
        int sum1 = 0, sum2 = 0, sum3 = 0;
        int i;
        for(i = 0; i<a.length; i++){
            System.out.print("\tenter M1 of each student on 20: ");
            
            a[i] = user.nextInt();
            if(a[i]<0 && a[i]>20){
            AV = a[i];
            sum1 += (2*a[i])/10;
            }
        }
        System.out.print(a[1]);
            for(int j = 0; j<a.length; j++){
                System.out.println("");
                System.out.print("enter student M2 on 20: ");
                b[j] = user.nextInt();
                sum2 += (3*b[j])/10;
            }
            for(int k= 0; k<a.length; k++){
                System.out.println("");
                    System.out.print("\tenter student M3 on 20: ");
                    c[k]= user.nextInt();
                    sum3 += (4*c[k])/10;     
                }
        
            System.out.printf("\nThe AV of Student1 is %.2f ", (a[0]+b[0]+c[0])/3.0);
            System.out.printf("\nThe AV of Student2 is %.2f ", (a[1]+b[1]+c[1])/3.0);
            System.out.printf("\nThe AV of Student3 is %.2f ", (a[2]+b[2]+c[2])/3.0);
            System.out.printf("\nThe AV of Student4 is %.2f ", (a[3]+b[3]+c[3])/3.0);
            System.out.printf("\nThe AV of Student5 is %.2f ", (a[4]+b[4]+c[4])/3.0);
            System.out.printf("\nThe AV of Student6 is %.2f ", (a[5]+b[5]+c[5])/3.0);
            System.out.printf("\nThe AV of Student7 is %.2f ", (a[6]+b[6]+c[6])/3.0);
            System.out.printf("\nThe AV of Student8 is %.2f ", (a[7]+b[7]+c[7])/3.0);
            System.out.printf("\nThe AV of Student9 is %.2f ", (a[8]+b[8]+c[8])/3.0);
            System.out.printf("\nThe AV of Student10 is %.2f ", (a[9]+b[9]+c[9])/3.0);
            

         AVG = ((sum1+sum2+sum3)/9);
         System.out.printf("\nthe AVG of the class is %.2f\n", AVG);

        
    }
}
