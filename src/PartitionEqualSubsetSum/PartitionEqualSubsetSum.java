package PartitionEqualSubsetSum;

public class PartitionEqualSubsetSum {

    // Главный метод: проверяет, можно ли разбить массив на два подмножества с равной суммой
    public boolean canPartition(int[] nums) {
        int sum = getArraySum(nums);
        if (isOdd(sum)) return false;

        int target = sum / 2;
        return canReachTargetSum(nums, target);
    }

    // Метод для подсчета суммы массива
    private int getArraySum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    // Метод для проверки, нечётное ли число
    private boolean isOdd(int number) {
        return number % 2 != 0;
    }

    // Метод на динамическое программирование для поиска нужной суммы
    private boolean canReachTargetSum(int[] nums, int target) {
        boolean[] dp = new boolean[target + 1];
        dp[0] = true; // базовый случай: сумма 0 всегда возможна

        for (int num : nums) {
            for (int i = target; i >= num; i--) {
                dp[i] = dp[i] || dp[i - num];
            }
        }

        return dp[target];
    }

    // Тест
    public static void main(String[] args) {
        PartitionEqualSubsetSum solver = new PartitionEqualSubsetSum();

        int[] nums1 = {1, 5, 11, 5};
        System.out.println(solver.canPartition(nums1)); // true

        int[] nums2 = {1, 2, 3, 5};
        System.out.println(solver.canPartition(nums2)); // false
    }
}

