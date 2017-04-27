package me.farfaraway.hackerrank.ds.tree;

import java.util.Stack;

public class BinarySearchTree {

  class Node {
    Node left;
    Node right;
    int key;
  }

  public Node insert(Node root, final int value) {

    Node newTree = new Node();
    newTree.key = value;
    newTree.left = null;
    newTree.right = null;

    if (root == null) {
      root = newTree;
      return root;
    }

    Node temp = root;

    while (temp != null) {
      if (value < temp.key) {

        if (temp.left == null) {
          temp.left = newTree;
          break;
        }
        temp = temp.left;
      } else {
        if (temp.right == null) {
          temp.right = newTree;
          break;
        }
        temp = temp.right;
      }
    }
    return root;
  }

  /* Given a binary tree, print its nodes in inorder*/
  void printInorder(Node node) {
    if (node == null)
      return;

        /* first recur on left child */
    printInorder(node.left);

        /* then print the key of node */
    System.out.print(node.key + " ");

        /* now recur on right child */
    printInorder(node.right);
  }

  void inorderNonRec(Node root){

    Stack<Node> stack = new Stack<>();

    while (!stack.empty() || root != null){
      if (root != null){
        stack.push(root);
        root = root.left;
      }else {
        root = stack.pop();
        System.out.print(root.key + " ");
        root = root.right;
      }
    }
  }

  int height(Node root){

    if(root == null ||
            (root.left == null) && (root.right == null)) {
      return 0;
    }
    return 1 + Math.max(height(root.left), height(root.right));
  }


  /* Compute the "maxDepth" of a tree -- the number of
      nodes along the longest path from the root node
      down to the farthest leaf node.*/
  int maxDepth(Node node)
  {
    if (node == null)
      return 0;
    else
    {
       /* compute the depth of each subtree */
      int lDepth = maxDepth(node.left);
      int rDepth = maxDepth(node.right);

       /* use the larger one */
      if (lDepth > rDepth)
        return(lDepth+1);
      else return(rDepth+1);
    }
  }

 void topView(Node root)
  {
    if (root == null)
      return;

  }


  public static void main(String[] args) {

    BinarySearchTree tree = new BinarySearchTree();
    Node root = null;
    root = tree.insert(root, 3);
    root = tree.insert(root, 5);
    root = tree.insert(root, 2);
    root = tree.insert(root, 1);
    root = tree.insert(root, 4);
    root = tree.insert(root, 6);
    root = tree.insert(root, 7);
//    root = tree.insert(root, 1);
//    tree.insert(root, 3);
//    tree.insert(root, 2);
//    tree.insert(root, 5);
//    tree.insert(root, 4);
//    tree.insert(root, 6);
//    tree.insert(root, 7);
//    tree.insert(root, 9);
//    tree.insert(root, 8);
//    tree.insert(root, 11);
//    tree.insert(root, 13);
//    tree.insert(root, 12);
//    tree.insert(root, 10);
//    tree.insert(root, 15);
//    tree.insert(root, 14);


    //tree.printInorder(root);

    System.out.print(tree.height(root));
  }


}
