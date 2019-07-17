package com.ds.Queues;

public class BasicQueue<T> {

    private int DEFAULT_QUEUE_CAPACITY = 10;

    private int size;
    private int front;
    private int rear;
    private Object arr[];

    public BasicQueue() {
        this.size = DEFAULT_QUEUE_CAPACITY;
        this.front = -1;
        this.rear = -1;
        this.arr = new Object[this.size];
    }

    public BasicQueue(int size) {
        this.size = size;
        this.front = -1;
        this.rear = -1;
        this.arr = new Object[this.size];
    }

    public void enqueue(T data) throws Exception {
        // If queue is full, throw an exception
        // Else, insert the element at the rear position
        if (isFull()) {
            throw new Exception("Queue overflow!");
        }

        arr[++rear] = data;
    }

    public T dequeue() throws Exception {
        // If the queue is empty, throw an exception
        // Else, return the element in the front of the queue
        //
        // Before
        //
        //    front                                   rear
        //     1   ->    2   ->    3    ->   4   ->    5
        //
        // After
        //
        //    front                        rear
        //     2   ->    3    ->   4   ->    5

        if (isEmpty()) {
            throw new Exception("Queue underflow!");
        }

        front++;
        return (T) arr[front];
    }

    public boolean isFull() {
        return (rear == size - 1);
    }

    public boolean isEmpty() {
        return (front == size - 1) || (front == rear);
    }
}
