class Solution {
    public int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE, maxProfit = 0;
        for(int i = 0; i < prices.length; i++) {
            minValue = Math.min(minValue, prices[i]);
            int profit = prices[i] - minValue;
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }
}