import java.util.Scanner;
import java.util.Stack;

public class delimitersoup {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            } else if (c == ' ') {

            } else {
                char t = ' ';
                if (stack.size() > 0) {
                    t = stack.pop();
                } else {
                    System.out.print(c + " " + i);
                    return;
                }
                if (t == '[') {
                    if (c != ']') {
                        System.out.print(c + " " + i);
                        return;
                    }
                } else if (t == '{') {
                    if (c != '}') {
                        System.out.print(c + " " + i);
                        return;
                    }
                } else {
                    if (c != ')') {
                        System.out.print(c + " " + i);
                        return;
                    }
                }
            }
        }
        System.out.print("ok so far");
    }
}
