import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String st = "I love CS3233 Competitive Programming. i also love AlGoRiThM";
        int l = st.length();
        st = st.toLowerCase();

        String[] tokens = st.split("[. ]");
        Arrays.sort(tokens);
        for (int i = 0; i<tokens.length ; i++){
            System.out.println(tokens[i]);
        }
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i<tokens.length; i++){
            if(map.containsKey(tokens[i])){
                map.computeIfPresent(tokens[i], (k,v) -> v+1);
            }else{
                map.put(tokens[i], 1);
            }
        }
        Optional<Map.Entry<String, Integer>> maxEntry = map.entrySet().stream().max(Map.Entry.comparingByValue());
        maxEntry.ifPresent(stringIntegerEntry -> System.out.println("The word with the most occurences in the string is: "+stringIntegerEntry.getKey()+" with "+stringIntegerEntry.getValue()+" Occurences"));


    }
    ArrayList<Integer> Indexesof(String T, String S){
        ArrayList<Integer> ans = new ArrayList<>();
        int num = T.indexOf(S);
        while(num != -1){
            ans.add(num);
            num =T.indexOf(S, num+1);
        }
        return ans;
    }




}
