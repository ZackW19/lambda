package javaex2;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>();
        elements.add(5);
        elements.add(8);
        elements.add(12);

        System.out.println(MyArray.map(elements, (a) -> a + 5));
    }
}
