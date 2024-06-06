class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        int i = 0;
        int j = 1;
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] < 0) {
                arr[j] = nums[k];
                j += 2;
            } else {
                arr[i] = nums[k];
                i += 2;

            }

        }

        return arr;

    }
}



//TimeComplexity -- O(n)
//SpaceComplexity -- O(n)
