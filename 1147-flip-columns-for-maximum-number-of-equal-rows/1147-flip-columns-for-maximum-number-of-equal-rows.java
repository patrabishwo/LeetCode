import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        Map<String, Integer> group = new HashMap<>();
        for (int[] row : matrix) {
            StringBuilder values = new StringBuilder();
            StringBuilder flipped = new StringBuilder();

            // Generate the original and flipped versions of the row
            for (int r : row) {
                values.append(r);
                flipped.append(1 - r);
            }

            // Convert to strings for comparison
            String vs = values.toString();
            String fs = flipped.toString();

            // Count occurrences of both versions
            group.put(vs, group.getOrDefault(vs, 0) + 1);
            group.put(fs, group.getOrDefault(fs, 0) + 1);
        }

        int ans = 0;
        // Find the maximum occurrence
        for (int v : group.values()) {
            ans = Math.max(ans, v);
        }
        return ans;
    }
}
