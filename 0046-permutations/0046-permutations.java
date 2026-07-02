class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(result, nums, new ArrayList<>());
        return result;
    }
    public static void backTrack(List<List<Integer>> result, int[] nums, ArrayList<Integer> tempList) {
        if(tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
            return;
        }
        for(int num : nums) {
            if(tempList.contains(num)) {
                continue;
            }
            tempList.add(num);
            backTrack(result, nums, tempList);
            tempList.remove(tempList.size() - 1);
        }
    }
}