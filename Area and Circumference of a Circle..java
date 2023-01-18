package javaProgram;
  //Area and circumference of a Circle.
import java.util.Scanner;

public class AreaandcircumferenceofaCircle. {
  
    public static void main(String[] args) {
        System.out.println("Enter the radius of a circle");
        Scanner radius = new Scanner(System.in);
        int radiusObj= radius.nextInt();
        float radius_of_circle =(3.14159f)*radiusObj*radiusObj;
        float circumference_of_circle=2*(3.14159f)*radiusObj;
        System.out.println("The area of circle is "+ radius_of_circle + " And " +
                "The circumfernce of a circle is :"+circumference_of_circle);

        radius.close();
    }

}
