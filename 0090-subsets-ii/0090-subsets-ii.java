class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backTrack(result, nums, 0, new ArrayList<>());
        return result;
    }
    public static void backTrack(List<List<Integer>> result, int[] nums, int start, ArrayList<Integer> current) {
        // List<Integer> tempList = new ArrayList<>();
        // if(start == nums.length) {
            result.add(new ArrayList(current));
        // }
        for(int i = start; i < nums.length; i++) {
            if(i > start && nums[i] == nums[i-1]) {
                continue;
            }
            current.add(nums[i]);
            backTrack(result, nums, i + 1, current);
            current.removeLast();
        }

    }
}