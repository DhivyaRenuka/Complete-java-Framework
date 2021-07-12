package com.DhivyaRenuka;

import java.util.ArrayDeque;

public class Array_dqueue {

    public static void main(String[] args) {
        ArrayDeque<Integer> adq =new ArrayDeque<>();
        adq.offer(78);
        adq.offerFirst(23);
        adq.offerLast(98);
        adq.offerFirst(83);
        System.out.println(adq);
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());
        System.out.println(adq.poll());
        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());
    }
}
