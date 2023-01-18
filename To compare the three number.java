//To compare the three number;
package javaProgram;

import java.util.Scanner;
import java.lang.Math;
public class Program10 {
    public static void main(String[]args){
        Scanner compare= new Scanner(System.in);
        System.out.println("Enter the first value1 below");
        int value1 = compare.nextInt();
        System.out.println("Enter the first value2 below");
        int value2 = compare.nextInt();
        System.out.println("Enter the first value3 below");
        int value3 = compare.nextInt();
        if((value1>value2)&&(value1>value3))
            System.out.println(  value1 +" is greater among them");
        else
        if(value2>value3)
            System.out.println( value2+"is greater among them");
        else
            System.out.println( value3+" is greater among them");
        compare.close();
    }

}
