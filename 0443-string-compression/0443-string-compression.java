class Solution {
    public int compress(char[] chars) {
        int index = 0; // The position where we write the compressed data in chars
        int i = 0;     // The current position in the input array
        
        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;
            
            // Count the number of occurrences of the current character
            while (i < chars.length && chars[i] == currentChar) {
                count++;
                i++;
            }
            
            // Write the character to the chars array
            chars[index++] = currentChar;
            
            // If the count is greater than 1, write the digits of the count to chars
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }
        
        return index; // The new length of the compressed array
    }
}
