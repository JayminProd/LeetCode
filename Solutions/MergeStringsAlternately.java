package Solutions;

import java.util.Arrays;

class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        char[] word1array = word1.toCharArray();
        int word1idx = 0;
        char[] word2array = word2.toCharArray();
        int word2idx = 0;
        char[] newWord = new char[word1.length() + word2.length()];
        for (int i = 0; i < newWord.length; i++) {
            if (word1idx < word1.length() && ((i % 2 == 0) || word2idx == word2.length())) {
                newWord[i] = word1array[word1idx];
                word1idx++;
            } else if (word2idx < word2.length() && ((i % 2 != 0) || word1idx == word1.length())) {
                newWord[i] = word2array[word2idx];
                word2idx++;
            }
        }
        return String.copyValueOf(newWord);
    }

    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";
        String excpeted = "apbqrs";
        String result = mergeAlternately(word1, word2);
        if (result.equals(excpeted)) {
            System.out.println("Sucess");
        } else {
            System.out.println("Error!");
        }
    }
}