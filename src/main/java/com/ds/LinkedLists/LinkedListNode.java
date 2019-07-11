package com.ds.LinkedLists;

import sun.awt.image.ImageWatched;

public class LinkedListNode {
    int data;
    LinkedListNode next;
    LinkedListNode prev;

    public LinkedListNode(int data) {
        this.data = data;
        next = prev = null;
    }
}
