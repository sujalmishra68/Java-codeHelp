import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {

        String str = "JAVA";

        Stack<Character> stack = new Stack<>();

        // Step 1: Push every character into stack
          for(int i =0; i<str.length(); i++){
            stack.push(str.charAt(i));
          }

        // Step 2: Pop characters and print them
          while(!stack.isEmpty()){
            System.out.print(stack.pop());
          }

    }
}