//public class Arrays {
//    public static void main(String[] args) {
//        int[] marks = new int[3];
//        marks[0] = 97;         //phy
//        marks[1] = 95;         //chem
//        marks[2] = 90;         //maths
////        System.out.println(marks[0]);
////        System.out.println(marks[1]);
////        System.out.println(marks[2]);
//
//        for (int i=0; i<3; i++){
//            System.out.println(marks[i]);
//        }
//    }
//}



// Take an array as input from the user. Search for a given number x and print the index at which it occurs.

//public class Arrays {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int numbers[] = new int[size];
//
////    input
//        for (int i=0; i<size; i++){
//            numbers[i] = sc.nextInt();
//        }
////    take the value x which we have to find
//        int x = sc.nextInt();
//
////    output
//        for (int i=0; i<numbers.length; i++) {
//            if (numbers[i] == x) {
//                System.out.println("x found at index: " +i);
//            }
//        }
//    }
//}


// 2D Array
//public class Arrays {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int rows = sc.nextInt();
//        int cols = sc.nextInt();
//
//        int[][] numbers = new int[rows][cols];
//
////        input
////        rows
//        for (int i=0; i<rows; i++){
////            columns
//            for (int j=0; j<cols; j++){
//                numbers[i][j] = sc.nextInt();
//            }
//        }
////        output
//        for (int i=0; i<rows; i++){
//            for (int j=0; j<cols; j++){
//                System.out.print(numbers[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}

// Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs.
//public class Arrays {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int rows = sc.nextInt();
//        int cols = sc.nextInt();
//
//        int[][] numbers = new int[rows][cols];
//
////    input
////    rows
//        for (int i=0; i<rows; i++){
////            columns
//            for (int j=0; j<cols; j++){
//                numbers[i][j] = sc.nextInt();
//            }
//        }
//        int x = sc.nextInt();
//
//        for(int i=0; i<rows; i++){
//            for (int j=0; j<cols; j++){
//                // Compare with x
//                if (numbers[i][j] == x){
//                    System.out.println("x found at locations (" + i + " , " + j + " ) ");
//                }
//            }
//        }
//    }
//}






// String Builder
public class Arrays {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

//     char at index 0
//        System.out.println(sb.charAt(1));
//
//     set char at  index 1
//        sb.setCharAt(0, 'P');
//        System.out.println(sb);

//     for insert any letter use insert function
//        sb.insert(1, "p");
//        System.out.println(sb);

//     Delete
        sb.delete(1,2);
        System.out.println(sb.length());
    }
}






























