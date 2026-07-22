class Students {
   static  String name="sujal";
    static void hello() {

        System.out.println("Hello Students, "+name);

    }
    static{
        System.out.println("Hello mr.coder, this is static block that runs once in the class");
    }

    public Students() {
        System.out.println("Constructor");
    }
}

public class statics {
    public static void main(String[] args) {
//
  Students s= new Students();
  Students s1= new Students();
//        System.out.println(s.college);
        Students.hello();

    }
}
 