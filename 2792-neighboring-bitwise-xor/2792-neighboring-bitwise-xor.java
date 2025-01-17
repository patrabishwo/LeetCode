class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int n = derived.length;
        
        // Check assuming original[0] = 0
        if (isValid(derived, 0, n)) return true;

        // Check assuming original[0] = 1
        if (isValid(derived, 1, n)) return true;

        return false;
    }

    private boolean isValid(int[] derived, int original0, int n) {
        int[] original = new int[n];
        original[0] = original0;

        // Compute the entire original array based on derived
        for (int i = 1; i < n; i++) {
            original[i] = original[i - 1] ^ derived[i - 1];
        }

        // Check the circular condition
        return (original[n - 1] ^ original[0]) == derived[n - 1];
    }
}
