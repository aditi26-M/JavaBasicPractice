// Scope - we can access the variables inside the same function

//1. Function Scope - Variables that are declared inside a function we can access those only inside the function
public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

//  2. Block Scope - Variable that is declared inside a specific block & can't be accessed outside that block
//  This block is inside a function
        {
//         values initialised in this block will remain in this block
//         int a = 45;      // already initialised outside the block in the same method, hence cannot initialise again but can change the value
            a = 65;         // reassign the original reference variable to some other value
            System.out.println(a);
            int c = 23;
        }
        System.out.println(a);
//      System.out.println(c);                 -->   cannot be accessed outside the block


//  3. Loop Scope
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
    }
        static void random(){
            int num = 67;
            System.out.println(num);
    }
}




























//Amdocs ques
//public class Scope {
//    public static void main(String[] args) {
//        PriorityQueue toDo = new PriorityQueue();
//        toDo.add("dishes");
//        toDo.add("laundry");
//        toDo.add("bills");
//        toDo.offer("bills");
//        System.out.print(toDo.size()+" "+ toDo.poll());
//        System.out.print(" " + toDo.peek()+" "+ toDo.poll());
//        System.out.print(" " + toDo.poll()+" "+ toDo.poll());
//            }
//        }

