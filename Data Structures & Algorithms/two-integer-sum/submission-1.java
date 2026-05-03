class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
            1. Create an hashmap that stores the target minus each num
            2. Loop through array and check if array value is in hashmap as a key
            3. If found return the value of hashmap and index of array
        */

        HashMap<Integer, Integer> diff = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            diff.put(target - nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            if(diff.containsKey(nums[i]) && i != diff.get(nums[i])){
                return new int[]{i, diff.get(nums[i])};
            }
        }

        return null;
    }
}
