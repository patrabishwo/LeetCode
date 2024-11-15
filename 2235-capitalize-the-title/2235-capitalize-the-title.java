class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder();
        String[] words = title.split(" ");

        for (String word : words) {
            if (word.length() > 2) {
                // Capitalize the first character and make the rest lowercase
                sb.append(Character.toUpperCase(word.charAt(0)));
                sb.append(word.substring(1).toLowerCase());
            } else {
                // Make the entire word lowercase
                sb.append(word.toLowerCase());
            }
            sb.append(" "); // Add a space after each word
        }

        return sb.toString().trim(); // Remove the trailing space
    }
}
