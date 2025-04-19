package TwoSum;

import java.util.HashMap;


public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Проходим по массиву
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Если дополнительное число уже есть в хеш-таблице, возвращаем его индекс и текущий индекс
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }

            // Если числа нет, добавляем текущее число в хеш-таблицу
            map.put(nums[i], i);
        }

        // Если не найдено решения, можно вернуть пустой массив или null
        return null;
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();

        // Пример 1
        int[] nums = {11,  2, 15, 7};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Result: [" + result[0] + ", " + result[1] + "]");

    }
}