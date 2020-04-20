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
public class HND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner idrice = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("enter your name: ");
        String name = idrice.nextLine();
        System.out.println("hello "+name+ " Welcome to side Program!");
        System.out.printf("Select a number! :");
        System.out.println("1 ---> "+"Fibonacci Sequence ");
        System.out.println("2 ---> "+"CheckOddEven ");
        System.out.println("3 ---> "+"PrintNumberInWord ");
        System.out.println("4 ---> "+"PrintDayInWord");
        System.out.println("5 ---> "+"SumAverage Loop ");
        System.out.println("6 ---> "+"CozaLozaWoza ");
        System.out.println("7 ---> "+"Circle Computation (User input) ");
        System.out.println("8 ---> "+"Circle COmputatio (User input & Sentinel Value) ");
        System.out.println("9 ---> "+"ChecksVowelsDigits");
        System.out.println("10 ---> "+"Prime Checks And list first prime ");
        System.out.println("11 ---> "+"Decimal num to Octal ");
        System.out.println("12 ---> "+"convert minute to days and years ");
        System.out.println("13 ---> "+"Average values of an array and index");
        System.out.println("14 ---> "+"Amstrong Check number");
        System.out.println("15 ---> "+"LeapYearCheck ");
        System.out.println("enter a number! :");
        int b = idrice.nextInt();
        if( b == 1){
            cozarozaloza one = new cozarozaloza();
           System.out.print(one.cozarozaloza());
        }
    }
    
}
