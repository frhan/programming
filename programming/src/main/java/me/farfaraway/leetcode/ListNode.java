package me.farfaraway.leetcode;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        this.val = x;
    }

    @Override
    public String toString() {
        String s = String.valueOf(val);

        ListNode node = next;
        while (node != null){
           s += " -> "+ next.val;

           node = node.next;
        }
        return s;
    }
}
