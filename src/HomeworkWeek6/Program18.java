package HomeworkWeek6;

import java.util.Scanner;

public class Program18
{
    public static void main (String[] args)
    {

     int a,b;
     double add,sub,mul,div,mod;
     Scanner A = new Scanner(System.in);
     System.out.print("Enter the First Value");
     a = A.nextInt();

     System.out.print("Enter the Second Value");
     b = A.nextInt();

     add=a+b;
     System.out.println("The Addition is:" +add);

     sub=a-b;
     System.out.println("The Subtraction is:" +sub);

     mul=a*b;
     System.out.println("The Multiplication is:" +mul);

     div= a/b;
     System.out.println("The Division is:" +div);

     mod=a%b;
     System.out.println("The Modulus is:" +mod);


    }


}
