
//public class Main {
//    public static void main(String[] args) {
//       int age = 25;
//       if(age>19){
//           System.out.println("You can drive car");
//       }
//       else{
//           System.out.println("YOu cannot drive car");
//       }
//    }
//}

public class Main {
    public static void main(String[] args) {
        int salary = 15000;
        if(salary > 10000){
            salary += 2000;         //salary = salary + 2000
        } else if(salary > 20000){
            salary += 3000;
        } else {
            salary += 1000;
        }
            System.out.println(salary);
    }
}
