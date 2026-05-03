class Solution {
    public boolean isPalindrome(String s) {
        /*
            1. Remove the white space
            2. Split the string in half
            3. reverse one string
            4. compare for equality
        */
        String s1 = "";
        String s2 = "";

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        if(s.length() % 2 == 0){
            s1 = s.substring(0, s.length()/2);
            s2 = s.substring(s.length()/2);
        }
        if(s.length() % 2 == 1){
            s1 = s.substring(0, s.length()/2);
            s2 = s.substring(s.length()/2 + 1);
        }

        s2 = new StringBuilder(s2).reverse().toString();

        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
}
