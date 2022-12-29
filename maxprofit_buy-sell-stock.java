class Solution {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        int diff = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]-minprice >= diff){
                diff = prices[i] - minprice;
            }
            else{
                minprice = prices[i];
                if(diff>0){
                    maxprofit = maxprofit + diff;
                    diff = 0;
                }
            }
        }
        if(diff>0){
            maxprofit = maxprofit+diff;
        }
        return maxprofit;
        
    }
}
