package me.farfaraway.ds.tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class BinarySearchTree {
    BinaryTreeNode head;

    public BinarySearchTree()
    {
        head = null;
    }

    public BinaryTreeNode search(int value){
        return null;
    }

    public void inorderTraversalIterative(){
        if (head == null){
            return;
        }

        Deque<BinaryTreeNode> stackNodes = new ArrayDeque<>();
        stackNodes.push(head);

        while (!stackNodes.isEmpty()) {
            BinaryTreeNode top = stackNodes.pop();
            System.out.print(top.value+" ");
            if (top.right != null)
                stackNodes.push(top.right);
            if (top.left != null)
                stackNodes.push(top.left);
        }
    }

    public void add(int value)
    {
        BinaryTreeNode newNode = new BinaryTreeNode(value);
        if (head == null){
          head = newNode;
          return;
        }

        BinaryTreeNode walk = head;
        BinaryTreeNode parent = null;

        while (walk != null) {
            parent = walk;
            if (value > walk.value)
                walk = walk.right;
            else if (value < walk.value)
                walk = walk.left;
        }

        if (value > parent.value)
            parent.right = newNode;
        if (value < parent.value)
            parent.left = newNode;
    }

    public static void main(String [] args){
        BinarySearchTree tree = new BinarySearchTree();

        tree.add(10);
        tree.add(12);
        tree.add(5);
        tree.add(8);
        tree.add(16);

        tree.inorderTraversalIterative();
    }
}
