//To compare the number the two are equal or not;
package javaProgram;
import java.util.Scanner;
import java.lang.Math;
public class program11 {
    public static void main(String[] args) {
        Scanner equal = new Scanner(System.in);
        System.out.println("Enter the first value below");
        int value1 = equal.nextInt();
        System.out.println("Enter the second  value below");
        int value2 = equal.nextInt();
        if(value1==value2)
            System.out.println(value1+" is equal too "+value2);
        else
        {
            System.out.println(value1 + " is not too  " + value2+" Try again ");

        }
        equal.close();

    }

}
