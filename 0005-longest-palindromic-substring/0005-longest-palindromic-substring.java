class Solution {
    public String longestPalindrome(String s) {
        int start = 0, end = 0;
        for(int i = 0; i < s.length() - 1; i++) {
            int len1 = expands(s,i,i);
            int len2 = expands(s,i,i+1);
            int len = Math.max(len1,len2);
            if(len > end - start) {
                start = i - (len-1)/2;
                end = i + len/2;
            }
        }
            return s.substring(start, end + 1);
        
    }
    public static int expands(String s, int l, int r) {
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
            return r - l - 1; 
    }
}