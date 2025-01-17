public class MergeSortedArray_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lastIndS1 = m-1;
        int lastIndS2 = n-1;
        int right = m+n-1;
        while( lastIndS2 >= 0 ){
            if( lastIndS1 >= 0 && nums1[lastIndS1] > nums2[lastIndS2] ){
                nums1[right--] = nums1[lastIndS1--];
            } else {
                nums1[right--] = nums2[lastIndS2--];
            }
        }
    }
}
