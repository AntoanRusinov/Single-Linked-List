package com.egt.tests;

import java.util.InputMismatchException;

import org.testng.annotations.Test;

import com.egt.sll.SingleLinkedList;

public class TestAdd {

    @Test
    public static void test() {

	// negative index
	SingleLinkedList<Integer> list = new SingleLinkedList<Integer>();

	InputMismatchException ex = null;

	try {
	    list.addByIndex(1, -1);
	} catch (InputMismatchException e) {
	    ex = e;
	}

	assert ex != null;

	// add on empty
	ArrayIndexOutOfBoundsException ae = null;

	try {
	    list.addByIndex(100, 1);
	} catch (ArrayIndexOutOfBoundsException e) {
	    ae = e;
	}

	assert ae != null;

	// add on empty correctly

	list.addByIndex(7, 0);

	assert list.getSize() == 1;

	// add a few more

	int index = 0;

	for (int k = 1; k < 5; k++) {
	    list.addByIndex(k * 100, index++);
	}

	list.print();

	assert list.getSize() == 5;
    }

}
