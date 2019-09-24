package lesson10;

import java.util.Set;
import java.util.LinkedHashMap;


class Student1 {
    private String name;
    private int age;
    private String address;

    public Student1() {
    }

    public Student1(String name, int age, String address) {
        super();
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student@name=" + name + ",age=" + age + ",address=" + address;
    }
}
public class LinkedHashMap1 {
    public static void main(String args[]) {
        // init linkedHashMap
        LinkedHashMap<String, Student1> linkedHashMap
                = new LinkedHashMap<String, Student1>();
        // add elements to linkedHashMap
        linkedHashMap.put("1", new Student1("A", 12, "Hanoi"));
        linkedHashMap.put(null, new Student1("C", 13, "Hanoi"));
        linkedHashMap.put("2", null);
        linkedHashMap.put("4", new Student1("D", 14, "Hanoi"));
        // show linkedHashMap
        show(linkedHashMap);
    }

    public static void show(LinkedHashMap<String, Student1> linkedHashMap) {
        Set<String> keySet = linkedHashMap.keySet();
        for (String key : keySet) {
            System.out.println(key + " " + linkedHashMap.get(key));
        }
    }
}
