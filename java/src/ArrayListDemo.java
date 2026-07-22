import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<Integer> num= new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");



        System.out.println(fruits);

            num.add(1);
            num.add(2);
            num.add(3);

            ArrayList<Integer> num2 = new ArrayList<>();
            num2.add(1);
            num2.add(2);
            num2.add(3);
            num2.add(4);
//            num.addAll(num2);
//        System.out.println(num);
            Iterator<Integer> iterator = num2.iterator();
              while(iterator.hasNext()){
                  System.out.println("Element : "+iterator.next());
              }
        System.out.println(num.size());
    }

}