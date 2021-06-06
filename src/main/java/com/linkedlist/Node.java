package com.linkedlist;

public class Node<K> {
    private Node next;
    private K key;

    public Node(K key) {
        this.key = null;
        this.next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
