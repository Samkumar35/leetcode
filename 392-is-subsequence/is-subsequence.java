class Solution {
    public boolean isSubsequence(String s, String t) {
        int s_sub = 0;
        int t_sub = 0;

        while(s_sub < s.length() && t_sub < t.length()){
            if(s.charAt(s_sub) == t.charAt(t_sub)){
                s_sub++;
            }
            t_sub++;
        }

        return s_sub == s.length();
    }
}