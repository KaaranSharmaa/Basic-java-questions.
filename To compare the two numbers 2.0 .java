//To compare the two numbers ;
package javaProgram;
import java.util.Scanner;
import java.lang.Math;

public class Program9 {
    public static void main(String args[]){
        Scanner compare = new Scanner(System.in);
        System.out.println("Enter the first value1 below ");
        int value1 = compare.nextInt();
        System.out.println("Enter the second value2 below");
        int value2 = compare.nextInt();
        if(value2>value1)
            System.out.println("Value 2 is greater then Value 1");
        else
            System.out.println("Value 1 is greater then value 2");
        compare.close();
    }
}
