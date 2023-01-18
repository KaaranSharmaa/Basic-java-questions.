//To check the number weather a number is even or not
package javaProgram;
import java.util.Scanner;
import java.lang.Math;
public class Program12 {
     public  static void main (String args []){
         Scanner even = new Scanner(System.in);

      System.out.println("Write the number to check weather a number is even or not");
       int value = even.nextInt();
       if(value%2==0)
           System.out.println("The  "+value+" is even");
       else
           System.out.println("The "+value+" is not even");
     }
}
