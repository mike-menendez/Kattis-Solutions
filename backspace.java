import java.util.Scanner;

public class backspace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();
        int counter = 0;
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < in.length(); i++) {
            while (counter > 0) {
                out.deleteCharAt(out.length() - 1);
                counter--;
            }
            if (in.charAt(i) == '<') {
                counter++;
            } else {
                out.append(in.charAt(i));
            }
        }
        if (counter > 0) {
            while (counter > 0) {
                out.deleteCharAt(out.length() - 1);
                counter--;
            }
        }
        System.out.print(out);
    }
}
