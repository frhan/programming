package me.farfaraway.ds.tree;

public class BinarySearchTree {
    BinaryTreeNode head;

    public BinarySearchTree()
    {
        head = null;
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



}
