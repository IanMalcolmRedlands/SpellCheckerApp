package dictionaryapp;

public class RBNode {
	private String word;
	private RBNode parent;
	private boolean red;
	private RBNode left, right;
	
	public RBNode(String word) {
		this.word = word;
		this.parent = null;
		red = true;
		left = right = null;
	}
	
	public RBNode(String word, boolean isRed) {
		this.word = word;
		this.parent = null;
		red = isRed;
		left = right = null;
	}
	
	/**
	 * Makes the input node the current node's left child. The child node's parent pointer is set to the current node.
	 * @param child
	 */
	public void setLeftChild(RBNode child) {
		if (this != null) {
			this.left = child;
		}
		this.left.parent = this;
	}
	
	/**
	 * Makes the input node the current node's right child. The child node's parent pointer is set to the current node.
	 * @param child
	 */
	public void setRightChild(RBNode child) {
		if (this != null) {
			this.right = child;
		}
		child.right.parent = this;
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

		if (currentChild.word.equals(this.left.word)) {
			this.setLeftChild(newChild);
		}
		else if (currentChild.word.equals(this.right.word)) {
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
	
	
	public String getValue() {
		return this.word;
	}
	
	
	public boolean isRed() {
		return red;
	}
	
	public boolean isBlack() {
		return !red;
	}
	
	
	public void makeRed() {
		this.red = true;
	}
	
	public void makeBlack() {
		this.red = false;
	}
};