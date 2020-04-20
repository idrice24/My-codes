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
public class PrintDayInWord {
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);
        System.out.println("enter a number: ");
        int a = user.nextInt();
        System.out.println("for switch: "+getDayNum(a));
        System.out.println("For Nested-If: "+getDayNum1(a));
        
    }
    public static String getDayNum(int num){
        String dayNum = "";
        switch(num){
            case 0:
                dayNum = "Sunday";
            break;
                        case 1:
                dayNum = "Monday";
            break;
                        case 2:
                dayNum = "Tuesday";
            break;
                        case 3:
                dayNum = "Wednesday";
            break;
                        case 4:
                dayNum = "Thuasday";
            break;
                        case 5:
                dayNum = "Friday";
            break;
                        case 6:
                dayNum = "Satuday";
            break;
                        default :
                            System.out.println("invalid day number!!");
                            break;
                                
        }
        return dayNum;
        
    }
    public static String getDayNum1(int num){
        String dayNum1 = "";
              if (num == 0){
                  dayNum1 = "Sunday";
              }
                  if(num == 1){
                      dayNum1 = "Monday";
                  }
                    if(num == 2){
                        dayNum1 = "Tuesday";
                    }
                        if(num == 3){
                            dayNum1 = "Wednesday";
                        }
                            if(num == 4){
                                dayNum1 = "Thuasday";
                            }
                                if(num == 5){
                                    dayNum1 = "Friday";
                                }
                                    if(num == 6){
                                        dayNum1 = "Satuday";
                                    }if(num <0 && num >6) {
                                        dayNum1 = "Invalide day number!!";
                                    }
                                
                           
        return dayNum1;
            
        }
    }
