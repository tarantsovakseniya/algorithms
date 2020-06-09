package com.data_structures.algorithms.DFS.binarytree;

import java.util.Stack;

public class BinaryTree {
	TreeNode root;

	static class TreeNode {
		String data;
		TreeNode left, right;

		TreeNode(String data) {
			this.data = data;
			left = right = null;
		}
	}

	public void inOrderRecursively() {
		inOrderRecursively(root);
	}

	private void inOrderRecursively(TreeNode root) {
		if (root == null)
			return;

		inOrderRecursively(root.left);
		System.out.printf("%s ", root.data);
		inOrderRecursively(root.right);
	}

	public void inOrderWithoutRecursion() {
		Stack<TreeNode> nodes = new Stack<>();
		TreeNode current = root;

		while (!nodes.isEmpty() || current != null) {
			if (current != null) {
				nodes.push(current);
				current = current.left;
			} else {
				TreeNode node = nodes.pop();
				System.out.printf("%s ", node.data);
				current = node.right;
			}
		}
	}
}