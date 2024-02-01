import java.util.Scanner;

//  2. Find the largest of the three numbers
//public class Largest {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
// 1st Method
//        int max = a;
//        if (b > max){
//            max =  b;
//        }
//        if (c > max){
//            max = c;
//        }
// 2nd Method
//        int max = 0;
//        if (a > b){
//            max = a;
//        }else {
//            max = b;
//        } if(c > max){
//            max = c;
//        }
//        System.out.println(max);
//    }
//}

// 3. Fibonacci Number
//public class Largest {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a = 0;
//        int b = 1;
//        int count = 2;
//
//        while(count <= n){
//            int temp = b;
//            b = b + a;
//            a = temp;
//            count++;
//        }
//        System.out.println(b);
//    }
//}

// 4. Count Occurrences
// count the no of times

//public class Largest {
//    public static void main(String[] args) {
//        int n =45536;
//
//        int count = 0;
//        while (n > 0){
//            int rem = n % 10;
//            if (rem == 5){
//                count++;
//            }
//            n = n/10;
//        }
//    }
//}

// 5. Reverse

public class Largest {
    public static void main(String[] args) {
        int num = 28479;

        int  ans = 0;
        while(num > 0){
            int rem = num % 10;
            num = num / 10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}



