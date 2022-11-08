class Solution {
    public int maxProfit(int[] prices) {
        // Have two variables that will hold minimum price we have seen and max profit
        // we will iterate through all Integers to find the minimum number
    
        int minPrice = Integer.MAX_VALUE;
        int max = 0;
        for( int i = 0; i < prices.length; i++){
            if( prices[i] < minPrice) minPrice = prices[i];
            if( prices[i] - minPrice > max) max = prices[i] - minPrice;
        }
        return max;
    }
}