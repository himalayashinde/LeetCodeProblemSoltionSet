package Solution.LeetCodeProblems.Easy.TwoSum;

class TwoSums {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; // Return indices instead of values
                }
            }
        }
        return new int[]{}; // Return empty array if no solution found
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]); // Expected output: 0 1
    }
}
