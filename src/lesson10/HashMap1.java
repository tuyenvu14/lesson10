package lesson10;

import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0, 4);
        hashMap.put(1, 2);
        hashMap.put(2, 6);
        hashMap.put(5, 2);
        hashMap.put(3, 1);
        hashMap.put(4, 5);

        // Cách duyệt HashMap với forEach() trong Java 8
        // đối số thứ nhất bên trong forEach là key
        // đối số thứ hai bên trong forEach là value
        System.out.println("Các entry có trong hashMap là: ");
        hashMap.forEach((keyInt, valueInt) -> System.out.println(
                "Key = " + keyInt + ", value = " + valueInt));
    }
}
