class Solution {
    public int maxProfit(int[] prices) {
        /*
            1. Iterate backwards from end of array using two pointers to check the buy and sell prices
            2. Save the largest profit throughout
        */

        int profit = Integer.MIN_VALUE;
        int sellIndx = prices.length - 1;
        int buyIndx = prices.length - 2;

        while(sellIndx != 0){
            if(prices[sellIndx] - prices[buyIndx] > profit){
                profit = prices[sellIndx] - prices[buyIndx];
                System.out.println(profit);
            }
            if(buyIndx == 0){
                sellIndx--;
                buyIndx = sellIndx;
            }
            buyIndx--;
        }

        if(profit > 0){
            return profit;
        }
        return 0;
    }
}
