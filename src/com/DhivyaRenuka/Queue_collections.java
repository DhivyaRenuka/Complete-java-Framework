package com.DhivyaRenuka;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_collections {

    public static void main(String[] args) {
        Queue<Integer> queue =new LinkedList();
        queue.offer(12);
        queue.offer(19);
        queue.offer(89);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());
    }
    /*
    three more fn are
     add() - add element like offer idf not working throw error
     remove() - is same as poll but if element at last it will show error while poll show null
     element() - same as peek()
     */
}
