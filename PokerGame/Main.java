/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokergame;

/**
 *
 * @author aronj
 */
public class Main {
    
 public static void main(String[] args) {
       
        int Winner;
        
       
       System.out.println("---------------------------------------");
       Deck deck= new Deck();
       Hand hand= new Hand(deck);
       Hand hand2= new Hand(deck);
       hand.display();
       hand.displayAll();
       hand2.display();
       hand2.displayAll();
       Winner= hand.compareTo(hand2);
       System.out.println(" ");
       //System.out.println(hand.compareTo(hand2));
       System.out.println("Team "+Winner+ "--> You Win!!");
       System.out.println("---------------------------------------");
       
   }
}
