package com.ds.Stacks;

public class StackUsingArrays implements GenericStack<Integer> {

    int[] stack;
    int top = -1;
    int DEFAULT_STACK_CAPACITY = 10;

    public StackUsingArrays() {
        stack = new int[DEFAULT_STACK_CAPACITY];
    }

    public StackUsingArrays(int size) {
        stack = new int[size];
    }

    @Override
    public void push(Integer elem) throws Exception {
        if (isFull()) {
            throw new Exception("Stack overflow");
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
        System.out.println("Stack contents");
        for (int i = top; i >= 0; i--)
            System.out.println(stack[i]);
    }
}
