package src;
public class MethodOverloading {
    public static void main(String[] args) {
        Test obj1 = new Test();
        obj1.m1(10);
        obj1.m1(7.20);
        obj1.m1(7, 20);



    }
    
}
class Test
{
    void m1(int a)
    {
        System.out.println("value = "+ a);
    }
    void m1(double a)
    {
        System.out.println("value = "+ a);
    }
    void m1(int a, int b)
    {
        System.out.println("value 1 = "+ a);
        System.out.println("value 2 = "+ b);

    }
}