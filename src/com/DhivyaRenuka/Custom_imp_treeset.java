package com.DhivyaRenuka;

import java.util.HashSet;
import java.util.Set;

public class Custom_imp_treeset {
    public static void main(String[] args) {
        Set<custome_set> cs =new HashSet<>();
        cs.add(new custome_set("divya",101));
        cs.add(new custome_set("Navya",102));
        cs.add(new custome_set("priya",103));
        cs.add(new custome_set("kavya",101)); // roll should be unique
        System.out.println(cs);
    }
}
