import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        int n = nums1.length, m = nums2.length;
        while( i < n && j < m ){
            if( nums1[i] == nums2[j] ) {
                set.add(nums1[i]);
                i++;
                j++;
            } else if( nums1[i] < nums2[j] ) {
                i++;
            } else {
                j++;
            }
        }
        int[] array = set.stream().mapToInt(Integer::intValue).toArray();
        return array;

        /* Best Solution
            int[] arr = new int[1001];
            int size = 0;
            for( int num: nums1 ){
                if( arr[num] == 0 ) {
                    arr[num]++;
                }
            }
            for( int num : nums2 ){
                if( arr[num] == 1 ) {
                    arr[num]++;
                    size++;
                }
            }
            int[] res = new int[size];
            int index = 0;
            for( int num : nums1 ){
                if( arr[num] >= 2 ){
                    res[index++] = num;
                    arr[num] = 1;
                }
            }
            return res;
         */
    }
}
