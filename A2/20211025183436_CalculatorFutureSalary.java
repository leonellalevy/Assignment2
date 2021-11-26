/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorfuturesalary;
import java.util.Scanner;
/**
 *task_3
 * Write a method double calcFutureSalary(double curretSalary, int year) that 
 *takes an initial salary of a person, and a number of year. The method will 
 *calculate its future salary after a certain number of years. If the person 
 *works less than 3 years, the salary increases 3% each year. If a worker works
 *equal more than 3 years but less than 10 years, the salary increases 5% each
 *year. And if a worker works equal or more than 10 years. The salary increases
 *8% each year.
 *
 * @author Leonella Levy Martel
 */
public class CalculatorFutureSalary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
       //Prompt the user to enter the intial salary
        System.out.print("Enter your initial salary: $");
        double currentSalary = keyboard.nextDouble();
        //Prompt the user to enter the amount of years he(she) will work
        System.out.print("Enter the amount of years you will work: ");
        int year = keyboard.nextInt();
        //Print how much will be his new salary in x amount of years
        System.out.print("Your salary in " + year + " years will be: $");
        System.out.println(calcFutureSalary(currentSalary, year));
    }
    public static double calcFutureSalary(double currentSalary, int year) {
        //Get the future salary
        int i;
        double salary;
        for (i = 1; i <= year; i++) {
            if (i < 3) {
                currentSalary = currentSalary * 0.03 + currentSalary;
            } else if (i >= 3 && i < 10) {
                currentSalary = currentSalary * 0.05 + currentSalary;
            } else if (i >= 10) {
                currentSalary = currentSalary * 0.08 + currentSalary;
            }
        }
        return currentSalary; 
    }
}
