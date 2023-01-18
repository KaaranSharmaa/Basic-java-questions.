//Linear search.
package javaProgram;

import java.util.Scanner;

public class Program19 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the value in the array");
            int c = in.nextInt();
            array[i] = c;


        }
        System.out.println("Enter the  value to be searched  in an array");
        int search = in.nextInt();
        for (int j = 0; j < array.length; j++) {
            if (array[j] == search)
                System.out.println("Element founded hurray");
            else
                System.out.println("opseeeee not founded");


        }
    }
}
