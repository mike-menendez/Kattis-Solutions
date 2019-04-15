import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class piglatin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> in = new ArrayList<>();
        StringBuilder output = new StringBuilder();
        while (scan.hasNext()) {
            in.add(scan.nextLine());
        }
        for (int i = 0; i < in.size(); i++) {
            String[] s = in.get(i).split(" ");
            for (int j = 0; j < s.length; j++) {
                if (s[j].charAt(0) == 'a' || s[j].charAt(0) == 'e' || s[j].charAt(0) == 'i' || s[j].charAt(0) == 'o' || s[j].charAt(0) == 'u' || s[j].charAt(0) == 'y') {
                    s[j] = s[j] + "yay";
                } else {
                    StringBuilder sb = new StringBuilder();
                    for (int k = 0; k < s[j].length(); k++) {
                        if (s[j].charAt(k) == 'a' || s[j].charAt(k) == 'e' || s[j].charAt(k) == 'i' || s[j].charAt(k) == 'o' || s[j].charAt(k) == 'u' || s[j].charAt(k) == 'y') {
                            s[j] = s[j].substring(k);
                            s[j] = s[j] + sb.toString() + "ay";
                            break;
                        } else {
                            sb.append(s[j].charAt(k));
                        }
                    }
                }
            }
            Arrays.stream(s).forEach(x -> output.append(x + " "));
            output.deleteCharAt(output.length() - 1);
            output.append('\n');
        }
        output.deleteCharAt(output.length() - 1);
        System.out.print(output);
    }
}
