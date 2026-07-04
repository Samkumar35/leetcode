class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+ 1);
        }

        int max = 0;
        for(int value : map.values()){
            if(max < value){
                max = value;
            }
        }

        int count = 0;
        for(int value : map.values()){
            if(max == value){
                count += value;
            }
        }
        return count;
    }
}