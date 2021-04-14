package HomeworkWeek6;

import java.util.Scanner;

public class Program13
{

        public static void main (String[] args)

        {

            int num1,num2,num3;
            double Average;
            Scanner A = new Scanner(System.in);

            System.out.print("Enter the One Value:");
            num1 = A.nextInt();
            System.out.print("Enter the Second Value:");
            num2 = A.nextInt();
            System.out.print("Enter the Second Value:");
            num3 = A.nextInt();

            Average = ((num1+num2+num3)/3);
            System.out.println("The Average of Three Numbers:" +Average);


        }

}
