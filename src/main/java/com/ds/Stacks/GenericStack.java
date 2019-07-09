package com.ds.Stacks;

public interface GenericStack<T> {

    // Push the element to a stack
    void push(T elem) throws Exception;

    // Pop the element from a stack
    T pop() throws Exception;

    // Peek at the stack, but do not pop the element
    T peek();

    // Check if the stack is empty
    boolean isEmpty();

    // Check if the stack is full
    boolean isFull();
}
