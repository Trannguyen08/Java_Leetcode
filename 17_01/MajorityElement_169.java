import java.util.HashMap;
import java.util.Map;

public class MajorityElement_169 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxAppear = 0;
        int ans = 0;
        for( int i : nums ){
            map.put(i, map.getOrDefault(i,0) + 1);
            if( map.get(i) > maxAppear ){
                maxAppear = map.get(i);
                ans = i;
            }
        }
        return ans;
    }
}
