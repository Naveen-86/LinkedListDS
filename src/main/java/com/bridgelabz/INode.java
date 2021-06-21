package com.bridgelabz;

public interface INode<T> {
    T getKey();
    void setkey(T key);

    INode getNext();
    void setNext(INode next);
}
