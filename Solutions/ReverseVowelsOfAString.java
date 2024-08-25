package Solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        List<Integer> vowelsIndex = new ArrayList<>();
        char[] word = s.toCharArray();
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(word[i])) {
                vowels.add(word[i]);
                vowelsIndex.add(i);
            } else {
                result[i] = word[i];
            }
        }
        vowelsIndex = vowelsIndex.reversed();
        for (int i = 0; i < vowels.size(); i++) {
            result[vowelsIndex.get(i)] = vowels.get(i);
        }
        return String.copyValueOf(result);
    }


    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public static void main(String[] args) {
        String s = "aA";
        ReverseVowelsOfAString r = new ReverseVowelsOfAString();
        String result = r.reverseVowels(s);
        System.out.println(result);
    }
}


