import java.util.Arrays;

public class MissingNumber_268 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for( int i = 0 ; i <= nums.length ; i++ ){
            if( i == nums.length || nums[i] != i )
                return i;
        }
        return 1;

        /* Best Solution

        int n = nums.length;
        int sumOfNumbers = n*(n+1)/2;
        int sumOfArray = Arrays.stream(arr).sum();
        return sumOfNumbers - sumOfArray;

        */
    }
}
