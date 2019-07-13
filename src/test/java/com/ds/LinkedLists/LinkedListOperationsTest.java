package com.ds.LinkedLists;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListOperationsTest {

    @Test
    public void testLinkedListOperations() {
        LinkedListOperations linkedListOperations = new LinkedListOperations();

        linkedListOperations.insertNodeAtBeginning(1);
        linkedListOperations.insertNodeAtBeginning(2);
        linkedListOperations.insertNodeAtBeginning(3);
        linkedListOperations.insertNodeAtBeginning(4);
        linkedListOperations.insertNodeAtBeginning(5);

        linkedListOperations.printLinkedList();
        System.out.println("Middle node: " + linkedListOperations.findMiddleNode().data);

        linkedListOperations.insertNodeAtEnd(6);
        linkedListOperations.insertNodeAtEnd(7);
        linkedListOperations.insertNodeAtEnd(8);
        linkedListOperations.insertNodeAtEnd(9);
        linkedListOperations.insertNodeAtEnd(10);

        linkedListOperations.printLinkedList();
        System.out.println("Middle node: " + linkedListOperations.findMiddleNode().data);

        linkedListOperations.deleteNodeByNumber(5);
        linkedListOperations.deleteNodeByNumber(7);
        linkedListOperations.deleteNodeByIndex(1);
        linkedListOperations.deleteNodeByIndex(2);

        linkedListOperations.printLinkedList();
        System.out.println("Middle node: " + linkedListOperations.findMiddleNode().data);

        linkedListOperations.rotateRight(4);

        linkedListOperations.printLinkedList();
        System.out.println("Middle node: " + linkedListOperations.findMiddleNode().data);

        linkedListOperations.deleteNodeByNumber(9);

        linkedListOperations.printLinkedList();
        System.out.println("Middle node: " + linkedListOperations.findMiddleNode().data);
    }
}
