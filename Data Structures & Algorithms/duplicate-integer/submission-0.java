
class Solution {
    public boolean hasDuplicate(int[] nums) {
        /*
        1. Create hashmap to store occurences of numbers
        2. If any value is greater than 1 return true otherwise false
        */
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i], 0) + 1);

            if(map.get(nums[i]) > 1){
                return true;
            }
            
        }

        return false;
    }
}