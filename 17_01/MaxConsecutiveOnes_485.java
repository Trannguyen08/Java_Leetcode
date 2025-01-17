public class MaxConsecutiveOnes_485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        if( nums == null ) {
            return 0;
        }
        int max = 0, cur = 0;
        for( int i = 0; i < nums.length ; i++ ){
            if( nums[i] == 0 ){
                max = Math.max(max, cur);
                cur = 0;
            } else {
                cur++;
            }
        }
        return Math.max(max, cur);
    }
}
