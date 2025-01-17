import java.util.Arrays;
public class RemoveElement_27 {
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for( int i : nums ) {
            if( i != val ) {
                nums[count++] = i;
            }
        }
        for( int i = count ; i < nums.length ; i++ ) {
            nums[i] = 0;
        }
        return count;
    }
}
