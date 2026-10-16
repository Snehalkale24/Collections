
import java.util.*;

public class anagram {
    public static void main(String args[]) {
        String s1 = "silent";
        String s2 = "listen";

        if (s1.length() != s2.length()) {
            System.out.println("not");
            return;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char ch1 = s1.charAt(i);

            if (map.containsKey(ch1)) {
                map.put(ch1, map.get(ch1) + 1);
            } else {
                map.put(ch1, 1);
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            char ch2 = s2.charAt(i);

            if (!map.containsKey(ch2)) {
                System.out.println("not");
                return;
            }

            map.put(ch2, map.get(ch2) - 1);
        }

        for (int value : map.values()) {
            if (value != 0) {
                System.out.println("not");
                return;
            }
        }

        System.out.println("Anagram");
    }
}


