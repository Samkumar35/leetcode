class Solution {
    public long sumAndMultiply(int n) {
        String str = Integer.toString(n);
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != '0'){
                sb.append(str.charAt(i));
                
            }
        }
        if (sb.length() == 0) {
            return 0;
        }
        int sum = 0;
        for(int i=0; i<sb.length(); i++){
            sum += sb.charAt(i) - '0';
        }
        String s = sb.toString();
        int num = Integer.parseInt(s);
        return (long)num * sum;
    }
}