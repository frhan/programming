package me.farfaraway.hackerrank.data_structure.Tree;

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

  public static void main(String[] args) {

    BinarySearchTree tree = new BinarySearchTree();
    Node root = null;
    root = tree.insert(root, 11);
    tree.insert(root, 10);
    tree.insert(root, 14);
    tree.insert(root, 17);
    tree.printInorder(root);

  }


}
