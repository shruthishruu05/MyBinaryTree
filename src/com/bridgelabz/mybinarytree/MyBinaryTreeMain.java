package com.bridgelabz.mybinarytree;

public class MyBinaryTreeMain {
	public static void main(String[] args) {
		
		System.out.println("Binary Search Tree");
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<Integer>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		myBinaryTree.add(22);
		myBinaryTree.add(60);
		myBinaryTree.add(40);
		myBinaryTree.add(95);
		myBinaryTree.add(65);
		myBinaryTree.add(11);
		myBinaryTree.add(3);
		myBinaryTree.add(16);
		myBinaryTree.add(63);
		myBinaryTree.add(67);
		int searchValue =63;
		myBinaryTree.printBinaryTree();
		System.out.println("The Size of the Binary Tree is : "+myBinaryTree.getSize());
		System.out.println("Return true if " +searchValue+ " present ? --> " +myBinaryTree.searchTree(searchValue));
	}
}
