package HomeworkWeek6;

import java.util.Scanner;

public class Program9 {

   public static void main(String[] args)
    {
        String Upper, Lower;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Name in Uppercase : ");
        Upper = scan.nextLine();

        Lower = Upper.toLowerCase();
        System.out.print("Name in Lowercase is : " + Lower);
    }
}