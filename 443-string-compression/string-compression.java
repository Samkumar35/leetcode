class Solution {
    public int compress(char[] chars) {
        int index = 0;
        int i = 0;

        while(i < chars.length){
            char current = chars[i];
            int count = 0;
            while(i<chars.length && current == chars[i]){
                count++;
                i++;
            }
            chars[index++] = current;
            if(count > 1){
                String strs = Integer.toString(count);
                for(char ch : strs.toCharArray()){
                    chars[index++] = ch;
                }
            }
        }
        return index;
    }
}