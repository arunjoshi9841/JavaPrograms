/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcs;

import java.util.Scanner;

/**
 *
 * @author arunj
 */
public class LCS {
   public int lcs( char[] X, char[] Y, int m, int n )
  {
    int L[][] = new int[m+1][n+1];
 
    
    for (int i=0; i<=m; i++)
    {
      for (int j=0; j<=n; j++)
      {
        if (i == 0 || j == 0)
            L[i][j] = 0;
        else if (X[i-1] == Y[j-1])
            L[i][j] = L[i-1][j-1] + 1;
        else
            L[i][j] = max(L[i-1][j], L[i][j-1]);
      }
    }
  return L[m][n];
  }
int max(int a, int b)
  {
    return (a > b)? a : b;
  }
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LCS arun = new LCS();
        System.out.println("Enter a string");
        Scanner joshi = new Scanner(System.in);
        String s1= joshi.nextLine();
         System.out.println("Enter another string");
       
        String s2= joshi.nextLine();
        
    

 
    char[] X=s1.toCharArray();
    char[] Y=s2.toCharArray();
    int m = X.length;
    int n = Y.length;
 
    System.out.println("Length of LCS is" + " " +
                                  arun.lcs( X, Y, m, n ) );
    }
    
}
