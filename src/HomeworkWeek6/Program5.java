package HomeworkWeek6;

public class Program5
{

    int a = 10;
    int b = 20;

    public static void main (String[] args)

    {

    Program5 obj = new Program5();
    obj.add();
    obj.sub();
    mul();
    div();

    }

    void add()
    {

    int c = a+b;
    System.out.println("The Addition is:"  +c);

    }

    void sub()
    {

     int d = a-b;
     System.out.println("The Subtraction is:"  +d);

    }

    static void mul()
    {

    Program5 obj1 = new Program5();
    int D = obj1.a * obj1.b;
    System.out.println("The Multiplication is:" +D);

    }

    static void div()
    {

    Program5 obj2 = new Program5();
    int E = obj2.b/obj2.a;
    System.out.println("The Division is:" +E);

    }

}
