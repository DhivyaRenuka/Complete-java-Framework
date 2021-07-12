package com.DhivyaRenuka;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class linked_hashset {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        /* linked hashset the order will remain same as one node val is linked with other val
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
