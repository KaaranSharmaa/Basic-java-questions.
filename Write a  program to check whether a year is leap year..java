//Write a  program to check whether a year is leap year.
package javaProgram;
import java.util.Scanner;
import java.lang.Math;
public class Program13 {
    public static void main(String[] args) {
        Scanner leap = new Scanner(System.in);
        System.out.println("Enter year below to weather it is leap or not");
        int year = leap.nextInt();
        if(year%4==0)
            System.out.println(year+" is a leap year");
        else
            System.out.println(year+" is not a leap year ");
        leap.close();


    }
}
