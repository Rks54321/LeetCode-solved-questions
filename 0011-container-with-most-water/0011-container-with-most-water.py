class Solution:
    def maxArea(self, height: List[int]) -> int:
        n = len(height)
        left = 0
        right = n-1
        maxArea = 0
        while(left < right):
            minHeight = min(height[left], height[right])
            width = right - left
            maxArea = max(maxArea,minHeight * width)
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        return maxArea
