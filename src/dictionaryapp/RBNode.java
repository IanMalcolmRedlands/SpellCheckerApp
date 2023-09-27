package dictionaryapp;

import org.w3c.dom.Node;

public class RBNode {
	private String word;
	private RBNode parent;
	private boolean red;
	private RBNode left, right;
	
	public RBNode(String word) {
		this.word = word.toLowerCase();
		this.parent = null;
		red = true;
		left = right = null;
	}
	
	public RBNode(String word, boolean isRed) {
		this.word = word.toLowerCase();
		this.parent = null;
		red = isRed;
		left = right = null;
	}
	
	/**
	 * Makes the input node the current node's left child. The child node's parent pointer is set to the current node.
	 * @param child
	 */
	public void setLeftChild(RBNode child) {
		assert this != null : "setLeftChild() this is null";
		
		this.left = child;
		if (this.left != null)
			this.left.parent = this;
	}
	
	/**
	 * Makes the input node the current node's right child. The child node's parent pointer is set to the current node.
	 * @param child
	 */
	public void setRightChild(RBNode child) {
		assert this!=null : "setRightChild() this is null";
		
		this.right = child;
		if (this.right != null)
			this.right.parent = this;
	}
	
	/**
	 * Replaces currentChild with newChild.
	 * @param currentChild
	 * @param newChild
	 */
	public void switchChild(RBNode currentChild, RBNode newChild) {
		if (this == null) {
			return;
		}
		
		assert currentChild.word.equals(this.left.word) || currentChild.word.equals(this.right.word) : 
			"currentChild parameter does not match either actual child.";

		if (currentChild.equals(this.left)) {
			this.setLeftChild(newChild);
		}
		else if (currentChild.equals(this.right)) {
			this.setRightChild(newChild);
		}
		
		currentChild.parent = null;
	}
	
	
	public RBNode getLeftChild() {
		return left;
	}

	public RBNode getRightChild() {
		return right;
	}
	
	
	public RBNode getParent() {
		return parent;
	}
	
	public void setParentToNull() {
		parent = null;
	}
	
	public String getWord() {
		return word;
	}
	
	
	public static boolean isRed(RBNode node) {
		if (node==null)
			return false;
		
		return node.red;
	}
	
	public static boolean isBlack(RBNode node) {
		if (node == null)
			return true;
		
		return !node.red;
	}
	
	
	public static void makeRed(RBNode node) {
		if (node == null)
			return;
		
		node.red = true;
	}
	
	public static void makeBlack(RBNode node) {
		if (node == null)
			return;
		
		node.red = false;
	}
	
	public void switchColor() {
		red = !red;
	}
	
	
	public boolean equals(RBNode node) {
		if (node==null)
			return false;
		
		return word.equals(node.word);
	}
};