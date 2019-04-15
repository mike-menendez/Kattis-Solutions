import java.util.*;

public class Election {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int numIter = scan.nextInt();
       scan.nextLine();
       HashMap<String, String> candToParty = new HashMap<>();
       HashMap<String, Integer> candVotes = new HashMap<>();
       ArrayList<String> candNames = new ArrayList<>();
        for (int i = 0; i < numIter; i++) {
            String cand = scan.nextLine();
            String party = scan.nextLine();
            candToParty.put(cand, party);
            candNames.add(cand);
        }
        candToParty.keySet().forEach(x -> candVotes.put(x,0));
        numIter = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < numIter; i++) {
            String vote = scan.nextLine();
            if(!candNames.contains(vote)){
                continue;
            }
            candVotes.put(vote,candVotes.get(vote) +1);
        }
        String winner = "";
        int max = 0;
        boolean tie = false;
        for (int i = 0; i < candNames.size(); i++) {
            if(!candVotes.containsKey(candNames.get(i))){
                continue;
            }
            int temp = candVotes.get(candNames.get(i));
            if(temp == max){
                tie = true;
            }else if(temp > max){
                tie = false;
                max = temp;
                winner = candNames.get(i);
            }
        }
        if(tie){
            System.out.print("tie");
        }else{
            System.out.print(candToParty.get(winner));
        }
    }
}
