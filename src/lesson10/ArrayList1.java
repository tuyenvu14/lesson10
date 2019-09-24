package lesson10;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("Vũ");
        list.add("Văn");
        list.add("Tuyền");

        ArrayList<String> listA = new ArrayList<String>();

        listA.addAll(list);
        System.out.print("listA:");
        showList(listA);


        ArrayList<String> listB = new ArrayList<String>();
        listB.add("Ha");
        listA.retainAll(listB);
        System.out.print("listA:");
        showList(listA);


        list.removeAll(listA);
        System.out.print("listA:");
        showList(list);
    }

    public static void showList(ArrayList<String> list) {
        for (String obj : list) {
            System.out.print("\t" + obj + " ");
        }
        System.out.println();
    }

}
