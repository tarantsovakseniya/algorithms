package com.data_structures.algorithms.DFS.binarytree;

import com.data_structures.algorithms.DFS.binarytree.BinaryTree.TreeNode;

/* The InOrder traversal is also known as the left-node-right or left-root-right traversal or LNR traversal algorithm.
 * It is also a depth-first algorithm because it explores the depth of a binary tree before exploring siblings.
 * One of the worth knowing things about inorder traversal is that it prints all nodes of the tree in sorted order if given binary tree is binary search tree. A useful detail to solve many binary tree-based problems.

Steps to implement with recursion:
 1. visit left node
 2. visit root node
 3. visit right node

Steps to implement without recursion
 1. Start with current = root
 2. Loop, until Stack is empty or current, becomes null
 3. If the current is not null push current into the stack and current = current.left
 4. If the current is null then pop from stack, print the node value and current = node.right 

 * input:
 *        40 
 *       /  \ 
 *     20    50 
 *    /  \     \ 
 *  10    30    60 
 *  /    /  \ 
 * 5   67    78
 *
 * output:
 * 5 10 20 67 30 78 40 50 60
 */
public class BinaryTreeInOrderTraversal {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new TreeNode ("40");
		tree.root.left = new TreeNode("20");
		tree.root.left.left = new TreeNode("10");
		tree.root.left.left.left = new TreeNode("5");
		
		tree.root.left.right = new TreeNode("30");
		tree.root.right = new TreeNode("50");
		tree.root.right.right = new TreeNode("60");
		tree.root.left.right.left= new TreeNode("67");
		tree.root.left.right.right = new TreeNode("78");
		
		tree.inOrderRecursively();
		System.out.println();
		tree.inOrderWithoutRecursion();
	}
}