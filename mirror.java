import java.util.ArrayList;
import java.util.Scanner;

public class mirror {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numCases = scan.nextInt();
        for (int i = 0; i < numCases; i++) {
            int numLines = scan.nextInt();
            scan.nextLine();
            ArrayList<StringBuilder> list = new ArrayList<>();
            for (int j = 0; j < numLines; j++) {
                list.add(new StringBuilder(scan.nextLine()));
            }
            System.out.println("Test " + (i + 1));
            for (int j = list.size() - 1; j >= 0; j--) {
                System.out.println(list.get(j).reverse());
            }
        }
    }
}
