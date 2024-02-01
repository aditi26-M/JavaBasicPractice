// Program to find sum of elements in an array.
//public class Main {
//    public static void main(String[] args) {
//        int[] arr = {5, 7,0,1,3};
//        int sum = 0;
//        for(int i = 0; i<arr.length; i++){
//            sum = sum + arr[i];
//        }
//        System.out.println(sum);
//    }
//}


import java.util.Arrays;

// Program to search for an element from a given array
//public class Main {
//    public static void main(String[] args) {
//        int[] arr = {5,7,0,1,3};
//        int target = 4;
//
//        for (int i=0; i<arr.length; i++){
//            if(arr[i] == target){
//                System.out.println(i);
//            }else{
//                System.out.println("Not exist");
//            }
//        }
//    }
//}

// Pattern Question
public class Main {
    public static void main(String[] args) {
        int n = 5;
//        char ch = 'E';
        for (int i = n; i >= 1; i--) {
            for (int j = i; j <= n; j++) {
                System.out.print((char)(j+64));
//                ch++;
            }
            System.out.println(" ");
        }
    }
}