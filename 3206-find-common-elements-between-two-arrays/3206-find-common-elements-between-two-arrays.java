class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        short count1 = 0; // Count common elements from nums1 present in nums2
        int[] ans = new int[2]; // Array to store the two counts

        // Count the number of elements in nums1 that are present in nums2
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    count1++;
                    break; // Move to the next element in nums1 once a match is found
                }
            }
        }
        ans[0] = count1;

        short count2 = 0; // Count common elements from nums2 present in nums1

        // Count the number of elements in nums2 that are present in nums1
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    count2++;
                    break; // Move to the next element in nums2 once a match is found
                }
            }
        }
        ans[1] = count2;

        return ans; // Return the counts of common elements in both directions
    }
}