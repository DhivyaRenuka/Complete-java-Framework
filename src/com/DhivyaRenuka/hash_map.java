package com.DhivyaRenuka;

import java.util.HashMap;
import java.util.Map;

public class hash_map {
    public static void main(String[] args) {
        Map<String,Integer> numbers = new HashMap<>();
        numbers.put("one",1);
        numbers.put("Two",2);
        numbers.put("Three",3);
        numbers.put("Two",23); // value is overrided
        if(numbers.containsKey("two")){
            numbers.put("Two",23);
        }
        numbers.putIfAbsent("two",23); // it will not make to override the value
        System.out.println(numbers);
        // iterator
        for (Map.Entry<String,Integer>e: numbers.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
for (String key :numbers.keySet()){
    System.out.println(key);
}
for (Integer val : numbers.values()){
    System.out.println(val);
}

boolean a=numbers.containsValue(3);
        System.out.println(a);
    }
}
