package src;
public class MethodOverriding {
    
    public static void main(String[] args) {
        C1 obj1 = new C1();
        obj1.m1(10,20);

        C2 obj2 = new C2();
        obj2.m1(12, 24);
    }
}

class C1
{
    void m1(int a, int b)
    {
        System.out.println("m1 of C1");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
class C2 extends C1
{
    void m1(int a, int b)
    {
        System.out.println("m1 of C2");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}