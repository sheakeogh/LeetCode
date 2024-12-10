package ArrayString;

import java.util.ArrayList;
import java.util.List;

public class ReverseVowelsOfString {

    public static String reverseVowels(String s) {
        char[] newS = s.toCharArray();
        List<Integer> arrIndex = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if ("AEIOUaeiou".indexOf(s.charAt(i)) != -1) {
                arrIndex.add(i);
            }
        }

        for (int i = 0; i < arrIndex.size(); i++) {
            newS[arrIndex.get(i)] = s.charAt(arrIndex.get(arrIndex.size() - i - 1));
        }

        return String.valueOf(newS);
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCreAm"));
    }
}
