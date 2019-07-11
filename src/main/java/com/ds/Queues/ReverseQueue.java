package com.ds.Queues;

import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

    // To reverse the queue using stack
    //
    // Poll the elements from the queue until its empty
    // and push those elements into a stack
    //
    // Then, until the stack is empty
    // Pop the elements from the stack and push them to the queue
    //
    public void reverseQueueUsingStack(Queue<Integer> queue) {

        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    // To reverse the queue using recursion
    // The approach is same as the one using stack
    //
    // Poll the elements from the queue
    // Store the polled element
    // If the queue is empty, return
    // Perform the above steps recursively
    //
    // Since the method ends recursion when all the queue elements are polled
    // Add the polled element into the same queue
    // As the recursive stack frames store the polled element,
    // the last element polled from the queue (front of queue) becomes the first element (rear of the queue) to be pushed into queue
    // Hence the queue will be reversed

    public void reverseQueueUsingRecursion(Queue<Integer> queue) {

        if (queue.isEmpty())
            return;

        Integer temp = queue.poll();
        reverseQueueUsingRecursion(queue);

        queue.add(temp);
    }
}
