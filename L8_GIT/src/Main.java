import java.awt.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;



public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        TasksAnna.addAndDelete(list);

        System.out.println("Initial list: " + list);
        int amount = TasksAnna.searchSame(list);
        System.out.println("Amount of same elements: " + amount);


        ArrayList<String> reverseList = TasksAnna.reverseStrings(list);
        System.out.println("\nReversed list: " + reverseList);

        System.out.print("\nLetters count: ");
        TasksAnna.countLetters(list);

        System.out.print("\nSorted elements by length asc: ");
        TasksAnna.countLength(list);

        TasksAnna.dynamicAsStatic(list, 2);


    }

}