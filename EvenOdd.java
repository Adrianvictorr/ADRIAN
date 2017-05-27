/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacmp202;

/**
 *
 * @author ADRIAN_VICTOR
 */

import java.util.Scanner;
public class EvenOdd {
    
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your desired value here and click Enter key: ");
        float Num = input. nextFloat();
        
        if(Num%2==0){
            System.out.println(Num + " is an Even number");
            
        }
        
        else{
            System.out.println(Num + " is an Odd number");
        }
        
    }
    
}
