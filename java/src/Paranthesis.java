//stack implementation to check if the paranthesis are balanced or not
import java.util.Stack;

public class Paranthesis {
    public static void main(String[] args) {
       Stack<Character> stack = new Stack<>();


String str = "{[()]}";

for (int i = 0; i < str.length(); i++) {

    char ch = str.charAt(i);

    // If ch is (, {, or [
    if(ch=='(' || ch=='{'|| ch=='['){
      stack.push(ch);


     
}    // push it into the stack
// else if (ch == ')') {

//     if (__________________) {
//         stack.pop();
//     } else {
//         System.out.println("Invalid");
//         return;
//     }
// }
//


    else if(ch==')' || ch=='}'|| ch==']'){
        if(stack.isEmpty()){
            System.out.println("Not Balanced");
            return;
        }
        char top = stack.pop();
        if((ch==')' && top!='(') || (ch=='}' && top!='{') || (ch==']' && top!='[')){
            System.out.println("Not Balanced");
            return;
        }
    }

}
    }
  }
  

