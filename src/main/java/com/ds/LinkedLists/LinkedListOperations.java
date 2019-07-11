package com.ds.LinkedLists;

import sun.awt.image.ImageWatched;

import javax.sound.midi.SysexMessage;

public class LinkedListOperations {

//    Create a class for LinkedList operations which has following subroutines or methods.
//            1. Insert a node
//                a. beggining
//                b. end
//
//            2. Delete a node
//                a. by number
//                b. by index.
//
//            3. Search a node
//
//            4. rotate a node by n times
//
//            5. Find the middle node in a linked list.

    private LinkedListNode head = null;

    public boolean insertNodeAtBeginning(int data) {
        LinkedListNode node = new LinkedListNode(data);
        node.next = null;

        if (head != null) {
            node.next = head;
        }

        head = node;

        return true;
    }

    public boolean insertNodeAtEnd(int data) {
        LinkedListNode node = new LinkedListNode(data);
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            LinkedListNode temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }

        return true;
    }

    public void printLinkedList() {
        System.out.println("Linked list contents:");
        for (LinkedListNode temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.data + " -> ");
        }
        System.out.println(" NULL ");
    }

    public boolean deleteNodeByNumber(int data) {

        LinkedListNode temp = head , prev = head;

        if (temp == null) {
            System.out.println("Element to delete is not found.");
            return false;
        }

        while (temp != null) {
            if (temp.data == data) {
                if (temp == head) {
                    head = temp.next;
                    break;
                } else {
                    prev.next = temp.next;
                    break;
                }
            }
            prev = temp;
            temp = temp.next;
        }

        return true;
    }

    public boolean deleteNodeByIndex(int index) {
        LinkedListNode temp = head , prev = head;
        int nodeCount = 1;

        if (temp == null) {
            System.out.println("Element to delete is not found.");
            return false;
        }

        while (temp != null) {
            if (nodeCount == index) {
                if (temp == head) {
                    head = temp.next;
                    break;
                } else {
                    prev.next = temp.next;
                    break;
                }
            }
            prev = temp;
            temp = temp.next;
            nodeCount++;
        }

        return true;
    }

    public boolean searchNode(int data) {
        LinkedListNode node = head;

        while (node != null) {
            if (node.data == data) {
                return true;
            }
        }

        return false;
    }

    // this method rotates the linked list
    // by 'n' number of times
    //
    // e.g.
    // 3 -> 1 -> 6 -> 8 -> 9 -> 10 ->  NULL
    //
    // if the above list is rotated by 1, then
    //
    // the outcome is
    //
    // 10 -> 3 -> 1 -> 6 -> 8 -> 9 -> NULL, n = 4
    // 1 -> 6 -> 8 -> 9 -> 10 -> 3 -> NULL
    // 4 % 6 = 4

    // Move till the kth node
    public void rotateRight(int n) {
        LinkedListNode node = head, temp = head;

        if (node == null)
            return;

        int count;

        while (node.next != null) {
            temp = node;
            node = node.next;
        }

        if (node.next == null) {
            node.next = null;
        }
    }
}
