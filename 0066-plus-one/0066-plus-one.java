class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;  // n = 3
        for(int i = n - 1; i >= 0; i--) {
            if(digits[i] == 9) { 
                digits[i] = 0;
            } else {
                digits[i] += 1;
                return digits;
            }
        }
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;
    }
    }