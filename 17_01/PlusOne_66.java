public class PlusOne_66 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for( int i = n-1 ; i >= 0 ; i-- ){
            if (digits[i] + 1 != 10) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newArray = new int[n+1];
        newArray[0] = 1;
        return newArray;
    }
}
