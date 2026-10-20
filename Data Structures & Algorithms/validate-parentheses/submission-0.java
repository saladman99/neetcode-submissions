class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> mp = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        mp.put(')','(');
        mp.put(']','[');
        mp.put('}','{');

        for(char c : s.toCharArray()){
            if(mp.containsKey(c)){
            if(!stack.isEmpty() && stack.peek() == mp.get(c)){
                stack.pop();
            } else{
                return false;
            }
            }else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
        
    }
}
