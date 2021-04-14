package HomeworkWeek6;

import java.util.Scanner;

public class Program14
{

    public static void main (String[] args)

    {

        double Width,Height;
        double Area;
        double Perimeter;
        Scanner A = new Scanner(System.in);

        System.out.print("Enter the Width:");
        Width = A.nextInt();
        System.out.print("Enter the Height:");
        Height = A.nextInt();

        Area = (Width*Height);
        System.out.println("The Area of Rectangle is:" +Area);

        Perimeter = 2 * (Width+Height);
        System.out.println("The Perimeter of Rectangle is:" + Perimeter);


    }



}
