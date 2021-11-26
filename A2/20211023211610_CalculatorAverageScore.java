/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatoraveragescore;
import java.util.Scanner;
import java.util.Random;
/**
 * Task 2 Write a method double calcAverageScore(int num) that takes a positive
 * integer number to indicate how many scores do you need. Then generate that 
 * many random scores in range [0, 100]. And then calculate the average of the 
 * scores. When you calculate the average, if a score is lower than 40, then it 
 * will not be used. If all scores are lower than 40, the average will be 0.
 * @author Leonella Levy Martel
 */
public class CalculatorAverageScore {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    //Prompt the user to enter the number of scores 
    System.out.print("Enter how many scores you want to generate: ");
    int num = keyboard.nextInt();
    //Print the average of the scores higher than 40
    System.out.println("The average of the scores is: " +calcAverageScore(num));
    }
    public static double calcAverageScore(int num){
    Random rand =new Random();
    int result =0;
    int numbers=0;
    //Determine the value of the random scores between 0 and 100
    System.out.print("The scores are: ");
    for(int i=0; i<num; i++){
    int a = 100;
    int random_number = rand.nextInt(a);
    //Print the scores
    System.out.print(random_number + " ");
    //Do not consider scores lower than 40
    if (random_number>40){
            result+=random_number;
    numbers++;
    }
    }
    //Get the average of the scores
    if(numbers==0){
    System.out.println(" ");
    double average=0;
    return average;
    }
    else {
    System.out.println(" ");
    double average = result/numbers;
    return average;
    } 
    }
}


        
    

  