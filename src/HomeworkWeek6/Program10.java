package HomeworkWeek6;

import java.util.Scanner;

public class Program10
{

    public static void main(String[] args)
        {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter number:");
            int n,m;
            n=s.nextInt();
            for(m=1; m <= 10; m++)
            {
                System.out.println(n+" * "+m+" = "+n*m);
            }
        }
}


