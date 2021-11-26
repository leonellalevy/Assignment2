/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dayscalculator;
import java.util.Scanner;
/**
 * Task_01 Write a method int calcDays(int month, int year) that receive a month
 * and a year, and then return the number of days in that month. Create two 
 * versions of calcDays(): 
 * 1.	calcDays1(): with if…else if…else structure
 * 2.	calcDays2(): with switch…case structure
 * Write a method boolean isLeapYear(int year) to check if a year is a leap year
 * or not. 
 * 
 * @author Leonella Levy Martel
 */
public class DaysCalculator {
    public static void main(String[] args) {
    Scanner keyboard =new Scanner(System.in);
    //Prompt the user to enter a month
    System.out.print("Enter a month in number between 1 and 12:");
    int month = keyboard.nextInt();
    //Prompt the user to enter a year
    System.out.print("Enter a full year (e.g., 2001):");
    int year = keyboard.nextInt(); 
    //Print the number of days in that month(first version)
    System.out.print("Number of days in that month (with version 1): ");
    System.out.println(calDays1(month,year));
    //Print the number of days in that month(first version)
    System.out.print("Number of days in that month (with version 2): ");
    System.out.println(calDays2(month,year));
}
    public static int calDays1(int month, int year){
    //Get the number of year in a that month with first version
    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || 
            month == 10 || month == 12)
        return 31;
    else if (month == 4 || month == 6 || month ==9 || month==11)
        return 30;
    else if (month==2)
        return isLeapYear(year)?29:28;
    return 0;
    }
    public static int calDays2(int month, int year){
    //Get the number of year in a that month with first version
    switch (month){
        case 1: return 31; 
        case 2: return isLeapYear(year)?29:28;
        case 3: return 31;
        case 4: return 30;
        case 5: return 31;
        case 6: return 30;
        case 7: return 31;
        case 8: return 31;
        case 9: return 30;
        case 10:return 31; 
        case 11:return 30;
        case 12:return 31;
        }
        return 0;
        }
    public static boolean isLeapYear(int year){
    //DEtermine if it is a leap year
    return (year%400==0||(year%4==0&year%100!=0));
    }
}
    

