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
}
