import java.util.Scanner;

public class simonsays {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numLines = scan.nextInt();
        scan.nextLine();
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < numLines; i++) {
            String in = scan.nextLine();
            String[] a = in.split(" ");
            if (a[0].equals("Simon") && a[1].equals("says")) {
                for (int j = 2; j < a.length; j++) {
                    out.append(a[j] + " ");
                }
                out.deleteCharAt(out.length() - 1);
                out.append("\n");
            }
        }
        out.deleteCharAt(out.length() - 1);
        System.out.print(out);
    }
}
