class Solution {
    public int findChampion(int n, int[][] edges) {
        int[] winner = new int[n];

        for(int[] edge: edges){
            int loss = edge[1];
            winner[loss]++;
        }

        int champion  = -1;
        int count = 0;

        for(int i=0; i<n; i++){
            if(winner[i] == 0){
                champion  = i;
                count++;
            }
        }

        return (count == 1) ? champion : -1;
    }
}