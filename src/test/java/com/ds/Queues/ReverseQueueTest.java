package com.ds.Queues;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueueTest {

    @Test
    public void testReverseQueueUsingStack() {
        Queue<Integer> queue = new LinkedList<>();
        ReverseQueue rQueue = new ReverseQueue();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        queue.add(10);

        System.out.println(queue.toString());

        rQueue.reverseQueueUsingStack(queue);

        System.out.println(queue.toString());
    }

    @Test
    public void testReverseQueueUsingRecursion() {
        Queue<Integer> queue = new LinkedList<>();
        ReverseQueue rQueue = new ReverseQueue();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        queue.add(10);

        System.out.println(queue.toString());

        rQueue.reverseQueueUsingRecursion(queue);

        System.out.println(queue.toString());
    }
}
