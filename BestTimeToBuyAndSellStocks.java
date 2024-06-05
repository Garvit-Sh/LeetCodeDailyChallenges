class Solution {
    public int maxProfit(int[] p) {
        int min=p[0];
        int profit=0;
        for(int i=0 ; i<p.length ; i++){
            int cost=p[i]-min;
            profit=Math.max(cost,profit);
            min=Math.min(min,p[i]);

        }

        
        return profit;
    }
}






// TimeComplexity- O(N)
//Space Complexity - O(1)
