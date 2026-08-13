class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int max_profit = 0;
        for(int price : prices){
            if(price < minPrice){
                minPrice = price;
            }
            else{
                max_profit = Math.max(max_profit , price - minPrice);
            }
        }
        return max_profit;
    }
}