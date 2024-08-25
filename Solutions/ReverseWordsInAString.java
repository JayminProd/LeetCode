package Solutions;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        String workingString = s.trim();
        boolean isFirst = true;
        String result = "";
        for (String subString : workingString.split(" ")) {
            if (subString.isBlank()) continue;
            if (isFirst) {
                isFirst = false;
                result = subString + result;
            } else {
                result = subString + " " + result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ReverseWordsInAString rs = new ReverseWordsInAString();
        String input = "a good   example";
        String output = rs.reverseWords(input);
        System.out.println(output);
    }
}
