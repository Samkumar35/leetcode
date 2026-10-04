class Solution {
    public int minSwaps(int[] nums) {

        int ones = 0;
        for(int num: nums){
            if(num == 1) ones++;
        }

        if(ones == 0 || ones == nums.length) return 0;

        int currOnes = 0;
        for(int i=0; i<ones; i++){
            if(nums[i] == 1) currOnes++;
        }

        int maxOnes = currOnes;

        for(int i=ones; i<nums.length + ones; i++){
            if(nums[i % nums.length] == 1) currOnes++;
            if(nums[(i - ones) % nums.length] == 1) currOnes--;
            maxOnes = Math.max(maxOnes, currOnes);
        }
        return ones - maxOnes;
    }
}