class Solution {
    public String convertToBase7(int num) {
        if(num == 0) return "0";
        int n = num;
        boolean minus = false;
        if(num < 0){
            n = Math.abs(num);
            minus = true;
        }
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            sb.append(n%7);
            n = n / 7;
        }
        if(minus == true) sb.append('-');
        return sb.reverse().toString();
    }
}