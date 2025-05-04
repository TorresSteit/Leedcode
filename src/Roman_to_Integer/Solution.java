package Roman_to_Integer;


import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);


        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = map.get(s.charAt(i));
            System.out.println(current);
            System.out.println(s.charAt(i));

            if (i < s.length() - 1 && current < map.get(s.charAt(i + 1))) {
                result -= current;
                System.out.println(result);
            } else {
                result += current;
            }
        }

        return result;
    }

    // Для проверки:
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("IV"));       // 3
        System.out.println(solution.romanToInt("LVIII"));     // 58
        System.out.println(solution.romanToInt("MCMXCIV"));   // 1994
    }
}
