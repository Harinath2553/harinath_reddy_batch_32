package com.Hashmap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIteration {
    public static void main(String[] args) {
        // Create a HashSet
        Set<String> hashSet = new HashSet<>();

        // Add strings to the HashSet
        hashSet.add("Hari nath");
        hashSet.add("Hit-man");
        hashSet.add("Ro-hit");
        hashSet.add("Sachin");
        hashSet.add("Sarah");
        hashSet.add("Deepika");
        hashSet.add("java mawa");
        hashSet.add("Cis");
        hashSet.add("Texas");
        hashSet.add("HelloIndia");

        // Iterate using Iterator
        System.out.println("Iterating HashSet using Iterator:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // Iterate using forEach
        System.out.println("\nIterating HashSet using forEach:");
        for (String element : hashSet) {
            System.out.println(element);
        }

        // Iterate using Streams forEach
        System.out.println("\nIterating HashSet using Streams forEach:");
        hashSet.stream().forEach(System.out::println);
    }
}
