package com.ds.Queues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void testBasicQueue() {
        try {
            BasicQueue<Integer> queue = new BasicQueue<>();

            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);
            queue.enqueue(4);
            queue.enqueue(5);
            queue.enqueue(6);
            queue.enqueue(7);
            queue.enqueue(8);
            queue.enqueue(9);
            queue.enqueue(10);

            System.out.println("Queue full? " + queue.isFull());
            System.out.println("Queue empty? " + queue.isEmpty());

            System.out.println("Queue element: " + queue.dequeue());
            System.out.println("Queue element: " + queue.dequeue());
            System.out.println("Queue element: " + queue.dequeue());

            System.out.println("Queue full? " + queue.isFull());
            System.out.println("Queue empty? " + queue.isEmpty());

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @Test
    public void testDynamicQueue() {
        try {
            DynamicQueue<Integer> queue = new DynamicQueue<>();

            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);
            queue.enqueue(4);
            queue.enqueue(5);
            queue.enqueue(6);
            queue.enqueue(7);
            queue.enqueue(8);
            queue.enqueue(9);
            queue.enqueue(10);

            System.out.println("Queue full? " + queue.isFull());
            System.out.println("Queue empty? " + queue.isEmpty());

            queue.enqueue(11);

            System.out.println("Queue element: " + queue.dequeue());
            System.out.println("Queue element: " + queue.dequeue());
            System.out.println("Queue element: " + queue.dequeue());

            System.out.println("Queue full? " + queue.isFull());
            System.out.println("Queue empty? " + queue.isEmpty());

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
