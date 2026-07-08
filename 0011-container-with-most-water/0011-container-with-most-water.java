class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1, maxWater = 0;
        while(left < right) {
            int height1 = Math.min(height[left], height[right]);
            int width = right - left;
            int area = height1 * width;
            maxWater = Math.max(area, maxWater);

            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
}