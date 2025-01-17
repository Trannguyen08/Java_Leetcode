public class BestTimeToBuyAndSellStock_121 {
    public int maxProfit(int[] prices) {
        int minIndex = prices[0];
        int ans = 0;
        for( int i = 1 ; i < prices.length ; i++ ){
            if( prices[i] < minIndex ){
                minIndex = prices[i];
            }
            ans = Math.max(ans, prices[i]-minIndex);
        }
        return ans;
    }
}
