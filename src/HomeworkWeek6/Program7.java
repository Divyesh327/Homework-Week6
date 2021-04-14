package HomeworkWeek6;

import java.util.Scanner;

public class Program7 {


        public static void main (String[] args)

        {
            double f;
            double Degree;
            Scanner A = new Scanner(System.in);

            System.out.print("Enter the Value of Fahrenheit");
            f = A.nextInt();
            Degree = ((f-32)*5/9);
            System.out.println("The Area of Circle is:" +Degree);


        }


    }
