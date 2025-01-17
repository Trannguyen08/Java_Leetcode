public class SingleNumber_136 {
    public int singleNumber(int[] nums) {
            int ans = 0;
            for( int i : nums ){
                ans ^= i;       // xor
            }
            return ans;
    }
}
