class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
        int totalSum = prefix[n-1];
        int[] res = new int[n];
        for(int i=0; i<n; i++){
            int lSum = (i==0) ? 0 : prefix[i-1];
            int rSum = totalSum - prefix[i];
            res[i] = Math.abs(lSum - rSum);
        }
        return res;
    }
}