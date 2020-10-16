package com.binarysearchtree;

public class MyBinaryNode<K extends Comparable<K>> implements INode<K> {
	K key;
	MyBinaryNode<K> leftNode;
	MyBinaryNode<K> rightNode;

	public MyBinaryNode(K key) {
		this.key = key;
		this.leftNode = null;
		this.rightNode = null;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public K getKey() {
		return key;
	}

}
