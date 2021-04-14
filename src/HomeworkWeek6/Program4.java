package HomeworkWeek6;

public class Program4
{
    int a = 2;
    int b = 4;
    static int c = 6;
    static int d = 8;

    public static void main (String[] args)


    {
        Program4 obj = new Program4();
        obj.call();
        receive();


    }

    void call()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(Program4.c);
        System.out.println(Program4.d);



    }

    static void receive()

    {
        Program4 obj1 = new Program4();
        System.out.println(obj1.a);
        System.out.println(obj1.b);

        System.out.println(c);
        System.out.println(d);


    }


}
