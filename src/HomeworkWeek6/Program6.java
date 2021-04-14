package HomeworkWeek6;

import java.util.Scanner;

public class Program6
{

    public static void main (String[] args)

    {
        int r;
        double pi = 3.14;
        double Area;
        Scanner A = new Scanner(System.in);

        System.out.print("Enter the Value of Radius");
        r = A.nextInt();
        Area = pi*r*r;
        System.out.println("The Area of Circle is:" +Area);


    }


}
