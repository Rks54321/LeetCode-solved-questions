class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(result, 0, new ArrayList<>(), nums);
        return result;
    }
    public static void backTrack(List<List<Integer>> result, int start, ArrayList<Integer> tempList, int[] nums) {
        result.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++) {

            tempList.add(nums[i]);
            backTrack(result, i + 1, tempList, nums);
            tempList.remove(tempList.size()-1);
        }
    }
}