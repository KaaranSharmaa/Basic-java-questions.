package javaProgram;
import java.util.Scanner;
public class Program17 {
    public static void main(String[] args) {
        Scanner N =  new Scanner(System.in);
        System.out.println("Enter the digit below");
        int number = N.nextInt();
        int c=0;
        for (int i=0; i<=number;i++){
            number=number/10;
            c++;
        }
        if(c%2==0){
            
        }

        System.out.println(c+1);


    }

}
