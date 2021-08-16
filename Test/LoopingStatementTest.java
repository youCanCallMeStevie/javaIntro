package src;
public class LoopingStatementTest {
    public static void main(String[] args) {
        System.out.println("Entering Main");
        // int i = 1;
        // while (i <= 5)
        // {
        //     System.out.println("Hello World "+i);
        //     i++; 
        // }


        // do
        // {
        //         System.out.println("Hello World "+i);
        //         i++;
        // } while(i <=5);

        for(int i = 1;  i<=5; i++ )
        {
            System.out.println("Hello World "+ i);
        }
        System.out.println("Leaving Main");

    }
}
