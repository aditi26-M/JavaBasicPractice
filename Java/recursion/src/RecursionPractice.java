// 1. Tower of Hanoi
// time complexity - O(2^n - 1) ~ O(2^n)

//public class RecursionPractice {
//    public static void towerOfHanoi(int n, String src, String helper, String des){
//        if (n == 1){
//            System.out.println("Transfer disk " + n + " from " + src + " to " + des);
//            return;
//        }
//        towerOfHanoi(n-1, src,des,helper);
//        System.out.println("Transfer disk " + n + " from " + src + " to " + des);
//        towerOfHanoi(n-1, helper, src, des);
//    }
//    public static void main(String[] args) {
//        int n = 1;
//        towerOfHanoi(n, "S", "H", "D");
//    }
//}

// 2. Print a String "abcd" in reverse

//public class RecursionPractice {
//    public static void printRev(String str, int idx) {
//        if (idx == 0){
//            System.out.println(str.charAt(idx));
//            return;
//        }
//        System.out.println(str.charAt(idx));
//        printRev(str, idx-1);
//    }
//
//    public static void main(String[] args) {
//        String str = "abcdefg";
//        printRev(str, str.length()-1);
//    }
//}

// 3. Find the 1st and last occurence of an element in string
// In this code we traversed one time so its time complexity will be O(n) where n is the length of string

//public class RecursionPractice {
//    public static int first = -1;
//    public static int last = -1;
//
//    public static void finfOccurence(String str, int idx, char element) {
//        if(idx == str.length()){
//            System.out.println(first);
//            System.out.println(last);
//            return;
//        }
//        char currChar = str.charAt(idx);
//        if (currChar == element){
//            if(first == -1){
//                first = idx;
//            } else{
//                last = idx;
//            }
//        }
//        finfOccurence(str, idx+1, element);
//    }
//    public static void main(String[] args) {
//        String str = "abaacdaefaah";
//        finfOccurence(str, 0, 'a');
//    }
//}


// Q4: Check if an array is sorted(strictly increasing
// Time Complexity O(n)

//public class RecursionPractice {
//    public static boolean isSorted(int arr[], int idx) {
////        base case till when
//        if (idx == arr.length - 1) {
//            return true;
//        }
////        if (arr[idx] < arr[idx+1]){
////            //array is sorted till now
////            return isSorted(arr, idx+1);
////        } else {
////            return false;
////        }
////    }
//        if ((arr[idx] >= arr[idx + 1])) {
////            array is unsorted
//            return false;
//        } else {
//            return isSorted(arr, idx + 1);
//        }
//    }
//    public static void main(String[] args) {
//        int arr[] = {1,3,5,4};
//        System.out.println(isSorted(arr,0));
//    }
//}

//Q5: Move all x to the end in the given string "axbcxxd"
// Time complexity O(n + count) count jaaayega n tk so O(n+n) => O(2n) => O(n)

//public class RecursionPractice {
//    public static void moveAllX(String str, int idx, int count, String newString) {
//        if (idx == str.length()) {
//            for (int i = 0; i < count; i++) {
//                newString += 'x';
//            }
//            System.out.println(newString);
//            return;
//        }
//// calculate the current character using .charAt function after that compare if that character is x or not
//        char currChar = str.charAt(idx);
//        if (currChar == 'x') {
//            count++;
//            moveAllX(str, idx + 1, count, newString);
//        } else{
//            newString += currChar;
//            moveAllX(str, idx+1, count, newString);
//        }
//    }
//    public static void main(String[] args) {
//        String str = "axbcxxd";
//        moveAllX(str, 0, 0, " ");
//    }
//}

//Q6: Remove duplicates in a String "abbccda"
// Single time traverse so Time Complexity will be O(n)

//public class RecursionPractice {
//    public static boolean[] map = new boolean[26];
//    public static void removeDuplicates(int idx, String str, String newString){
//        if (idx == str.length()){
//            System.out.println(newString);
//            return;
//        }
//        char currChar = str.charAt(idx);
//        if (map[currChar - 'a'] == true){
//            removeDuplicates(idx+1, str, newString);
//        }else {
//            newString += currChar;
//            map[currChar - 'a'] = true;
//            removeDuplicates(idx+1, str, newString);
//        }
//    }
//    public static void main(String[] args) {
//        String str = "abbccda";
//        removeDuplicates(0, str, " ");
//    }
//}

// Q7: Print all the subsequences of a string "abc"
//Time Complexity - O(2^n)

//public class RecursionPractice {
//    public static void subsequnces(String str, int idx, String newString){
//        if (idx == str.length()){
//            System.out.println(newString);
//            return;
//        }
//        char currChar = str.charAt(idx);
////        to be
//        subsequnces(str, idx+1, newString+currChar);
//
////        not to be
//        subsequnces(str, idx+1, newString);
//    }
//    public static void main(String[] args) {
//        String str = "abc";
//        subsequnces(str, 0, " ");
//    }
//}

import java.util.HashSet;

// Q8: Print all the unique subsequences of a string "aaa"
//public class RecursionPractice {
//    public static void subsequnces(String str, int idx, String newString, HashSet<String> set){
//        if (idx == str.length()) {
//            if (set.contains(newString)) {
//                return;
//            } else {
//                System.out.println(newString);
//                set.add(newString);
//                return;
//            }
//        }
//        char currChar = str.charAt(idx);
////        to be
//        subsequnces(str, idx+1, newString+currChar, set );
//
////        not to be
//        subsequnces(str, idx+1, newString, set);
//    }
//    public static void main(String[] args) {
//        String str = "aaa";
//        HashSet<String> set = new HashSet<>();
//        subsequnces(str, 0, " ", set);
//    }
//}

//Print Keypad Combination
// Time Complexity O(4^n)

public class RecursionPractice {
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printComb(String str, int idx, String combination) {         // Str - No. ki string, idx - string ke anda r kon se index ki baat kr rhe
        if (idx == str.length()){
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
//   now we will se keypad me current character vaale index pr kya store h
        String mapping = keypad[currChar - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            printComb(str, idx+1, combination+mapping.charAt(i));
        }
    }

    public static void main (String[]args){
        String str = "23";
        printComb(str,0, " ");
        }
    }


