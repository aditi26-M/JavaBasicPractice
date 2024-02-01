import java.util.Arrays;
import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
////        int ans = sum();                         // calling the function
//                                                   // store the funtion sum in int ans
////        System.out.println(ans);
//
//        int ans = sum1(20, 40);
//        System.out.println(ans);
//    }
//
//    pass the value of numbers when you are calling the method in main()
//    static int sum1(int a, int b){
//        int sum = a+b;
//        return sum;
//    }
//    static int sum(){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        int sum = a + b;
////            System.out.println(sum);
//        return sum;
//    }
///* Syntax of Method:
//          return_type name(arguments){
//             //   body
//             return statement()
//          }
//*/
//
//}

// Swapping numbers code
//public class Main {
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//
////     swap the code
//        int temp = a;
//        a = b;
//        b = temp;
//
//        System.out.println(a + "," + b);
//    }
//}

// **no pass by reference in java only pass by value
// for primitive data types - its only going to be pass by value
// for objects and references for complex data types - pass by value of that reference variable so both the reference variable point to that same object - if you make a change by one reference variable original one will be changed.

//not swapped
public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swap(a,b);
        System.out.println(a + "," + b);

        String name = "aditi";
        changeName(name);
        System.out.println(name);
    }
    static void changeName(String naam){
        naam = "Adi";                   // here creating a new object
//        you cannot modify Strings. Strings are final classes
    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}

// change value
//public class Main {
//    public static void main(String[] args) {
//        create an array - array is collection of numbers
//        int[] arr = {1, 3 , 5 , 25, 6};
// In java it is only call by value
//        change(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    static void change(int[] nums){                   //passing an array
//        nums[0] = 99;                // here we are modifying the array
// if you make a change to the object through this referrence variable, same object will be changed
//    }
//}