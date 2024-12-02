class Solution {
    public int mostFrequent(int[] nums, int key) {
        // Frequency array to count occurrences of numbers following the key
        int[] freq = new int[1001]; // Supports values from 1 to 1000

        for (int i = 0; i < nums.length - 1; i++) { // Stop at second last index to avoid out of bounds
            if (nums[i] == key) {
                freq[nums[i + 1]]++;
            }
        }

        // Find the number with the maximum frequency
        int maxCount = 0;
        int ans = -1;
        for (int i = 0; i < 1001; i++) {
            if (freq[i] > maxCount) {
                maxCount = freq[i];
                ans = i; // `i` corresponds directly to the number
            }
        }

        return ans;
    }
}
