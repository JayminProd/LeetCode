package Solutions;

import java.util.List;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (t.length() < s.length()) return false;
        if (s.isBlank()) return true;
        int lastLetterIndex = 0;
        int pointer = 0;
        for (int i = 0; i < t.length(); i++) {
            if (pointer == s.length()) return true;
            if (s.charAt(pointer) == t.charAt(i)) {
                if (lastLetterIndex > i) {
                    return false;
                }
                lastLetterIndex = i;
                pointer++;
            }
        }
        return pointer == s.length();
    }

    public static void main(String[] args) {
        boolean output = new IsSubsequence().isSubsequence("b", "abc");
        System.out.println(output);
    }
}
