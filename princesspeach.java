import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.IntStream;

class princesspeach {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxSize = scan.nextInt();
        HashSet<Integer> set = new HashSet<>();
        int numItems = scan.nextInt();
        
        for (int i = 0; i < numItems; i++) {
            set.add(scan.nextInt());
        }
        
        IntStream.range(0, maxSize).filter(x -> !set.contains(x)).forEach(x -> System.out.println(x));
        
        System.out.println("Mario got " + set.size() + " of the dangerous obstacles.");
    }
}
