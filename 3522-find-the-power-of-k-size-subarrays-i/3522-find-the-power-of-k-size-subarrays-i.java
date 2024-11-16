class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            boolean isConsecutiveAscending = true;

            for (int j = i; j < i + k - 1; j++) { // Adjusted loop range
                if (nums[j + 1] != nums[j] + 1) { // Check consecutive condition
                    isConsecutiveAscending = false;
                    break;
                }
            }

            if (isConsecutiveAscending) { // Fixed condition (== should not be used for boolean)
                result[i] = nums[i + k - 1]; // Last element of subarray is the max
            } else {
                result[i] = -1;
            }
        }
        return result;
    }
}