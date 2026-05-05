class Solution {
    public boolean isValid(String s) {
        /*
            1. Put open paren onto stack
            2. When first close paren is found start popping
            3. If popped doesn't match next paren then return false
        */
        Stack<Character> stack = new Stack<>();
        
        for(char p : s.toCharArray()){
            if(p == '(' || p == '[' || p== '{'){
                stack.push(p);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();

                switch(p){
                    case ')':
                        if(top != '('){
                            return false;
                        }
                        break;
                    case ']':
                        if(top != '['){
                            return false;
                        }
                        break;
                    case '}':
                        if(top != '{'){
                            return false;
                        }
                        break;
                }
            }
        }
        return stack.isEmpty();
    }
}
