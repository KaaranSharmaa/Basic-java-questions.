// To print the grade according to the marks
//secured by students.
//Marks Grade
//>=90 A
//>=80 B
//>=70 C
//>=60 D
// otherwise F
package javaProgram;
import java.util.Scanner;
import java.lang.Math;
public class Program15 {
    public static void main(String[] args) {
        Scanner grade = new Scanner(System.in);
        System.out.println("Enter the marks below for grade ");
        int marks = grade.nextInt();
        if(marks>=90)
            System.out.println("Your grade is A");
        else
        if (marks>=80)
            System.out.println("Your grade is  B");
        else
        if (marks>=70)
            System.out.println("Your grade is C");
        else
        if (marks>60)
            System.out.println("Your grade is D");
        else
            System.out.println("Opppse you are fail");
        grade.close();
    }

}
