package com.learn.DSA.TreeDSA;

public class BinarySearchTreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTreeImpl tree = new BinaryTreeImpl();
		
		tree.insert(8);
		tree.insert(7);
		tree.insert(12);
		tree.insert(15);
		tree.insert(2);
		tree.insert(5);
		
		
		//gives ascending order of tree data
		tree.inorder();
	}

}
