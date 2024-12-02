import java.util.*;

class Solution {
    public List<Integer> findLonely(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums); // Sort the array
        ArrayList<Integer> list = new ArrayList<>();
        
        // Check for single element case
        if (n == 1) {
            list.add(nums[0]);
            return list;
        }
        
        // Check the first element
        if (nums[0] + 1 < nums[1]) {
            list.add(nums[0]);
        }
        
        // Check elements in the middle
        for (int i = 1; i < n - 1; i++) {
            if (nums[i - 1] + 1 < nums[i] && nums[i] + 1 < nums[i + 1]) {
                list.add(nums[i]);
            }
        }
        
        // Check the last element
        if (nums[n - 2] + 1 < nums[n - 1]) {
            list.add(nums[n - 1]);
        }
        
        return list;
    }
}
