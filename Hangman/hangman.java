 package hangman;
 
 import java.util.*;
 
 public class hangman {
     
     public static final String word= "woodchuck";
     public static StringBuilder guess;
     public static int misses;
 
     public static void InitializeBoard(char [][]b)
     {
         for (int i=0; i<7; i++)
         {
             for (int j=0; j<7; j++)
                 b[i][j]=' ';
         }
             for (int j=0; j<=4; j++)
                 b[0][j]='-';
             for (int i=1; i<=6; i++)   
                 b[i][0]='|';
             b[1][4]='|';
     }
     
     public static void PrintBoard(char [][]b)
     {
         for (int i=0; i<7; i++)
         {
             for (int j=0; j<7; j++)
             {
                 System.out.print(b[i][j]);
             }
             System.out.println();
         }
     }
     
     public static void Guess(char l, StringBuilder g) 
     //g is the placeholder of single letter guess and the user visible word// the word having lines and correctly guessed letters
     {
         boolean correct=false;
         for (int i=0; i<word.length(); i++)
         {
             if (l==word.charAt(i))
         {
             g.setCharAt(i, l);
             correct=true;
         }
         }
             if (correct==false)
             misses++;
     }
     
     public static void Redraw(char l, char [][]b)
     {
         if (misses==1)
         {
             b[2][3]='(';
         }
         if (misses==2)
         {
             b[2][5]=')';
         }
         if (misses==3)
         {
             b[3][3]='/';
         }
         if (misses==4)
         {
             b[3][4]='|';
         }
         //if (misses==5)
         //{
             //b[3][5]='\';
         //}
         if (misses==6)
         {
             b[4][4]='|';
         }
         if (misses==7)
         {
             b[5][3]='|';
         }
         if (misses==8)
         {
             b[5][5]='|';
         }
         if (misses==9)
         {
             b[6][2]='_';
         }
         if (misses==10)
         {
             b[6][6]='_';
         }
     }
     
     public static boolean GameOver(int ng)
     {
         if (ng10)
         {
             System.out.println("You Lose!!");
             return true;
         }
          else if (guess.indexOf("_")<0)
          {
              System.out.println("Great Guesss!! You Win!");
              return true;
          }
             return false;
     }
     
     public static void PrintWord(StringBuilder s)
     {
         System.out.println(s);
     }
     
     public static void main (String []args)
     {
         char[][]board=new char[7][7];
         InitializeBoard(board);
         PrintBoard(board);
         guess= new StringBuilder("_________");
         
         misses=0;
         Scanner keyboard= new Scanner(System.in);
         while (GameOver(misses)==false)
         {
             System.out.print("Enter your guess!");
             char letter=keyboard.next().charAt(0);      
             Guess(letter, guess);
             char [][] newboard= new char[7][7];
             Redraw(letter, newboard);
             PrintWord(guess);
             misses++;
         }
     }
 } 