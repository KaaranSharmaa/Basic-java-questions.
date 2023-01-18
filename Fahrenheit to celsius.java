// Fahrenheit to celsius.

package javaProgram;
import java.util.Scanner;
public class Program4 {

    public static void main(String args[]){
        System.out.println("Enter the the temprature in Fahrenheit");
        Scanner temp = new Scanner(System.in);
       int tempFahrenheit=temp.nextInt();
     int  celsius = 5/9*(tempFahrenheit-32);
        System.out.println("The temp in Celsius is : " + celsius);
        temp.close();
    }
}
