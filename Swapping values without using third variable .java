package javaProgram;
import java.util.Scanner;
public class Program7 {
    public static void main(String[] args) {
        Scanner swap = new Scanner(System.in);
        System.out.println("Enter the first value below");
        int a = swap.nextInt();
        System.out.println("Enter the second  value ");
        int b = swap.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("The value after swapping is  "+a+" "+b);

    }

}
