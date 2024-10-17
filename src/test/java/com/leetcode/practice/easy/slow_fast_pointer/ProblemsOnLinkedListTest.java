package com.leetcode.practice.easy.slow_fast_pointer;

import junit.framework.TestCase;

public class ProblemsOnLinkedListTest extends TestCase {
    ProblemsOnLinkedList problemsOnLinkedList = new ProblemsOnLinkedList();

    public void testLengthOfLinkedList() {
        LinkedList list = new LinkedList();
//      list.data=1;
        LinkedList l1 = new LinkedList();
        l1.data = 2;
        list.next = l1;
        assertEquals(2, problemsOnLinkedList.lengthOfLinkedList(list));
    }

    public void testTestLengthOfLinkedList() {
    }
}