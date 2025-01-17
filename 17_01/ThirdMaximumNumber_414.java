public class ThirdMaximumNumber_414 {
    public int thirdMax(int[] nums) {
        if( nums.length == 1 )
            return nums[0];
        if( nums.length == 2 )
            return Math.max(nums[0], nums[1]);

        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;

        for( int i : nums ){
            if (max1 == null || i > max1) {
                max3 = max2;
                max2 = max1;
                max1 = i;
            } else if( (max2 == null || i > max2) && max1 != i ) {
                max3 = max2;
                max2 = i;
            } else if( (max3 == null || i > max3) && max1 != i && max2 != i ) {
                max3 = i;
            }
        }

        return ( max3 == null ) ? max1 : max3;
    }
}
