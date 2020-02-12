/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shruti;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author shruti
 */
public class Shruti {

    /**
     * @param args the command line arguments
     */
     
     
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        System.out.println("Programming II");
        System.out.println("Grading Ruberik");
        System.out.println("Test 1 and 2 10% each = 20");
        System.out.println("Final Exam 30% = 30");
        System.out.println("Assignment1, 2, 3 and 4 10% each = 40" );
        System.out.println("Attendance= 10");
        System.out.println("Total = 100");
        int n=6;
        ArrayList<String>[] Grade = new ArrayList[n];
        Grade[0]= new ArrayList<String>(); 
        Grade[0].add("RollNum");
        Grade[0].add("test1");
        Grade[0].add("test2");
        Grade[0].add("Final");
        Grade[0].add("TestValue");
        Grade[0].add("Project1");
        Grade[0].add("Project2");
        Grade[0].add("Project3");
        Grade[0].add("Project4");
        Grade[0].add("ProjectValue");
        Grade[0].add("AttendDays");
        Grade[0].add("AttendValue");
        Grade[0].add("Name");
        Grade[0].add("Total");
        Grade[0].add("Grade");
     
        try (FileReader test = new FileReader("test.txt")) {
            BufferedReader testCal = new BufferedReader(test);
            String s;
            int counter=0;
            while((s = testCal.readLine()) != null) {
               if(counter!=0){
                String rollNum = s.substring(0,2);
                String testScore1 = s.substring(3, 5);
                String testScore2 = s.substring(6, 8);
                String Finalexam = s.substring(9, 11);
              
                Grade[counter]= new ArrayList<String>(); 
                Grade[counter].add(rollNum);
                Grade[counter].add(testScore1);
                Grade[counter].add(testScore2);
                Grade[counter].add(Finalexam);
                
                double  testValue = Test(Double.parseDouble(testScore1), Double.parseDouble(testScore2), Double.parseDouble(Finalexam));
                Grade[counter].add(String.valueOf(testValue)) ;     
               }
               counter++;          
               
                   
            }        
        }
       
         try (FileReader assignment = new FileReader("assignment.txt")) {
            BufferedReader assignmentCal = new BufferedReader(assignment);
            String s;
           int counter=0;
            while((s = assignmentCal.readLine()) != null) {
               if(counter!=0){
             
               String AScore1 = s.substring(3, 6);
               String AScore2 = s.substring(7, 10);
               String AScore3 = s.substring(11, 14);
               String AScore4 = s.substring(15, 18);
                          
               Grade[counter].add(AScore1);
               Grade[counter].add(AScore2);
               Grade[counter].add(AScore3);
               Grade[counter].add(AScore4);
               Double AssignmentValue = Grade(Double.parseDouble(AScore1),Double.parseDouble(AScore2), Double.parseDouble(AScore3), Double.parseDouble(AScore4));
               Grade[counter].add(String.valueOf(AssignmentValue)) ; 
               }
               counter++;  
            }
        }
        try (FileReader attendance = new FileReader("attendance.txt")) {
            BufferedReader  attendanceCal= new BufferedReader(attendance);
            String s;
            int totalClassDays=25;
           int counter=0;
            while((s = attendanceCal.readLine()) != null) {
               if(counter!=0){
             
               String AttendDays = s.substring(3, 5);
               String Name= s.substring(6);
               
                          
               Grade[counter].add(AttendDays);
               
               double AttendValue = Attendance(Double.parseDouble(AttendDays),totalClassDays);
               Grade[counter].add(String.valueOf(AttendValue)) ; 
               Grade[counter].add(Name);
               }
               counter++;  
            }
        } 
        for( int i=1; i<=5; i++){
            String finalGrade=null;
         double testValue=Double.parseDouble(Grade[i].get(4));
         double gradeValue=Double.parseDouble(Grade[i].get(9));
         double  attendValue=Double.parseDouble(Grade[i].get(11));
         double Total= testValue+gradeValue+attendValue;
         Grade[i].add(String.valueOf(Total));
         if(Total>=94){finalGrade="A";}
         else if (Total>=90 && Total <94) {finalGrade="A-";}
         else if (Total>=87 && Total <90) {finalGrade="B+";}
         else if (Total>=84 && Total <87) {finalGrade="B";}
         else if (Total>=80 && Total <84) {finalGrade="B-";}
         else if (Total>=77 && Total <80) {finalGrade="C+";}
         else if (Total>=70 && Total <77) {finalGrade="C";}
         else if (Total>=67 && Total <70) {finalGrade="D+";}
         else if (Total>=60 && Total <67) {finalGrade="D";}
         else {finalGrade="F";}
         Grade[i].add(finalGrade);
         
        }
       
        for( int i=0; i<=5; i++){
            System.out.println(Grade[i]);
        }
    }   
    
    public static double Test(double a, double b, double c){
        
       double Value= ((a/25)*10)+((b/25)*10)+((c/50)*30);
        
        return Value;
    }
    public static double Grade(double a, double b, double c, double d){
       double Value= ((a+b+c+d)/400)*40;
        return Value;
    }
    public static double Attendance(double a, double b){
        double Value =((a/b)*10);
        return Value;
    }
}
//test1 and test 2 10%
//final 30%
//assignment 40%
//attendance 10%