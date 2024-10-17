package com.leetcode.practice.easy.slow_fast_pointer;

public class MidElementofLinkedList {
    public int midElement(LinkedList list) {
        LinkedList slow, fast;
        slow = fast = list;
        if (slow == null)
            return 0;
        else if (slow.next == null)
            return list.data;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
}
