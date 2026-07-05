class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int num : asteroids){
            boolean collide = false;
            while(!stack.isEmpty() && num < 0 && stack.peek() > 0){
                if(stack.peek() < -num){
                    stack.pop();
                }else if(stack.peek() == -num){
                    stack.pop();
                    collide = true;
                    break;
                }else{
                    collide = true;
                    break;
                }
            }
            if(!collide){
                stack.push(num);
            }
        }
        int[] ans = new int[stack.size()];
        for(int i=stack.size()-1; i>=0; i--){
            ans[i] = stack.pop();
        }
        return ans;
    }
}