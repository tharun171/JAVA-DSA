package com.learn.DSA.TreeDSA;

class Node
{
	int data;
	Node leftNode;
	Node rightNode;
	
	//Constructor
	public Node(int data)
	{
		this.data = data;
	}
}

public class BinaryTreeImpl {
	
	//creating root node
	//this doesnt have any parent node
	//this is the parent of all nodes
	Node rootNode;
	
	public void insert(int data)
	{
		rootNode = insertRecursion(rootNode, data);
	}
	
	public Node insertRecursion(Node root,int data)
	{
		if(root == null)
			root = new Node(data);
		//if newData < root data, add to left
		else if(data < root.data)
			//compares with left roots(child roots) and adds data
			root.leftNode = insertRecursion(root.leftNode, data);
		//if newData > root data, add to Right
		else if(data > root.data)
			root.rightNode = insertRecursion(root.rightNode, data);
		return root;
	}
	
	
	//printing tree
	public void inorder()
	{
		inorderRecursion(rootNode);
	}
	
	
	public void inorderRecursion(Node root)
	{
		if(root != null)
		{
			inorderRecursion(root.leftNode);
			System.out.print(root.data+" ");
			inorderRecursion(root.rightNode);
		}
	}

}
