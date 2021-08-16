package src;
public class AccessModifiers {
    public static void main(String[] args) {
        A1 obj1 = new A1();
        obj1.a = 9; 
    }
}

class A1 // this is only visable in this package, and no other ones
{
    int a; // default is public int a
    private int b; // only see in this class
    protected int c; // can be access by child class, such as A2
    void m1()
    {

    }
}

class A2 extends A1
{
int child = 5 + c;
}