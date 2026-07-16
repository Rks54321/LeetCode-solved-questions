class Solution {
    public String minWindow(String s, String t) {
        int[] arrT = new int[256];
        int[] arrS = new int[256];
        for(char c : t.toCharArray()) arrT[c]++;
        int left = 0, minLen = Integer.MAX_VALUE, start = 0;
        for(int i = 0 ; i < s.length(); i++) {
            arrS[s.charAt(i)]++;
            while(contains(arrS, arrT)) {
                if(i - left + 1 < minLen) {
                    minLen = i - left + 1;
                    start = left;
                }
                arrS[s.charAt(left++)]--;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start+minLen);
    }
    public static boolean contains(int[] arrS, int[] arrT) {
        for(int i = 0; i < 256; i++) {
            if(arrT[i] > arrS[i]) {
                return false;
            }
        }
        return true;
    }
}