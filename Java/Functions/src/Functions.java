import java.util.Scanner;

// Make a function to add 2 numbers  and return the sum

//public class Functions {
//    public static int calculateSum(int a, int b){
//        int sum = a + b;
//        return sum;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        int sum = calculateSum(a, b);
//        System.out.println("Sum of 2 numbers:" +sum);
//    }
//}

// Make a function to multiply 2 numbers  and return the product

//public class Functions {
//    public static int calculateProduct(int a, int b){
////    int product = a * b;
////        return product;
//        return a*b;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
////        int product = calculateProduct(a, b);
//        System.out.println("Sum of 2 numbers: " +calculateProduct(a,b));
//    }
//
//}

// Find the factorial of a number

public class Functions {
    public static void printFactorial(int n){
//    Loop
        if(n < 0){
            System.out.println("Invalid  Number");
            return;
        }
        int factorial = 1;
        for (int i=n; i>=1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFactorial(n);           //calling function to main function
    }

}