class Solution {
    public int maxProfit(int[] prices, int fee) {
        int eb=prices[0] , p=0;
        for(int i=1;i<prices.length;i++){
            p=Math.max(p,prices[i]-eb-fee);
            eb=Math.min(eb,prices[i]-p);
        }
        return p;
    }
}