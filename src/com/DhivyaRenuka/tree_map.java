package com.DhivyaRenuka;

import java.util.Map;
import java.util.TreeMap;

public class tree_map {
    public static void main(String[] args) {
        Map<String, Integer> tm =new TreeMap<>();
        tm.put("one",1);
        tm.put("Two",2);
        tm.put("Three",3);
        tm.put("four",4);
        tm.put("five",5);
        System.out.println(tm);
        tm.remove("three");
        System.out.println(tm);

    }
}
