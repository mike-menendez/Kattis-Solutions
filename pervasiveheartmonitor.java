import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class pervasiveheartmonitor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String in = scan.nextLine();
            System.out.println(Arrays.stream(in.split(" "))
                    .filter(x -> "9876543210".contains(x.substring(0, 1)))
                    .collect(Collectors.averagingDouble(x -> Double.parseDouble(x))) + " " +
                    Arrays.stream(in.split(" ")).filter(x -> !"9876543210".contains(x.substring(0, 1)))
                            .map(x -> x + " ").collect(Collectors.joining()));
        }
    }
}
