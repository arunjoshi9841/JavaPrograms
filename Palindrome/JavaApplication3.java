/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author aronj
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
         try (FileReader fr = new FileReader("Palindromes.txt")) {
            BufferedReader br = new BufferedReader(fr);
            String s;
           
            while((s = br.readLine()) != null) {
                String sample= "";
               for(int i =s.length()-1; i>=0; i--){
                   
                   char A = s.charAt(i);
                   sample= sample+A;
                   
               }
                System.out.println(sample);
            
                
                if (s.equalsIgnoreCase(sample)){
                    System.out.print(s);
                    System.out.println( " is a Palindrome");
                    break;
                }
                
                
  
    }
         }
    }
}
    
    
