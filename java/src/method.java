import java.util.Scanner;

public class method {



    void multiply(int a,int b){
        int c=a*b;
        System.out.println(c);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        method m=new method();
        m.multiply(a,b);
    }

//    public static void main(String[] args) {
//
//        System.out.println("Java 21 setup successful");
//    }
}
