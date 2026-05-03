class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer, Integer> lossCount = new HashMap<>();
        HashSet<Integer> players = new HashSet<>();

        for(int[] match: matches){
            int winner = match[0];
            int loser = match[1];

            players.add(winner);
            players.add(loser);

            lossCount.put(loser, lossCount.getOrDefault(loser, 0) + 1);
        }

        ArrayList<Integer> zeroLossPlayer = new ArrayList<>();
        ArrayList<Integer> oneLossPlayer = new ArrayList<>();

        for(int player: players){
            if(!lossCount.containsKey(player)){
                zeroLossPlayer.add(player);
            }else if(lossCount.get(player) == 1){
                oneLossPlayer.add(player);
            }
        }

        Collections.sort(zeroLossPlayer);
        Collections.sort(oneLossPlayer);

        List<List<Integer>> result = new ArrayList<>();

        result.add(zeroLossPlayer);
        result.add(oneLossPlayer);

        return result;
    }
}