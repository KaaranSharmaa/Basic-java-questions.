//program to check that a number is positive or negative or zero.
package javaProgram;
import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number to check that a number is positive or negative or zero.");
       int value = number.nextInt();
       if(value==0)
           System.out.println("The "+ value+" is equal to zero");
       else
       if (value<0)
           System.out.println("The"+ value+" is negative");
       else
       if(value==1)
           System.out.println("The "+ value+" is one");
       else
           System.out.println("The "+ value+" is greater then  one");

       number.close();

    }
}
