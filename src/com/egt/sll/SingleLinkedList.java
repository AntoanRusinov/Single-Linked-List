package com.egt.sll;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class SingleLinkedList<E> {

    private Node<E> head;
    private Node<E> current;
    private int size;

    public SingleLinkedList() {
	current = null;
	head = null;
	size = 0;
    }

    public int getSize() {
	return size;
    }

    public void addByIndex(E value, int index) {
	if (index < 0) {
	    throw new InputMismatchException("Can not add element at negative index!");
	}

	if (this.head == null && index == 0) {
	    this.head = new Node<E>(value);
	    this.current = this.head;
	    size++;
	} else {

	    Node<E> iter = this.head;
	    Node<E> previous = null;

	    int i = 0;
	    for (; i <= index && iter != null; i++) {
		if (i == index) {

		    final Node<E> newOne = new Node<E>(value);

		    if (previous == null) {
			this.head = newOne;
			newOne.next = iter;
			this.current = iter;
		    } else {
			previous.next = newOne;
			newOne.next = iter;
		    }

		    size++;
		    return;
		}

		previous = iter;
		iter = iter.next;
	    }

	    throw new ArrayIndexOutOfBoundsException("Index => " + index + " can not be inserted there");

	}
    }

    public void remove() {
	if (head == null) {
	    throw new NoSuchElementException("List is empty!");
	} else if (head.next != null && head.next.next == null) {
	    head = null;
	    current = null;
	} else {

	    Node<E> pointer = head;

	    while (pointer.next != null) {
		if (pointer.next.next == null) {
		    final Node<E> beforeLast = pointer;
		    beforeLast.next = null;
		    current = beforeLast;
		    break;
		}

		pointer = pointer.next;
	    }
	    size--;
	}
	System.out.println("Last element removed");
    }

    public void print() {

	Node<E> iter = this.head;

	while (iter != null) {
	    System.out.print("[" + iter.value + "]");
	    iter = iter.next;
	}

	System.out.println();

    }

    public void reverse() {
	reverseElement(head);

	final Node<E> temp = head;
	head = current;
	current = temp;

    }

    private Node<E> reverseElement(Node<E> current) {

	if (current == null) {
	    throw new NoSuchElementException("List is empty");
	}

	if (current.next == null) {
	    return current;
	}

	Node<E> nextItem = reverseElement(current.next);

	nextItem.next = current;
	current.next = null;

	return current;
    }

    public Node<E> getLast() {
	if (size == 0)
	    throw new NoSuchElementException();
	return current;
    }

    public Node<E> getHead() {
	return head;
    }

    public Node<E> getCurrent() {
	return current;
    }

    @Override
    public String toString() {
	return "SingleLinkedList [head=" + head + ", current=" + current + ", size=" + size + "]";
    }

}
