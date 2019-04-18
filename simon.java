import java.util.*;

public class simon {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numSentences = scan.nextInt();
        scan.nextLine();
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < numSentences; i++) {
            String[] s = scan.nextLine().split(" ");
            if(s.length < 2){
                out.append("\n");
                continue;
            }
            StringBuilder sb = new StringBuilder();
            if(s[0].equals("simon") && s[1].equals("says")){
                for(int j = 2; j < s.length; j++){
                    sb.append(s[j] + " ");
                }
                sb.trimToSize();
                sb.append("\n");
            }else{
                sb.append("\n");
            }
            out.append(sb);
        }
        out.deleteCharAt(out.length()-1);
        System.out.print(out);
    }
}
