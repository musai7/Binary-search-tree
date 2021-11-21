package com.bridgeit.binarytree;

public class BinaryMain  {
	
	public static void main(String[] args) {
		
		BinaryTree<Integer> binaryTree = new BinaryTree<>();
		
		binaryTree.add(56);

		binaryTree.add(30);
		binaryTree.add(70);
		
		binaryTree.add(22);
		binaryTree.add(40);
		
		binaryTree.add(60);
		binaryTree.add(95);
		
		binaryTree.inOrder();
	}
	
}
