import java.awt.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

import static project.tasksAnastasia.*;
import static project.tasksAnastasia.compareElements;


public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(" -- ADD --"); // 1
        add(list);
        System.out.println(" -- DELETE --"); // 1
        delete(list);
        System.out.println(" -- Find Substring --"); // 6
        search(list);
        System.out.println(" -- Work with files --"); // 7
        init(list);
        System.out.println(" -- XML -- "); // 3
        writeXmlFile(list);
        System.out.println(" -- Compare 2 elements -- "); // 8
        compareElements(list);


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