import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class whatdoesthefoxsay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numCases = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < numCases; i++) {
            String fox = scan.nextLine();
            HashSet<String> sounds = new HashSet<>();
            while (true) {
                String in = scan.nextLine();
                if (in.equals("what does the fox say?")) {
                    break;
                }
                sounds.add(in.split(" ")[2]);
            }
            System.out.println(Arrays.stream(fox.split(" ")).filter(x -> !sounds.contains(x)).map(y -> y + " ").collect(Collectors.joining()));
        }
    }
}
