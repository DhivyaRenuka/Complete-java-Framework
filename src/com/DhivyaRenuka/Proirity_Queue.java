package com.DhivyaRenuka;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Proirity_Queue {
    public static void main(String[] args) {
        // max heap
        PriorityQueue<Integer> pq = new PriorityQueue(Comparator.reverseOrder());
        pq.offer(89);
        pq.offer(99);
        pq.offer(79);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());

        // min heap priority queue
        PriorityQueue<Integer> pq1 = new PriorityQueue();
        pq1.offer(89);
        pq1.offer(99);
        pq1.offer(79);
        System.out.println(pq1);
        pq1.poll();
        System.out.println(pq1);
        System.out.println(pq1.peek());
    }
}
