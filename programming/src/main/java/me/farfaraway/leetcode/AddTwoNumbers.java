package me.farfaraway.leetcode;

public class AddTwoNumbers {

    static int listLength(ListNode node) {
        int length = 0;

        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }

    static int sumOfTwoNode(ListNode l1) {

        if (l1 == null)
            return 0;

        return l1.val + sumOfTwoNode(l1.next);

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return null;
    }

    public static void main(String []  args){

        ListNode n1 =  new ListNode(2);
        ListNode n2 = new ListNode(4);
        n1.next = n2;

        ListNode n3 = new ListNode(6);
        ListNode n4 = new ListNode(8);
        n3.next = n4;
        System.out.println(sumOfTwoNode(n3));

    }
}
