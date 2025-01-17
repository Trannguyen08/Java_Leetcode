public class SearchInsertPosition_35 {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length-1, mid = 0;
        if( target < nums[0] ) {
            return 0;
        }
        if( target > nums[r] ) {
            return r+1;
        }
        while( l <= r ){
            mid = (l+r)/2;
            if( nums[mid] == target ) {
                return mid;
            } else if( nums[mid] < target ) {
                l = mid+1;
            } else {
                r = mid-1;
            }
        }
        return (target > nums[mid]) ? (mid+1) : (mid);
    }
}
