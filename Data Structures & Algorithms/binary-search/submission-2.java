class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;     

        while(left <= right){
            int current = left + (right - left) / 2;

            if(nums[current] == target){
                return current;
            }
            else if(nums[current] > target){
                right = current - 1;
                
            }
            else{
                left = current + 1;
            }
        }
        return -1;
    }
}
