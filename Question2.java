import java.util.Stack;

public class Question2 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.peek();
                if ((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String testCaseOne = "()";
        String testCaseTwo = "()[]{}";
        String testCaseThree = "(]";
        String testCaseFour = "([])";

        System.out.println(isValid(testCaseOne));
        System.out.println(isValid(testCaseTwo));
        System.out.println(isValid(testCaseThree));
        System.out.println(isValid(testCaseFour));
    }
}
