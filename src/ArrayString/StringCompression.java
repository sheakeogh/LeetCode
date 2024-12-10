package ArrayString;

public class StringCompression {

    public static int compress(char[] chars) {
        int i = 0;

        for (int start = 0; start < chars.length;) {
            int end = start + 1;

            while (end < chars.length && chars[start] == chars[end]) {
                end++;
            }

            chars[i] = chars[start];
            i++;

            if ((end - start) > 1) {
                String count = String.valueOf(end - start);
                for (char c : count.toCharArray()) {
                    chars[i] = c;
                    i++;
                }
            }

            start = end;
        }

        return i;
    }

    public static void main(String[] args) {
        System.out.println(compress(new char[] {'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
    }
}