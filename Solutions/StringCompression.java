package Solutions;

public class StringCompression {
    public int compress(char[] chars) {
        if (chars.length == 0) {
            return 0;
        }
        if (chars.length == 1) {
            return 1;
        }
        StringBuilder s = new StringBuilder();
        int idx = 1;
        char c;
        char lastC = chars[0];
        int count = 1;
        while (idx < chars.length) {
            c = chars[idx];
            if (lastC == c) {
                count++;
            } else if (count > 1) {
                s.append(lastC).append(count);
                count = 1;
            } else {
                s.append(lastC);
            }
            if (idx == chars.length - 1 && count > 1) {
                s.append(lastC).append(count);
            } else if (idx == chars.length - 1 && count == 1) {
                s.append(c);
            }
            idx++;
            lastC = c;
        }
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        return s.length();
    }

    public static void main(String[] args) {
        char[] input = {'a', 'b', 'b', 'b'};
        int result = new StringCompression().compress(input);
        System.out.println(input);
    }
}
