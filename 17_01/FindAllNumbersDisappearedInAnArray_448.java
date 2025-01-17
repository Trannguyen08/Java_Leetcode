import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int size = nums.length;
        int cnt[] = new int[size+1];
        List<Integer> list = new ArrayList<>();
        for( int i : nums ){
            cnt[i]++;
        }
        for( int i = 1 ; i <= size ; i++ ){
            if( cnt[i] == 0 ) {
                list.add(i);
            }
        }
        return list;
    }
}
