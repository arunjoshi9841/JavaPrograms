/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int points=0;
        System.out.println("Welcome to the java book club");
        System.out.println("Are you a member of our book club?");
        System.out.println("Enter 'y' or 'N'");
        Scanner Keyboard= new Scanner(System.in);
        String member= Keyboard.nextLine();
        char member1= member.charAt(0);
        if(member1=='y'|| member1=='Y'){
            System.out.println("");
            System.out.println("How many books did you buy this month 0-4");
            int Booknum= Keyboard.nextInt();
            switch (Booknum){
        case 0:
            points= 0;
           
         case 1:
            points= 5;   
        case 2:
            points= 15;
        case 3:
            points= 30;
        case 4:
            points= 60;
        }
            
         System.out.println("You have earned a total of "+ points+" points for purchasing "+ Booknum+" number of books");    
        
    }
        
        
    }
    
}
