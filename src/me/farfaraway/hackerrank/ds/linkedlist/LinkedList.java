package me.farfaraway.hackerrank.ds.linkedlist;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**
 * Created by farhan on 4/11/17.
 * https://www.hackerrank.com/domains/data-structures/linked-lists
 */
public class LinkedList {

  class Node {
    int data;
    Node next;
  }

  public static void main(String args[]) {

    LinkedList ll = new LinkedList();
    Node headA = null;
    headA = ll.insertNth(headA, 1, 0);
    headA = ll.insertNth(headA, 3, 1);
    headA = ll.insertNth(headA, 5, 2);
    headA = ll.insertNth(headA, 6, 3);
    headA = ll.insertNth(headA, 6, 4);
    headA = ll.insertNth(headA, 6, 5);
    ll.show(headA);

//
//    LinkedList ll2 = new LinkedList();
//    Node headB = null;
//    headB = ll2.insertNth(headB, 2, 0);
//    headB = ll2.insertNth(headB, 4, 1);
//    headB = ll2.insertNth(headB, 7, 2);
//    ll2.show(headB);

//    Node head = ll.mergeLists(headA, headB);
//    ll.show(head);
    //System.out.println(ll.getNode(headA, 2));
    headA = ll.removeDuplicatesFromSorted(headA);
    ll.show(headA);

  }

  public void show(Node head) {
    System.out.println("Show");
    if (head == null) {
      return;
    }

    Node temp = head;
    do {
      System.out.println(temp.data);
      temp = temp.next;
    } while (temp != null);
  }

  Node insertNth(Node head, int data, int position) {
    // This is a "method-only" submission.
    // You only need to complete this method.
    // This is a "method-only" submission.
    // You only need to complete this method.
    Node newNode = new Node();
    newNode.data = data;

    if (position == 0) {
      newNode.next = head;
      return newNode;
    }

    Node temp = head;
    Node prev = null;

    while (position > 0) {
      prev = temp;
      temp = temp.next;
      position--;
    }

    newNode.next = temp;
    prev.next = newNode;
    return head;
  }

  Node delete(Node head, int position) {
    if (position == 0) {

      if (head == null)
        return head;

      Node temp = head;
      head = head.next;
      temp = null;
      return head;
    }

    Node temp = head;
    Node prev = null;

    while (position > 0) {
      prev = temp;
      temp = temp.next;
      position--;
    }

    prev.next = temp.next;
    temp = null;
    return head;
  }

  void reversePrint(Node head) {
    System.out.println("Reverse Show");

    if (head == null)
      return;

    Deque<Integer> stack = new ArrayDeque<Integer>();
    Node temp = head;
    do {
      stack.addFirst(temp.data);
      temp = temp.next;

    } while (temp != null);

    Iterator<Integer> iterator = stack.iterator();
    while (iterator.hasNext()) {
      Integer next = iterator.next();
      System.out.println(next);
    }

  }

  Node reverse(Node head) {
    if (head == null)
      return head;

    Deque<Node> stack = new ArrayDeque<Node>();
    Node temp = head;
    do {
      stack.addFirst(temp);
      temp = temp.next;
    } while (temp != null);

    Iterator<Node> iterator = stack.iterator();
    Node prev = null;
    while (iterator.hasNext()) {
      Node next = iterator.next();
      if (prev == null) {
        head = next;
        prev = head;
        continue;
      }
      prev.next = next;
      prev = next;
    }

    prev.next = null;
    return head;
  }

  int CompareLists(Node headA, Node headB) {
    while (headA != null && headA != null) {
      if (headA.data != headB.data) {
        return 0;
      }

      headA = headA.next;
      headB = headB.next;
    }

    return (headA == null && headB == null) ? 1 : 0;
  }

  Node mergeLists(Node headA, Node headB) {
    if (headA == null)
      return headB;

    if (headB == null)
      return headA;

    Node t = headA;
    Node head = headB;
    Node prev = null;

    do {
      prev = t;
      t = t.next;
      head = insertSorted(head, prev);

    } while (t != null);

    return head;
  }

  private Node insertSorted(Node head, Node node) {
    if (head == null) {
      head = node;
      return head;
    }

    //insert Head
    if (node.data < head.data) {
      node.next = head;
      head = node;
      return head;
    }

    //insert between
    Node temp = head;
    Node prev = null;

    while (temp != null) {
      if (node.data < temp.data) {
        node.next = temp;
        prev.next = node;
        return head;
      }

      prev = temp;
      temp = temp.next;
    }

    //insert last
    prev.next = node;
    return head;
  }

  int getNode(Node head, int positionFromTail) {
    if (head == null)
      return 0;

    Deque<Integer> stack = new ArrayDeque<Integer>();
    Node temp = head;
    do {
      stack.addFirst(temp.data);
      temp = temp.next;

    } while (temp != null);

    Iterator<Integer> iterator = stack.iterator();
    int pos = 0;
    while (iterator.hasNext()) {
      Integer next = iterator.next();
      if (pos == positionFromTail)
        return next;
      pos++;
    }

    return 0;
  }

  Node removeDuplicatesFromSorted(Node head) {
    if (head == null)
      return head;

    Node prev = head;
    Node temp = head.next;

    while (temp != null) {
      if (temp.data == prev.data) {
        prev.next = temp.next;
        Node n = temp;
        temp = prev.next;
        n = null;
      } else {
        prev = temp;
        temp = temp.next;
      }
    }
    return head;
  }

  Node insertTail(Node head, int data) {
    if (head == null) {
      head = new Node();
      head.data = data;
      head.next = null;
      return head;
    }

    Node temp = head;
    while (temp.next != null)
      temp = temp.next;
    Node node = new Node();
    node.data = data;
    node.next = null;
    temp.next = node;

    return head;
  }

  Node insertHead(Node head, int x) {

    if (head == null) {
      head = new Node();
      head.data = x;
      head.next = null;
      return head;
    }

    Node temp = new Node();
    temp.data = x;
    temp.next = head;
    head = temp;
    return head;
  }
}
