package Array;

import java.util.ArrayList;
import java.util.Scanner;

//public class ArrayListExample {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Syntax
//        ArrayList<Integer> list = new ArrayList<>(10);    //We cannot add primitives we have to add wrapper class
//
//    Input
//        for (int i = 0; i < 5; i++) {
//            list.add(sc.nextInt());
//        }
//
//get item at any index
//        for (int i = 0; i < 5; i++) {
//            System.out.print(list.get(i));     //pass index here, list[index] syntax will not work here
//        }
//    }
//}


// 2D Array list
//public class ArrayListExample {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//
////        initialisation
//        for (int i = 0; i < 3; i++) {
//            list.add(new ArrayList<>());
//        }
////        add elements
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                list.get(i).add(sc.nextInt());
//            }
//        }
//        System.out.println(list);
//    }
//}


// Maximum value of an Array

public class ArrayListExample {
    public static void main(String[] args) {
        int[] arr = {1, 23, 5, 13, 30};
        System.out.println(max(arr));
    }
//    imagine that arr is not empty
    static int max(int[] arr){
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}