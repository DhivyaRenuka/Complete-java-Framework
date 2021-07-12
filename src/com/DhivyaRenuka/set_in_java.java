package com.DhivyaRenuka;

import java.util.HashSet;
import java.util.Set;

public class set_in_java {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        /*
        hash set genrate a hash val for every set element thats why duplication not allowed and it print randomly for each and every print st
        O(1) very optimised usage
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
