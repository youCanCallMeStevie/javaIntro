package src;
public class MethodTest {
    public static void main(String[] args) {
        m1();
        m2();
        m1();
        m2();
        m1();

       int addition = add(30,10);
       int subtraction = subtract(30, 10);
       System.out.println(addition);
       System.out.println(subtraction);


    }
static void m1()
{
    System.out.println("Line 1");
    System.out.println("Line 2");
    System.out.println("Line 3");
}
static void m2()
{
    System.out.println("Hellow World");
}

// static void add(int a, int b)
// {
//     System.out.println("addition =" + (a+b));
// }
// static void subtraction(int a, int b)
// {
//     System.out.println("subtraction =" + (a-b));
// }
static int add(int a, int b){
    return (a+b);
}

static int subtract(int a, int b){
    return (a-b);
}
}
