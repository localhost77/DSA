package com.ds.Stacks;

import java.util.Arrays;

public class DynamicStackUsingArrays implements GenericStack<Integer> {

    int[] stack;
    int top = -1;
    int DEFAULT_STACK_CAPACITY = 10;

    public DynamicStackUsingArrays() {
        stack = new int[DEFAULT_STACK_CAPACITY];
    }

    public DynamicStackUsingArrays(int size) {
        stack = new int[size];
    }

    @Override
    public void push(Integer elem) throws Exception {
        if (isFull()) {
            //throw new Exception("Stack overflow");
            System.out.println("Resizing to: " + (this.stack.length * 2));
            this.stack = Arrays.copyOf(this.stack, (this.stack.length * 2));
        }

        stack[++top] = elem;
    }

    @Override
    public Integer pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack underflow");
        }
        return stack[top--];
    }

    @Override
    public Integer peek() {
        return stack[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == stack.length - 1;
    }

    public void printStack() {
        System.out.println("Stack length: " + (stack.length));
        System.out.println("Stack contents");
        for (int i = top; i >= 0; i--)
            System.out.println(stack[i]);
    }
}
