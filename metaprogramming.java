import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> mappings = new HashMap<>();
        while (scan.hasNext()) {
            String[] in = scan.nextLine().split(" ");
            if (in[0].equals("define")) {
                mappings.put(in[2], Integer.parseInt(in[1]));
            } else {
                int a = 0;
                boolean aDef = false;
                int b = 0;
                boolean bDef = false;
                if (mappings.containsKey(in[1])) {
                    aDef = true;
                    a = mappings.get(in[1]);
                }
                if (mappings.containsKey(in[3])) {
                    bDef = true;
                    b = mappings.get(in[3]);
                }

                if (aDef && bDef) {
                    if (in[2].equals("<")) {
                        if (a < b) {
                            System.out.println("true");
                        } else {
                            System.out.println("false");
                        }
                    } else if (in[2].equals(">")) {
                        if (a > b) {
                            System.out.println("true");
                        } else {
                            System.out.println("false");
                        }
                    } else if (in[2].equals("=")) {
                        System.out.println(a == b);
                    }
                } else {
                    System.out.println("undefined");
                }
            }
        }
    }
}
