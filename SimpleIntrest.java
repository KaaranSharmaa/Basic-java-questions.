package javaProgram;
import java.util.Scanner;
public class Program2 {
    public static void main(String[]args){
        System.out.println("Enter the principle");
        Scanner simpleIntrest = new Scanner(System.in);
        float principle = simpleIntrest.nextFloat();
        System.out.println("Now enter the rate ");
        float rate =simpleIntrest.nextFloat();
        System.out.println("Now time  please");
        int time= simpleIntrest.nextInt();
        double si = principle*rate*time/100;
        System.out.println("The simple intrest is :"+ si);
        simpleIntrest.close();
    }
}
