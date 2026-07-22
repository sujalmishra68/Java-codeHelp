class Persons{
    void greet(){
        System.out.println("Namaste ");
    }
}
class Student extends Persons{
    @Override
    void greet(){
        System.out.println(" Namaste Student ");
    }
}
public class runtime {
    static void main() {
        Persons p = new Student();
        p.greet();
    }
}
