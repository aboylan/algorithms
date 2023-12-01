package com.aboylan.algorithms.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyLinkedListTest {

	@Test
	public void shouldCreateEmptyLinkledList() {
		// Given
		MyLinkedList<Character> myLInkedList = new MyLinkedListImpl<>();

		// When
		int size = myLInkedList.size();

		// Then
		assertEquals(0, size);
	}

	@Test
	public void shouldAddOneElementToLinkedList() {
		// Given
		MyLinkedList<Character> myLinkedList = new MyLinkedListImpl<>();
		
		// When
		myLinkedList.addFront('A');
		
		// Then
		assertEquals(1, myLinkedList.size());
	}
}
