package HomeworkWeek6;

import java.util.Scanner;

public class Program19
{

    public static void main(String[] args)
    {
            Scanner in = new Scanner(System.in);
            System.out.print("Input a String in Upper Case: ");
            String line = in.nextLine();
            line = line.toLowerCase();
            System.out.println("The Conversion into Lower Case is:" +line);

    }


}
