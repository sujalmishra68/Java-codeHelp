import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList <>();
        list.addFirst(1);
        list.addLast(2);
        list.add(3);
        System.out.println(list.get(1));
    }
}
