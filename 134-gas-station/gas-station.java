class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank = 0;
        int total = 0;
        int start = 0;
        for(int i=0; i<gas.length; i++){
            int gain = gas[i] - cost[i];
            tank += gain;
            total += gain;
            if(tank < 0){
                tank = 0;
                start = i+1;
            } 
        }
        if(total < 0){
            return -1;
        }else{
            return start;
        }
    }
}