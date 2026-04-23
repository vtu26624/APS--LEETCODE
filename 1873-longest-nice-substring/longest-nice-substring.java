class Solution {
    public String longestNiceSubstring(String s) {
        var result = "";

        for (int i=0; i<s.length(); i++) {
            for (int j=i+1; j<s.length(); j++) {
                var current = s.substring(i, j+1);
                if (isNice(current)) {
                    result = current.length() > result.length() ? current : result;
                }
            }
        }

        return result;
    }

    public boolean isNice(String s) {
        // A=0, Z=25, a=32, z=57, index = char minus 'A'
        int[] letters = new int[58];

        for (int i=0; i<s.length(); i++) {
            letters[s.charAt(i) - 'A']++;
        }

        for (int i=0; i<26; i++) {
            if ((letters[i] == 0 && letters[i+32] != 0) || (letters[i] != 0 && letters[i+32] == 0)) {
                return false;
            }
        }

        return true;
    }
}