package com.binarysearchtree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinarySearchTreeTest {

	/**
	 * Usecase1
	 */
	@Test
	void givenData_WhenAddedToTree_ShouldPassResult() {
		MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();
		bst.add(10);
		int result = bst.findSize();
		assertEquals(1, result);
	}

	/**
	 * Adding the data from the usecase1
	 */
	@Test
	void givenNewData_WhenAddedToTree_ShouldPassResult() {
		MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();
		bst.add(56);
		bst.add(30);
		bst.add(70);
		int result = bst.findSize();
		assertEquals(3, result);
	}

	/**
	 * Creating binary search tree and checking it's size
	 */
	@Test
	void givenNodes_WhenAddedToTree_ShouldReturnSize() {
		MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();
		bst.add(56);
		bst.add(30);
		bst.add(70);
		bst.add(22);
		bst.add(40);
		bst.add(11);
		bst.add(3);
		bst.add(16);
		bst.add(60);
		bst.add(95);
		bst.add(65);
		bst.add(63);
		bst.add(67);
		assertEquals(13, bst.findSize());
	}
}
