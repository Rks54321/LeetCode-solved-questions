class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        // String current = "";
        // int open_count = 0;
        // int close_count = 0;


        backtrack("", 0, 0, result, n);
        return result;
    }

    public void backtrack(String current, int open_count, int close_count, List<String> result, int n)  {
        if (current.length() == 2*n) {
            result.add(current);
            return;
        }
        if (open_count < n) {
            backtrack(current + "(", open_count + 1, close_count, result, n);
        }
        if (close_count < open_count) {
            backtrack(current + ")", open_count, close_count + 1, result, n);
        }
    }
}