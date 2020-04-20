/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hnd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.S;

/**
 *
 * @author Lenovo
 */
public class CheckVowelsDigits {
        ArrayList<String> word = new ArrayList<>();
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);
        System.out.println("enter a String: ");
        String pass = user.nextLine();
//        boolean /*add*/ = word.add(pass);
            
            
  
        String [] arr = { "a", "e", "i", "o", "u"};
        int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        for (String arr1 : arr) {
            for (String arr2 : arr) {
                if (arr2 == null ? pass == null : arr2.equals(pass)) {
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
    }
    
}
