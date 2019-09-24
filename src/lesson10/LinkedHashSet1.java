package lesson10;

import java.util.LinkedHashSet;
import java.util.Set;

class Student2 {
    private int id;
    private String name;

    public Student2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }
}

public class LinkedHashSet1 {
    public static final int NUM_OF_ELEMENT = 5;

    public static void main(String[] args) {
        // Create list
        Set<Student2> students = new LinkedHashSet<>();
        Student2 st1 = new Student2(1, "myname1");
        Student2 st2 = new Student2(2, "myname2");
        Student2 st3 = new Student2(3, "myname3");
        Student2 st4 = new Student2(4, "myname4");
        Student2 st5 = new Student2(5, "myname5");
        students.add(st1);
        students.add(st3);
        students.add(st2);
        students.add(st5);
        students.add(st4);
        students.add(st2);
        students.add(st3);

        // Show set student
        for (Student2 student : students) {
            System.out.println(student);
        }
    }
}
