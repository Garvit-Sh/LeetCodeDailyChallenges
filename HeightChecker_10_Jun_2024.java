class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int[] hash = new int [n];
        for(int i=0; i<n ; i++){
            hash[i]=heights[i];
        }
        int count=0;
        Arrays.sort(heights);
        for(int i=0 ; i<n ; i++){
            if(hash[i]!=heights[i]) count++;
        }
        return count;

        
    }
}
