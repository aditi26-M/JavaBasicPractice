import java.util.Scanner;            //User se input lenge
// Import a scanner class
import java.util.Scanner.*;                 //Library import


public class HelloWorld {
    public static void main(String[] args) {                           // main - Function
        Scanner input = new Scanner(System.in);
        System.out.println("Hello World");
        /*
        int num = input.nextInt();
        System.out.println(num);
         */

        String str = input.nextLine();
        System.out.println(str);

    }
}
