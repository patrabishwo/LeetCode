class Solution {
    public boolean canChange(String start, String target) {
        // Remove '_' and compare sequences of 'L' and 'R' in both strings
        if (!start.replace("_", "").equals(target.replace("_", ""))) {
            return false;
        }

        int n = start.length();
        int i = 0, j = 0;

        while (i < n && j < n) {
            // Skip blanks in both strings
            while (i < n && start.charAt(i) == '_') i++;
            while (j < n && target.charAt(j) == '_') j++;

            // If one index reaches the end, the other must also
            if (i == n || j == n) break;

            // Check if the characters are not the same
            if (start.charAt(i) != target.charAt(j)) {
                return false;
            }

            // Validate movement rules
            if (start.charAt(i) == 'L' && i < j) {
                return false; // 'L' cannot move right
            }
            if (start.charAt(i) == 'R' && i > j) {
                return false; // 'R' cannot move left
            }

            // Move to the next characters
            i++;
            j++;
        }

        return true;
    }
}
