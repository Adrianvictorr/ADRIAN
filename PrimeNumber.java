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

public class PrimeNumber {
    
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your desired value here and click Enter key:");
        int Num = input.nextInt();
        
        int j=2, ch=0;
        
        while(j<=Num/2){
            if (Num%j==0){
                System.out.println(Num + " is not a Prime Number");
                
                ch=1;
                break;
        }
            else{
                j++;
            }}
            
        if (ch==0){
            
            System.out.println(Num + " is a Prime Number");
        
}
    }
}
