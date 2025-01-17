import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class RelativeRanks_506 {
    public String[] findRelativeRanks(int[] scores) {
        int n = scores.length;
        int[] cpy = Arrays.copyOf(scores, n);
        Arrays.sort(cpy);
        String ans[] = new String[n];
        int rank = 1;
        HashMap<Integer, String> map = new HashMap<>();
        for( int i = n-1 ; i >= 0 ; i-- ){
            if( rank == 1 ) {
                map.put(cpy[i], "Gold Medal");
            } else if( rank == 2 ){
                map.put(cpy[i], "Silver Medal");
            } else if( rank == 3 ){
                map.put(cpy[i], "Bronze Medal");
            } else {
                map.put(cpy[i], String.valueOf(rank));
            }
            rank++;
        }
        for( int i = 0 ; i < n ; i++ ){
            ans[i] = map.get(scores[i]);
        }
        return ans;
    }
}
