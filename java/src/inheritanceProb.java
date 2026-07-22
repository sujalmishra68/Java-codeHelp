class Person{

    String name;
    int age;
    void displayPerson(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
        }

        class Studenting extends Person{
        String branch;
        int rollno;


        void displayStudent() {
            System.out.println("Rollno: "+rollno);
            System.out.println("Branch: "+branch);
        }
        }

public class inheritanceProb {
    public static void main(String[] args) {
       Studenting s= new Studenting();
        s.name = "Sujal";
        s.age = 20;
        s.rollno = 101;
        s.branch = "Computer Science";
        s.displayStudent();
        s.displayPerson();

    }
}


