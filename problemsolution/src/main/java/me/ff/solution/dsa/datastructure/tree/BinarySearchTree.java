package me.ff.solution.dsa.datastructure.tree;

public class BinarySearchTree {
    TreeNode root;

    public  BinarySearchTree(){
        root = null;
    }

    public void insertNonRe(final int data){
        if (data == root.data)
            return;

        TreeNode newNode = new TreeNode(data);
        TreeNode current = root;
        TreeNode prev = null;

        while (current != null){
            prev = current;
            if (data < current.data)
                current = current.left;
            if (data > current.data)
                current = current.right;
        }

        if (prev == null)
            root = newNode;
        if (data < prev.data)
            prev.left = newNode;
        else
            prev.right = newNode;
    }

    public void inOrderRec(TreeNode root){
        if (root == null)
            return;
        inOrderRec(root.left);
        System.out.println(root.data);
        inOrderRec(root.right);
    }

    public int search(int key){

        TreeNode current = root;

        while (current != null){

        }
        return 0;
    }
}
