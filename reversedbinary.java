import java.util.Scanner;

public class reversedbinary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(Integer.parseInt(new StringBuilder(Integer.toBinaryString(scanner.nextInt())).reverse().toString(),2));
    }
}
