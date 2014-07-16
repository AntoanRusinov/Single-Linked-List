package com.egt.sll;

public class Node<Type> {

    Type value;
    Node<Type> next;

    public Node(Type element) {
	this.value = element;
    }

    public Type getValue() {
	return value;
    }

    public void setValue(Type value) {
	this.value = value;
    }

    public Node<Type> getNext() {
	return next;
    }

    public void setNext(Node<Type> next) {
	this.next = next;
    }

    @Override
    public String toString() {
	return "Node [value=" + value + ", next=" + next + "]";
    }

}
