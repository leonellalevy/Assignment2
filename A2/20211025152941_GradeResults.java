/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graderesults;
import java.util.Scanner;
/**
 * Task_04 Write a method char toLetterScore(double digitScore) that takes a 
 * digit score in range [0, 100], then calculate the letter score based on it.
 * 
 * @author Leonella Levy Martel
 */
public class GradeResults {
    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    //Prompt the user to enter the score
    System.out.print("Enter your score: ");
    double digitScore = keyboard.nextDouble();
    char letterScore = toLetterScore(digitScore);
    //Print the message related to the score with version 1
    printMessage1(letterScore);
    //Print the message related to the score with version 2
    printMessage2(letterScore);
    }
    public static char toLetterScore(double digitScore){
    //Get the digit score change into a letter score
    if (digitScore>=90 & digitScore<=100)
    return 'A';
    else if (0 <= digitScore && digitScore <90)
    return 'B';
    else if (70 <= digitScore && digitScore <80)
    return 'C';
    else if(60 <= digitScore && digitScore <70)
    return 'D';
    else if(0 <= digitScore && digitScore <60)
    return 'F';
        return 0;
    }
    public static void printMessage1(char letterScore){
    //Get the letter score change into the message related to it(first version)
    System.out.print("Message with version 1:");
    if (letterScore=='A'||letterScore=='a') 
    System.out.println("Excellent");
    else if (letterScore=='B'||letterScore=='b'||
            letterScore=='C'||letterScore=='c')
    System.out.println("Well done");
    else if (letterScore=='D'||letterScore=='d')
    System.out.println("Passed");
    else if (letterScore=='F'||letterScore=='f')
    System.out.println("Better try again"); 
    }   
    public static void printMessage2(char letterScore){
    //Get the letter score change into the message related to it(second version)
    System.out.print("Message with version 2:");
    switch (letterScore){
        case 'A': System.out.println("Excellent");break;
        case 'B': System.out.println("Well done");break;
        case 'C': System.out.println("Well done");break;
        case 'D': System.out.println("Passed");break;
        case 'F': System.out.println("Better try again");break; 
    }
    }
} 