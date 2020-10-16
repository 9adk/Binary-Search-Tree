package com.binarysearchtree;

public class MyBinarySearchTree<K extends Comparable<K>> {
	private MyBinaryNode<K> root;

	public boolean add(K key) {
		this.root = addToTree(root, key);
		return true;
	}

	public MyBinaryNode<K> addToTree(MyBinaryNode<K> current, K key) {
		if (current == null) {
			return new MyBinaryNode<>(key);
		}
		if (key.compareTo(current.key) < 0) {
			current.leftNode = addToTree(current.leftNode, key);
		} else {
			current.rightNode = addToTree(current.rightNode, key);

		}
		return current;
	}

	public int findSize() {
		return getSize(root);
	}

	public int getSize(MyBinaryNode<K> current) {
		return (current == null) ? 0 : 1 + getSize(current.leftNode) + getSize(current.rightNode);
	}

	public boolean searchKey(K key) {
		return searchInTree(root, key);
	}

	public boolean searchInTree(MyBinaryNode<K> current, K key) {
		if (current == null) {
			return false;
		}
		if (key.compareTo(current.key) == 0) {
			return true;
		} else if (key.compareTo(current.key) < 0) {
			return searchInTree(current.leftNode, key);
		} else
			return searchInTree(current.rightNode, key);
	}
}
