/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Scanner;


public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int month=0;
         double interest=0;
        System.out.println("This is the our car Dealership");
        System.out.println("Please enter the cost of the car");
        Scanner Keyboard= new Scanner(System.in);
        double price= Keyboard.nextDouble();
        System.out.println("Can you also provide your monthly payment on the car");
      
        double monthrate= Keyboard.nextDouble();
        
        System.out.println("");
        System.out.println("With an interest of 9% per year");
        
        do{
            interest=interest+price*0.0075;
          price=price -(monthrate-price*0.0075);
           month++;
            
        } 
            while(price>0);
        System.out.println("you will fully pay your car loan in "+ month+" months");
        System.out.println("YOu will be paying a interest of "+interest+" dollars over the time period");
    }
    
}
