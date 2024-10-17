package com.leetcode.practice.easy.slow_fast_pointer;

import junit.framework.TestCase;

public class MidElementofLinkedListTest extends TestCase {
    MidElementofLinkedList midElementofLinkedList = new MidElementofLinkedList();

    public void testMidElement() {
        LinkedList list = new LinkedList();
//      list.data=1;
        LinkedList l1 = new LinkedList();
        l1.data = 2;
        list.next = l1;
        LinkedList l2 = new LinkedList();
        l2.data = 3;
        l1.next = l2;
        LinkedList l3 = new LinkedList();
        l3.data = 4;
        l2.next = l3;
        LinkedList l4 = new LinkedList();
        l4.data = 5;
        l3.next = l4;
        LinkedList l5 = new LinkedList();
        l5.data = 6;
        l4.next = l5;
        assertEquals(4, midElementofLinkedList.midElement(list));
    }
}