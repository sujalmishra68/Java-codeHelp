class student{
    String name;
    int age;
     int roll;

     void  study(){
         System.out.println(name+":"+age+": roll.no- "+roll);     }
}




public class oopsbasic {
    public static void main(String[] args) {
        student s1=new student();
        student s2=new student();
//        cardetails c1=new cardetails();

//        c1.details();

        s1.name= "sujal";
        s1.age=20;
        s1.roll=30;

        s2.name ="saloni";
        s2.age=40;
        s2.roll=50;

        s1.study();
        s2.study();
    }
}
