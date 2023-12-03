package com.aboylan.algorithms.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

	@Test
	public void shouldAddElementToLinkedListAsHeadWhenIsNoElements() {
		// Given
		MyLinkedList<Character> myLinkedList = new MyLinkedListImpl<>();

		// When
		char a = 'A';
		myLinkedList.addFront(a);

		// Then
		assertTrue(a == myLinkedList.get(0));
		assertEquals(1, myLinkedList.size());
	}

	@Test
	public void shouldAddElementToLInedListAsHead() {
		// Given
		MyLinkedList<Character> myLinkedList = new MyLinkedListImpl<>();
		myLinkedList.addFront('A');
		myLinkedList.addFront('B');

		// When
		char c = 'C';
		myLinkedList.addFront(c);

		// Then
		assertTrue(c == myLinkedList.get(0));
		assertEquals(3, myLinkedList.size());
	}

	@Test
	public void shouldAddElementToLinkedListAsHeadCallingAddBackWhenIsNoElements() {
		// Given
		MyLinkedList<Character> myLinkedList = new MyLinkedListImpl<>();

		// When
		char a = 'A';
		myLinkedList.addBack(a);

		// Then
		assertTrue(a == myLinkedList.get(0));
		assertEquals(1, myLinkedList.size());
	}

	@Test
	public void shouldAddElementToLinkedListAsTailCallingAddBack() {
		// Given
		MyLinkedList<Character> myLinkedList = new MyLinkedListImpl<>();
		char c = 'C';
		myLinkedList.addFront('B');
		myLinkedList.addFront('A');

		// When
		myLinkedList.addBack(c);

		// Then
		assertTrue(c == myLinkedList.get(2));
		assertEquals(3, myLinkedList.size());
	}

	@Test
	public void shouldRemoveFirstElementFromLinkedList() {
		// Given
		MyLinkedList<Character> myLinkedList = new MyLinkedListImpl<>();
		myLinkedList.addBack('A');
		myLinkedList.addBack('B');
		myLinkedList.addBack('C');

		// When
		myLinkedList.removeFirst();

		// Then
		assertTrue('B' == myLinkedList.get(0));
		assertEquals(2, myLinkedList.size());
	}

	@Test
	public void shouldDoNothingWhenRemoveFirstFromLinkedListCalledOnEmptyList() {
		// Given
		MyLinkedList<Character> myLinkedList = new MyLinkedListImpl<>();

		// When
		myLinkedList.removeFirst();

		// Then
		assertEquals(0, myLinkedList.size());
	}

	@Test
	public void shouldRemoveFirstElementFromLinkedListWithOnlyOneElement() {
		// Given
		MyLinkedList<Character> myLinkedList = new MyLinkedListImpl<>();
		myLinkedList.addFront('A');

		// When
		myLinkedList.removeFirst();

		// Then
		assertEquals(0, myLinkedList.size());
	}

	@Test
	public void shouldRemoveLastElementFromLinkedList() {
		// Given
		MyLinkedList<Character> myLinkedList = new MyLinkedListImpl<>();
		myLinkedList.addBack('A');
		myLinkedList.addBack('B');
		myLinkedList.addBack('C');

		// When
		myLinkedList.removeLast();

		// Then
		assertTrue('A' == myLinkedList.get(0));
		assertTrue('B' == myLinkedList.get(1));
		assertEquals(2, myLinkedList.size());
	}

	@Test
	public void shouldDoNothingWhenRemoveLastFromLinkedListCalledOnEmptyList() {
		// Given
		MyLinkedList<Character> myLinkedList = new MyLinkedListImpl<>();

		// When
		myLinkedList.removeLast();

		// Then
		assertEquals(0, myLinkedList.size());
	}

	@Test
	public void sholdRemoveWhenOneElement() {
		// Given
		MyLinkedList<Character> myLinkedList = new MyLinkedListImpl<>();
		myLinkedList.addBack('A');

		// When
		myLinkedList.removeLast();

		// Then
		assertEquals(0, myLinkedList.size());
	}

	@Test
	public void sholdRemoveWhenTwoElements() {
		// Given
		MyLinkedList<Character> myLinkedList = new MyLinkedListImpl<>();
		myLinkedList.addBack('A');
		myLinkedList.addBack('B');

		// When
		myLinkedList.removeLast();

		// Then
		assertEquals(1, myLinkedList.size());
	}

	@Test
	public void shouldDoNothingWhenClearCalledOnEmptyLinkedList() {
		// Given
		MyLinkedList<Character> myLinkedList = new MyLinkedListImpl<>();

		// When
		myLinkedList.clear();

		// Then
		assertEquals(0, myLinkedList.size());
	}

	@Test
	public void shouldClearLinkedList() {
		// Given
		MyLinkedList<Character> myLinkedList = new MyLinkedListImpl<>();
		myLinkedList.addBack('A');
		myLinkedList.addBack('B');
		myLinkedList.addBack('C');

		// When
		myLinkedList.clear();

		// Then
		assertEquals(0, myLinkedList.size());
	}

	@Test
	public void shouldGetFirstElementFromLinked() {
		// Given
		MyLinkedList<Character> myLinkedList = new MyLinkedListImpl<>();
		myLinkedList.addFront('B');
		Character firstElement = 'A';
		myLinkedList.addFront(firstElement);

		// When
		Character first = myLinkedList.getFirst();

		// Then
		assertTrue(firstElement.equals(first));
	}

	@Test
	public void shouldGetLastElementFromLinked() {
		// Given
		MyLinkedList<Character> myLinkedList = new MyLinkedListImpl<>();
		Character lastElement = 'B';
		myLinkedList.addFront(lastElement);
		myLinkedList.addFront('A');

		// When
		Character last = myLinkedList.getLast();

		// Then
		assertTrue(lastElement.equals(last));
	}

	@Test
	public void shouldGetLastElementFromLinkedWithOneElement() {
		// Given
		MyLinkedList<Character> myLinkedList = new MyLinkedListImpl<>();
		myLinkedList.addFront('A');

		// When
		Character last = myLinkedList.getLast();

		// Then
		assertTrue(last.equals('A'));
		assertEquals(1, myLinkedList.size());
	}

	@Test
	public void shouldGetLastElementFromLinkedWithThreeElements() {
		// Given
		MyLinkedList<Character> myLinkedList = new MyLinkedListImpl<>();
		myLinkedList.addFront('A');
		myLinkedList.addFront('B');
		myLinkedList.addFront('C');

		// When
		Character last = myLinkedList.getLast();

		// Then
		assertTrue(last.equals('A'));
		assertEquals(3, myLinkedList.size());
	}

	@Test
	public void shouldGetNullLastElementFromEmptyLinkedList() {
		// Given
		MyLinkedList<Character> myLinkedList = new MyLinkedListImpl<>();

		// When
		Character last = myLinkedList.getLast();

		// Then
		assertNull(last);
		assertEquals(0, myLinkedList.size());
	}

	@Test
	public void shouldReturnNullWhenGetMethodCalledOnEmptyLinkedList() {
		// Given
		MyLinkedList<Character> myLinkedList = new MyLinkedListImpl<>();

		// When
		Character character = myLinkedList.get(0);

		// Then
		assertNull(character);
	}

	@Test
	public void shouldReturnNullWhenGetMethodCalledWithIndexLargerThenLastOneLinkedList() {
		// Given
		MyLinkedList<Character> myLinkedList = new MyLinkedListImpl<>();
		myLinkedList.addBack('A');
		myLinkedList.addBack('B');
		myLinkedList.addBack('C');

		// When
		Character character = myLinkedList.get(myLinkedList.size());

		// Then
		assertNull(character);
	}

	@Test
	public void shouldReturnTailWhenGetMethodCalledWithLastIndex() {
		// Given
		MyLinkedList<Character> myLinkedList = new MyLinkedListImpl<>();
		myLinkedList.addBack('A');
		myLinkedList.addBack('B');
		myLinkedList.addBack('C');

		// When
		Character character = myLinkedList.get(myLinkedList.size() - 1);

		// Then
		assertTrue(character.equals('C'));
	}

	@Test
	public void shouldReturnHeadWhenGetMethodCalledWithZeroIndex() {
		// Given
		MyLinkedList<Character> myLinkedList = new MyLinkedListImpl<>();
		myLinkedList.addBack('A');
		myLinkedList.addBack('B');

		// When
		Character character = myLinkedList.get(0);

		// Then
		assertTrue(character.equals('A'));
	}

	@Test
	public void shouldReturnNullWhenIndexIsNegativeAndLinkedListIsNotEmpty() {
		// Given
		MyLinkedList<Character> myLinkedList = new MyLinkedListImpl<>();
		myLinkedList.addBack('A');

		// When
		Character character = myLinkedList.get(-1);

		// Then
		assertNull(character);
	}

	@Test
	public void shouldRemoveValueFromHeadOfLinkedList() {
		// given
		MyLinkedList<Character> myLinkedList = new MyLinkedListImpl<>();
		myLinkedList.addBack('A');
		myLinkedList.addBack('B');

		// When
		myLinkedList.removeValue('A');

		// Then
		assertTrue(myLinkedList.get(0).equals('B'));
		assertEquals(1, myLinkedList.size());
	}

	@Test
	public void shouldRemoveValueFromLinkedList() {
		// Given
		MyLinkedList<Character> myLinkedList = new MyLinkedListImpl<>();
		myLinkedList.addBack('A');
		myLinkedList.addBack('B');
		myLinkedList.addBack('C');
		myLinkedList.addBack('D');
		myLinkedList.addBack('E');
		myLinkedList.addBack('F');

		// When
		myLinkedList.removeValue('E');

		// Then
		assertTrue(myLinkedList.get(0).equals('A'));
		assertTrue(myLinkedList.get(4).equals('F'));
		assertEquals(5, myLinkedList.size());
	}

	@Test
	public void shouldDoNothingWhenRemoveValueCalledOnEmptyLinkedList() {
		// given
		MyLinkedList<Character> myLinkedList = new MyLinkedListImpl<>();

		// When
		myLinkedList.removeValue('A');

		// Then
		assertEquals(0, myLinkedList.size());
	}

}
