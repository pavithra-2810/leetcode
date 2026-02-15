class Solution {
    public int maxProfit(int[] prices) 
    {
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int c:prices)
        {
            if(c<min)
            {
                min=c;
            }
            else
            {
                int profit=c-min;
                max=Math.max(profit,max);
            }
        }
        return max;
    }
}
