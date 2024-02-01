// Bubble Sort
// Time complexity = O(n^2)

//public class Sorting {
//    public static void printArray(int arr[]) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {7, 8, 3, 1, 2};
//
////    Outer loop - runs (n-1) times
//        for (int i = 0; i < arr.length - 1; i++) {                        //i -> counter    arr.length = n-1
//            for (int j = 0; j < arr.length - i - 1; j++) {                  // j decrease     // -i isliye kiya kyunki jitne bhi element hme hatane h that is equal to i
//                if (arr[j] > arr[j + 1]) {
////                    swap
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        printArray(arr);
//    }
//}


// Selection Sort
// Time complexity = O(n^2)

//public class Sorting {
//    public static void printArray(int arr[]) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {7, 8, 3, 1, 2};
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            int smallest = i;                                        // store the index of smallest element
//            for (int j = i + 1; j < arr.length; j++) {               // starting value increase(j increase)
//                if (arr[smallest] > arr[j]) {
//                    smallest = j;
//                }
//            }
////        Swapping
//            int temp = arr[smallest];
//            arr[smallest] = arr[i];
//            arr[i] = temp;
//        }
//    }
//}


//    Insertion Sort

//public class Sorting {
//    public static void printArray(int arr[]) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//    public static void main(String[] args) {
//        int arr[] = {7, 8, 3, 1, 2};
//
//        for (int i=1; i<arr.length; i++) {
//            int current = arr[i];
//            int j = i-1;                 //(sorted part ka last index picked up)
//            // To track the sorted part we are using j          jbtk hm sorted part me h we are using j
//            while (j >= 0 && current < arr[j]) {         // j ko tbtk use kr rhe h jbtk j > 0 nhi hota
//                arr[j+1] = arr[j];
//                j--;
//            }
//    //  Placement
//            arr[j+1] = current;
//        }
//        printArray(arr);
//    }
//}




// Merge Sort
// Time Complexity - nlogn

public class Sorting {
    public static void conquer(int arr[], int si, int mid, int ei){
          int merged[] = new int[ei - si + 1];

          int idx1 = si;                           // tracking 1st array
          int idx2 = mid+1;                        // tracking 2nd array
          int x = 0;                               // tracking merged index
//  O(n)
        while (idx1 <= mid && idx2 <= ei){
            if (arr[idx1] <= arr[idx2]){
                merged[x++] = arr[idx1++];
            }else {
                merged[x++] = arr[idx2++];
            }
        }
        while (idx1 <= mid){
            merged[x++] = arr[idx1++];
        }

        while (idx2 <= ei){
            merged[x++] = arr[idx2++];
        }
        
//  Orginal array ke andar merged ke arrays ko copy krna
        for (int i = 0, j=si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }

    }
    public static void divide(int arr[], int si, int ei){
        if (si >= ei){
            return;
        }
//    O(logn)
        int mid = si + (ei - si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }
    public static void main(String[] args) {
        int arr[] = {36,3,15,9,22,7,54,5,49};
        int n = arr.length;

        divide(arr, 0, n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}