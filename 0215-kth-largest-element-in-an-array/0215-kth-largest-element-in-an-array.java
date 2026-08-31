class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue pq = new PriorityQueue();
        for(int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
        if (pq.size() > k) {
            pq.poll();
        }
        }
        return (int) pq.peek();

    }
}