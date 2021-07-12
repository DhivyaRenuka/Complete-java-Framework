package com.DhivyaRenuka;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Tree_set {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        /* val are unique and they gice in sorted order
        O log n time complexity
         */
        set.add(34);
        set.add(24);
        set.add(94);
        set.add(94); // duplicate elem are not allowed here in set
        System.out.println(set);
        set.remove(94);
        System.out.println(set);
        System.out.println(set.contains(34));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        System.out.println(set.iterator());
        set.clear();
        System.out.println(set.isEmpty());
        System.out.println(set.hashCode());
    }
}
