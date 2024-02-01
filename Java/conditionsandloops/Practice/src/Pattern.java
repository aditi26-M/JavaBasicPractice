//Print the table of a number input bt the user
// n = 2

//public class Pattern {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i=1; i < 15; i++) {
//            System.out.println(n * i);;
//        }
//    }
//}

// Loops
// Pattern Questions

// 1. Solid Rectangle
 public class Pattern {
    public static void main(String[] args) {
        int n = 4;
        int m = 3;

        //outer loop
        for (int i=1; i<=n; i++){
            //inner loop
            for (int j=1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

// 2. Hollow Rectangle
// public class Pattern{
//    public static void main(String[] args) {
//        int n = 4;
//        int m = 5;
//
//      Outer loop
//        for(int i=1; i<=n; i++){
//            // Inner Loop
//            for (int j=1; j<=m; j++){
//                // cell => (i,j)
//                if (i == 1 || j == 1 || i == n || j == m){
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

// 3. Half Pyramid
// public class Pattern {
//    public static void main(String[] args) {
//        int n = 4;
//
////    Outer Loop
//        for( int i=1; i<=n; i++){
////          Inner Loop
//            for (int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

// 4. Inverted Half Pyramid
//public class Pattern {
//    public static void main(String[] args) {
//        int n = 4;
//
////    Outer Loop
//        for( int i=n; i>=1; i--){
////          Inner Loop
//            for (int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}


// 5. Inverted Half Pyramid (rotated by 180 deg)
//public class Pattern {
//    public static void main(String[] args) {
//        int n = 4;
//
////    Outer Loop
//        for( int i=1; i<=n; i++) {
////          Inner Loop  -> Space print
//            for (int j = 1; j <= n-i; j++) {
//                System.out.print(" ");
//            }
//
////          Inner Loop  -> Star print
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}


// 6. Half Pyramid with Numbers
//public class Pattern {
//    public static void main(String[] args) {
//        int n = 4;
//
////    Outer Loop
//        for( int i=1; i<=n; i++) {
////          Inner Loop
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//    }
//}

// 6. Inverted Half Pyramid with Numbers
//public class Pattern {
//    public static void main(String[] args) {
//        int n = 4;


// 1st Method
//    Outer Loop
//        for( int i=n; i>=1; i--) {
//          Inner Loop
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

// 2nd method
//    Outer loop
//        for(int i=1; i<=n; i ++){
////          Inner loop
//            for (int j=1; j<=n-i+1; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//
//    }
//}