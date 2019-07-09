package com.ds.Stacks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TestDynamicStack {

    @Test
    public void testDynamicStack() {
        DynamicStackUsingArrays stack = new DynamicStackUsingArrays(10);

        try {
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);
            stack.push(6);
            stack.push(7);
            stack.push(8);
            stack.push(9);
            stack.push(10);

            System.out.println("Stack is full? " + stack.isFull());
            stack.printStack();

            stack.push(11);
            System.out.println("Stack is full? " + stack.isFull());
            stack.printStack();

            stack.push(12);
            System.out.println("Stack is full? " + stack.isFull());
            stack.printStack();

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
