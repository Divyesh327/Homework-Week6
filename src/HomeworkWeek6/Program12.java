package HomeworkWeek6;

public class Program12
{

    public static void main (String [] args)

    {

    Program12 obj = new Program12();
    obj.operations();


    }


    void operations()
    {

    double a = 25.5;
    double b = 3.5;
    double c = 40.5;
    double d = 4.5;
    double ans;
    ans = ((a*b-b*b)/(c-d));
    System.out.println("The Answer is:"  +ans);

    }


}
