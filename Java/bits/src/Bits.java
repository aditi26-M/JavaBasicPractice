// Bit Manipulation

// 1. Get Bit
//public class Bits {
//    public static void main(String[] args) {
//        int n = 5;                // Binary conversion of 5:- 0101
//        int pos = 2;
//        int bitMask = 1<<pos;
//
//        if ((bitMask & n) == 0){
//            System.out.println("bit was zero");
//        }else {
//            System.out.println("bit was one");
//        }
//    }
//}


// 2. Set Bit
//public class Bits {
//    public static void main(String[] args) {
//        int n = 5;                // Binary conversion of 5:- 0101
//        int pos = 1;
//        int bitMask = 1<<pos;
//
//        int newNumber = bitMask | n;
//        System.out.println(newNumber);
//    }
//}


// 3. Clear Bit
//public class Bits {
//    public static void main(String[] args) {
//        int n = 5;                // Binary conversion of 5:- 0101
//        int pos = 2;
//        int bitMask = 1<<pos;
//        int notBitMask = ~(bitMask);
//
//        int newNumber = notBitMask & n;
//        System.out.println(newNumber);
//    }
//}


import java.util.Scanner;

// 4. Update Bit
public class Bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();              // oper=1: set  if oper=0: clear

        int n = 5;                // Binary conversion of 5:- 0101
        int pos = 1;
        int bitMask = 1 << pos;

        if (oper == 1) {
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
//            clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
}


