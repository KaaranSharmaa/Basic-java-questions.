// program to find the area of triangle
package javaProgram;
import  java.util.Scanner;
public class Program5 {
    public static void main(String[]args){
        System.out.println("Enter the Base of the triangle");
        Scanner triangle =new Scanner(System.in);
        int base =triangle.nextInt();
        System.out.println("Enter the height of the triangle");
        int height = triangle.nextInt();
        int areaOfTriangle= base*height;
        System.out.println("The area of triangle is :"+areaOfTriangle/2);
        triangle.close();
    }

}
