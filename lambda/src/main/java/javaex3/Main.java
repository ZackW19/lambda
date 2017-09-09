package javaex3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person (12L, "Robak"),
                new Person(11L, "Kwant"),
                new Person(9L, "Kosmos"));

       Collections.sort(personList, new Comparator<Person>()

       {
          @Override
           public int compare(Person p1, Person p2)
           {
               return p1.getUsername().compareTo(p2.getUsername());
           }

       });
        System.out.println(personList);
       }
}
