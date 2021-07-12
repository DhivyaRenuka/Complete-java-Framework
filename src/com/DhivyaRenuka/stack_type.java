package com.DhivyaRenuka;

import java.util.Stack;

public class stack_type {
    public static void main(String[] args) {
        Stack<String> w_animals =new Stack();
        w_animals.push("lion");
        w_animals.push("deer");
        w_animals.push("cobra");
        w_animals.push("Zebra");
        w_animals.push("elephant");
        System.out.println("stack of animals are "+w_animals);
        System.out.println(w_animals.peek());
        w_animals.pop();
        System.out.println(w_animals.peek());


    }
}
