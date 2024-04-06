package solutions;

public class BestTimeToSellStock {
    public int bruteForceMaxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            } else if(prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }

    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < buyPrice) {
                buyPrice = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - buyPrice);
            }
        }
        return maxProfit;
    }
}
