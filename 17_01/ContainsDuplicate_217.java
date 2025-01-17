import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate_217 {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for( int i : nums ){
            if (map.containsKey(i)) {
                return true;
            } else {
                map.put(i, 1);
            }
        }
        return false;
    }
}
