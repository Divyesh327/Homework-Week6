package HomeworkWeek6;

public class Program3
{

    int a = 20;
    static int b = 30;

    public static void main (String[] args)

    {

    Program3 obj = new Program3();
    obj.call();
    receive();


    }

    void call()
    {

        System.out.println(a);
        System.out.println(Program3.b);

    }

    static void receive()

    {
        Program3 obj1 = new Program3();
        System.out.println(obj1.a);
        System.out.println(b);

    }

}
