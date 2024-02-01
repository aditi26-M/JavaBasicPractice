
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Maths marks");
        float f1 = sc.nextFloat();
        System.out.println("Enter Science marks");
        float f2 = sc.nextFloat();
        System.out.println("Enter Social marks");
        float f3 = sc.nextFloat();
        System.out.println("Enter Computer marks");
        float f4 = sc.nextFloat();
        System.out.println("Enter French marks");
        float f5 = sc.nextFloat();
        System.out.println("Sum of Marks is");
        float f = f1 + f2 + f3 + f4 + f5;
        System.out.println(f);
        System.out.println("Your percentage is");
        float per = (f/500) * 100;
        System.out.println(per);
    }
}
