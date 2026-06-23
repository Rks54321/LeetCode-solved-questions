class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int j = 0, i = 1;
        while(i < nums.length) {
            if(nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
            i++;
        }
        return j+1;
    }
}