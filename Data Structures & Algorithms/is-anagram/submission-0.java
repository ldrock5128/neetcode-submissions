class Solution {
    public boolean isAnagram(String s, String t) {
        /*
            1. Iterate through each string and store letter occurences in hashmaps
            2. Check equality of hashmaps
        */

        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i),0) + 1);
        }
        for(int i = 0; i < t.length(); i++){
            mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i),0) + 1);
        }

        if(mapS.equals(mapT)){
            return true;
        }
        return false;
    }
}
