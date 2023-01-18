//sum of two numbers.
package javaProgram;
import java.util.Scanner;
public class Program3 {
    public static void main(String args[]){
        Scanner sum = new Scanner(System.in);
        System.out.println("Enter the two number to sum up them");
        System.out.println("Input the first number");
        Integer number1=sum.nextInt();
        System.out.println("Input the second number");
        Integer number2=sum.nextInt();
         int addition = number1+number2;
         System.out.println("The sum of two number is :"+ addition);
         sum.close();

    }
}
