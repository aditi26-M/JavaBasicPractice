// Print numbers from 5 to 1
//jb bhi recursion ho rhi hoti h memory ke andar saare functions call jo hoti h stacks ki form me hoti h
// A function that calls itself is called a recursive function that creates recursion
// Recursion functions me hoti

//public class Recursion {
//    public static void printNumb(int n){             //Function
//        if (n == 0){
//            return;
//        }
//        System.out.println(n);
//        printNumb(n-1);
//    }
//    public static void main(String[] args) {
//        int n = 5;
//        printNumb(n);
//    }
//}

// Print numbers from 1 to 5
//public class Recursion {
//    public static void printNumb(int n){
//        if (n == 6){
//            return;
//        }
//        System.out.println(n);
//        printNumb(n+1);
//    }
//    public static void main(String[] args) {
//        int n = 1;
//        printNumb(n);
//    }
//}

//Print sum of first n natural numbers
//public class Recursion {
//    public static void printSum(int i, int n, int sum){
//        if (i==n){
//            sum += i;
//            System.out.println(sum);
//            return;
//        }
//        sum += i;
//        printSum(i+1, n, sum);
//    }
//    public static void main(String[] args) {
//        printSum(1,5,0);
//    }
//}

//Print factorial of a number n
//public class Recursion {
//    public static int calFactorial(int n){
//        if (n == 1){
//            return 1;
//        }
//        int fac_nm1 = calFactorial(n-1);
//        int fac_n = n * fac_nm1;
//        return fac_n;
//    }
//    public static void main(String[] args) {
//        int n = 5;
//        int ans = calFactorial(n);
//        System.out.println(ans);
//    }
//}

//Print the Fibonacci sequence till nth term
public class Recursion {
    public static void calFactorial(int a, int b, int n){
        if (n == 0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        calFactorial(b,c,n-1);
    }
    public static void main(String[] args) {
        int a = 0, b=1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        calFactorial(a,b,n-2);
    }
}