package src;
public class ArrayTest {
    public static void main(String[] args) {
        // int a[] = new int[5];
        // a[0] = 20;

        // char c[] = new char[10];

        int a[] = { 20, 30, 10, 4, 77 };
        int searchValue = 30;
        for (int i = 0; i < a.length; i++) {
            // System.out.println(a[i]);
            if (a[i] == searchValue) {
                System.out.println("Match found!");
                break;
            } else {
                System.out.println("No match found");
            }
        }

    }
}
