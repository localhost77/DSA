package com.ds.Stacks;

public class TestArrayStack {

    public static void main(String[] args) {
        StackUsingArrays stack = new StackUsingArrays(10);

        try {
            stack.push(0);
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);
            stack.push(6);
            stack.push(7);
            stack.push(8);
            stack.push(9);     // 10th element - stack full
            //stack.push(10);

            System.out.println("Stack is full? " + stack.isFull());

//            System.out.println(stack.pop());
//            System.out.println(stack.pop());
//            System.out.println(stack.pop());
//            System.out.println(stack.pop());
//            System.out.println(stack.pop());
//            System.out.println(stack.pop());
//            System.out.println(stack.pop());
//            System.out.println(stack.pop());
//            System.out.println(stack.pop());
//            System.out.println(stack.pop());
//
//            System.out.println("Stack is empty? " + stack.isEmpty());

            stack.printStack();

            stack.reverseStack();

            stack.printStack();

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

