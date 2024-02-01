import java.util.Scanner;

// Write a program to print the rectangle number pattern
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
////        int n = 5;
////     Outer Loop
//        for (int i =1; i<=n; i++){
////            Inner Loop
//            for (int j = 1; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
//}


// Write  a program to print the half pyramid number pattern
//public class Main {
//    public static void main(String[] args) {
//        int n = 1;
//        int m = 1;
//
////    outer loop
//        for (int i = 5; i>=n; i--){
////    inner loop
//            for (int j = 5; j>=m; j--){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
//}

//public class Main{
//    public static void main(String[] args) {
//        int n = 5;
//
//        for (int i = 1; i<=n; i++){
//            for (int j = 1; j<=i; j++){
//                System.out.print(i);
//            }
//            System.out.println();
//        }
//    }
//
//}

//public class Main {
//    public static void main(String[] args) {
//
//        for (int i = 1; i<=5; i++){
//            for (int j=1; j<=i; j++){
//                if (j%2 == 0){
//                    System.out.print(0);
//                }else{
//                    System.out.print(1);
//                }
//            }
//            System.out.println();
//        }
//    }
//}

public class Main {
    public static void main(String[] args) {
        int a = 1;
//    Display the patterns
        for (int i=1; i<=4; i++){
//        Print numbers
            for (int j=1; j<=i; j++){
                System.out.print(a + " ");
//            increment num
                a++;
            }
            System.out.println();
        }
    }
}

