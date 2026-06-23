class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long zeros = 0;
        
        int i = 0;
        while(i < nums.length) {
            if(nums[i] == 0) {
                zeros++;
                count += zeros;
            } else {
                zeros = 0;
            }
            i++;
        }
        return count;
    }
}