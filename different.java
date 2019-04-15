import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder s = new StringBuilder();
        while (scan.hasNext()) {
            long a = scan.nextLong();
            long b = scan.nextLong();
            if (a - b < 0) {
                s.append(((a - b) * -1) + "\n");
            } else {
                s.append((a - b) + "\n");
            }
        }
        s.deleteCharAt(s.length() - 1);
        System.out.print(s);
    }
}
