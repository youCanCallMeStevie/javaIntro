package src;
public class LogicalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b =20;

        System.out.println((a<b) && (a==10));
        System.out.println((a<b) && (a==9));
        System.out.println((a<b) || (a==9));
        System.out.println(!(a<b));


    }
}
