// swaping program
package javaProgram;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
public class Program6 {
   public  static void main(String[]args){
         System.out.println("Enter the first value below");
         Scanner swap = new Scanner(System.in);
         int variable1 = swap.nextInt();
         System.out.println("Enter the second  value ");
         int variable2 = swap.nextInt();
         int variable3 =variable1;
         variable1 = variable2;
         variable2=variable3;
         System.out.println("The value after swaping are Variable1 :-"+ variable1+ "And the value of variable2 is :-"+ variable2);
         swap.close();
         LocalDate karan= LocalDate.of(2011,Month.january,12);
         LocalTime alram=LocalTime.of(7,30);

    }



}
