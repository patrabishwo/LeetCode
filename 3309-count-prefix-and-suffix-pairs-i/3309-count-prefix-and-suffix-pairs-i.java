class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int cnt = 0;
        for (int i = 0; i < words.length; ++i) {
            for (int j = i + 1; j < words.length; ++j)
                if (words[j].startsWith(words[i]) && words[j].endsWith(words[i]))
                    ++cnt;
        }
        return cnt;
    }
}