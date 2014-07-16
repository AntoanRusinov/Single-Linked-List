package com.egt.tests;

import org.testng.annotations.Test;

import com.egt.sll.SingleLinkedList;

public class TestReverse {

    @Test
    public static void test() {
	SingleLinkedList<Integer> list = new SingleLinkedList<Integer>();

	list.addByIndex(5, 0);
	list.addByIndex(10, 1);
	list.addByIndex(20, 2);

	list.print();

	assert list.getSize() == 3;

    }

}