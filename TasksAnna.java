import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TasksAnna {
    public static void addAndDelete(ArrayList<String> list) {
        list.add("Anna");
        list.add("Dima");
        list.add("Nastya");
        list.add("Gennady");
        list.add("Maria");
    }

    public static int searchSame(ArrayList list) {
        int amount = 1;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    amount++;
                }
            }
        }
        return amount;
    }

    public static ArrayList reverseStrings(ArrayList<String> list) {
        ArrayList<String> reverseList = new ArrayList<>();
        for (String element : list) {
            reverseList.add(reverse(element));
        }
        return reverseList;
    }

    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }


    public static void countLetters(ArrayList<String> list) {
        char[] alphabet = new char[100];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) ('a' + i);
            alphabet[i + 26] = (char) ('A' + i);
        }

        Map<Character, Integer> map = new HashMap<>();
        for (Character x : alphabet) {
            int j = 0;
            for (String s : list) {
                for (int i = 0; i < s.length(); i++) {
                    if (x == s.charAt(i)) j++;
                }
                if (j != 0) map.put(x, j);
            }
        }
        System.out.println(map);
    }

    public static void countLength(ArrayList<String> list) {
        Map<Integer, String> map = new HashMap<>();
        for (String element : list) {
            map.put(element.length(), element);
        }

        TreeMap<Integer, String> sortedMap = new TreeMap<>(map);
        sortedMap.putAll(map);
        System.out.println(sortedMap);
    }

    public static void dynamicAsStatic(ArrayList<String> list, int capacity) {
        ArrayList<String> queue = new ArrayList<>(capacity - 1);
        for (int i = 0; i < list.size(); i++) {
            queue.add(list.get(i));
            if (i>capacity -1) {
                queue.remove(0);
            }
        }
        System.out.println(queue);
    }
}
