package com.egt.tests;

import org.testng.annotations.Test;
import com.egt.sll.SingleLinkedList;

public class TestRemove {

    @Test
    public static void test() {

	SingleLinkedList<String> list = new SingleLinkedList<String>();

	list.addByIndex("a", 0);
	list.addByIndex("b", 1);
	list.addByIndex("c", 2);
	list.addByIndex("d", 3);
	list.addByIndex("e", 4);

	System.out.println("List elements before removing: " + list.getSize());

	list.remove();
	list.remove();
	list.remove();

	System.out.println("List elements: " + list.getSize());
	assert list.getSize() == 2;

    }

}
