package Array;//public class Array.Aray{
//    public static void main(String[] args) {
////       Q: store a roll no.
//        int a = 1;
//
////        Q: store a name
//        String name = "Aditi";
//
////        Q: store 5 roll no.
//        int rolno1 = 1;
//        int rolno2 = 23;
//        int rolno3 = 45;
////        syntax
////        datatype[] variable_name = new datatype[size];
////        store 5 roll no.
//        int[] rollno = new int[5];      // bracket basically means reference variable(rollno) is pointing to an array object(new int[5]) that contains type integer
////        or can directly write it as
//        int[] roll = {23, 1, 45, 60, 34};
//    }
//}


//import java.util.Arrays;
//
//// passing in functions
//public class Array.Aray {
//    public static void main(String[] args) {
//        int[] nums = {3,4,5,7,6};
//        System.out.println(Arrays.toString(nums));
//        change(nums);
//        System.out.println(Arrays.toString(nums));
//    }
//
//    static void change(int[] arr) {
//        arr[0] = 54;
//    }
//}


import java.util.Arrays;
import java.util.Scanner;

// 2-D Arrays in Java
//public class Array.Aray {
//    public static void main(String[] args) {
//   /*
//        1 2 3
//        4 5 6
//        7 8 9
//   */
//        Scanner sc = new Scanner(System.in);
////        int[][] arr = new int[3][];
//
////        int[][] arr = {
////                {1, 2, 3},    //0th index
////                {4,5,},       //1st index
////                {6,7,8,9}     //2nd index
////        };
//
//        int[][] arr = new int[3][4];
//        System.out.println(arr.length);    //no. of rows
//
//        //input
//        for (int row = 0; row < arr.length; row++) {
////            for each col in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                arr[row][col] = sc.nextInt();
//            }
//        }
//
////    Output
//          //   for (int row = 0; row < arr.length; row++) {
////    for each col in every row
//             // 1st way
//       //         for (int col = 0; col < arr[row].length; col++) {
//       //         System.out.print(arr[row][col] + " ");
////            }
//
//             // 2nd Way
//        //       System.out.println(Arrays.toString(arr[row]));
//
////    }
//
//        for (int[] ints : arr) {                       // datatype of Every single element in this array itself is an array
//            System.out.println(Arrays.toString(ints));
//
//        }
//    }
//}


// Column size not fixed
public class Aray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {4,5},
                {6,7,8,9}
        };
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}