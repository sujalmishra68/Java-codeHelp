import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapInterface {
  public static void main(String[] args) {
    Map<Integer, String> student = new HashMap<>();
    student.put(1, "Sujal");
    student.put(2, "sanjeev");
    student.put(3, "kumar");
    student.put(4, "Mishra");
      System.out.println("Number of students: " + student.size());
    System.out.println(student);
    System.out.println("Specific Student detail: " + student.get(2));
    student.remove(2);
    System.out.println("After removing student with ID 2: " + student);
    System.out.println("Does the map contain key 101? " + student.containsKey(101));
    System.out.println("Does the map contain value 'Sujal'? " + student.containsValue("Sujal"));
    System.out.println("Number of students: " + student.size());
    System.out.println("Is the map empty? " + student.isEmpty());
    // student.clear();
    System.out.println("Students after clearing the map: " + student);
      System.out.println("Number of students: " + student.size());

      Set<Integer> keys = student.keySet();
      System.out.println("Keys in the map: " + keys);
  }
}