package src;

public class StaticMembers {
    public static void main(String[] args) {
        D1 objA = new D1();
        D1 objB = new D1();
        D1 objC = new D1();

        System.out.println("count = " + D1.count);

    }
}

class D1
{
    static int count = 0;
    D1()
    {
        count++;
    }
}