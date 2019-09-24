package lesson10;

import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        // init treeSet object
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("Java");
        treeSet.add("C++");
        treeSet.add("C++");
        treeSet.add("Java");
        treeSet.add("PHP");
        treeSet.add("ABC");
        // show treeSet
        System.out.println(treeSet);
    }

}
