//How to apply maths formula in java;
package javaProgram;
import java.util.Scanner;
import java.lang.Math;
public class Program8 {
    public static void main(String[]args){
        int x,n;
        System.out.println("Enter the value of X and N for the below formula");
        Scanner formula =new Scanner(System.in);
         x = formula.nextInt();
         n = formula.nextInt();
        double formula1 = (Math.pow(x+5,n))-Math.sqrt((x-3)/(2*n));
        System.out.println(formula1);
        formula.close();
    }
}
