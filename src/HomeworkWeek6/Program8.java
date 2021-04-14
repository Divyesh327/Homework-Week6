package HomeworkWeek6;

import java.util.Scanner;

public class Program8
{

    public static void main (String[] args)

    {

        int base,height;
        double Area;
        Scanner A = new Scanner(System.in);

        System.out.print("Enter the Value of Base");
        base = A.nextInt();
        System.out.print("Enter the Value of Height");
        height = A.nextInt();

        Area = 0.5*base*height;
        System.out.println("The Area of Triangle is:" +Area);


    }


}
