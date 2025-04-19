package IspalidormNumber;

public class Solution {

    public boolean isPalindrome(int x) {
        // Отрицательные числа не палиндромы (например, -121)
        // И числа типа 10, 100 — не палиндромы (начинаются с 1, заканчиваются на 0)
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;

        // Пока оригинальное число больше перевёрнутого — идём дальше
        while (x > reversedHalf) {
            int lastDigit = x % 10; // берём последнюю цифру
            reversedHalf = reversedHalf * 10 + lastDigit; // добавляем справа
            x /= 10; // убираем последнюю цифру
        }

        // Если длина чётная → x == reversedHalf
        // Если длина нечётная → x == reversedHalf / 10 (одна цифра лишняя)
        return x == reversedHalf || x == reversedHalf / 10;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        
        System.out.println(s.isPalindrome(121));   // true
        System.out.println(s.isPalindrome(-121));  // false
        System.out.println(s.isPalindrome(10));    // false
        System.out.println(s.isPalindrome(0));     // true
        System.out.println(s.isPalindrome(12321)); // true
    }
}
