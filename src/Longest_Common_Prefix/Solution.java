package Longest_Common_Prefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        System.out.printf("prefix: %s%n", prefix); // правильно
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        Solution solution = new Solution();
        String result = solution.longestCommonPrefix(strs);
        System.out.println("Result: " + result); // будет "fl"
    }
}


