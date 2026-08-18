class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.length() == 0) return result;

        Map<Character,String> phone = new HashMap<>();
        phone.put('2', "abc");
        phone.put('3', "def");
        phone.put('4', "ghi");
        phone.put('5', "jkl");
        phone.put('6', "mno");
        phone.put('7', "pqrs");
        phone.put('8', "tuv");
        phone.put('9', "wxyz");

        backtrack(result, phone, digits, 0, "");
        return result;
    }
    private void backtrack(List<String> result, Map<Character, String> phone, String digits, int index, String path) {
        if(path.length() == digits.length()){
            result.add(path);
            return;
        }
        String letters = phone.get(digits.charAt(index));
        for (char ch : letters.toCharArray()) {
            backtrack(result, phone, digits, index + 1, path + ch);
        }
    }
}