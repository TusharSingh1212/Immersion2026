import java.util.*;

public class Hash_Map {
    public static void main(String[] args) {
        HashMap<Character, Integer> h = new HashMap<>();
        String s = "Hello, How are you?";
        for (char ch : s.toCharArray()) {
            h.put(ch, h.getOrDefault(ch, 0) + 1);
        }
        for (Character ch : h.keySet()) {
            System.out.println(ch + " => " + h.get(ch));
        }
    }
}
// h.put(1,3);
// h.put(1,4);
// h.put(2, 5);
// h.containsKey(1);
// h.containsValue(4);
// h.size();
// h.get(1);
// h.getOrDefault(2, 0);
// h.keySet();