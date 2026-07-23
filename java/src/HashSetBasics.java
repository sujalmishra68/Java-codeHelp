import java.util.HashSet;
import java.util.Set;
// import java.util.*;
public class HashSetBasics {
    public static void main(String[] args) {
    //  create a HashSet to store integers
    //   Set<Integer> st = new HashSet<>();
    // //   insertion
    // st.add(10);
    // st.add(10);
    // st.add(20);
    // st.add(20);
    // st.add(30);
    // System.out.println(st); 

    Set<Integer> st1 = new HashSet<>();
    Set<Integer> st2 = new HashSet<>();
    st1.add(10);
    st1.add(20);
    st1.add(30);

    st2.add(20);
    st2.add(30);
    st2.add(40);

    st1.retainAll(st2); // intersection of st1 and st2
    System.out.println(st1); // Output: [20, 30]
    System.out.println(st2); // Output: [20, 30, 40]
   System.out.println(st1.containsAll(st2)); // Output: false
   System.out.println(st2.containsAll(st1)); // Output: true 


    }
}


























































// public class HashSetBasics {
//     public static void main(String[] args) {
//         // Create a HashSet
//         HashSet<String> set = new HashSet<>();

//         // Add elements to the HashSet
//         set.add("Apple");
//         set.add("Banana");
//         set.add("Orange");
//         set.add("Grapes");

//         // Display the HashSet
//         System.out.println("HashSet: " + set);

//         // Check if an element exists
//         String elementToCheck = "Banana";