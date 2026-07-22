import java.util.Scanner;

public class hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int x = sc.nextInt();
//        System.out.println("Enter the second number");
//        int y= sc.nextInt();
//         int z= x + y;
//        System.out.println("The sum is "+z);
//
//
//        System.out.println("The difference is "+z);
//        int shortVar = sc.nextShort();
//        System.out.println("The shortVal is "+shortVar);



//        String name = new String("Sujal");
//
//        name = null; // The String object is now eligible for GC
//
//        System.gc(); // Request JVM to run garbage collection

        System.out.println("Enter the value");
        int i=sc.nextInt();
        String check=(i%2==0)?"even":"odd";
        System.out.println(check);
       sc.close();
    }
}