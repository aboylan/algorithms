package com.aboylan.algorithms.linkedlist;

public class MyLinkedListImpl<E> implements MyLinkedList<E> {

	private int size;
	private Node<E> head;

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addFront(E value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addBack(E value) {
		// TODO Auto-generated method stub

	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E getFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E getLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeFirst() {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeLast() {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeValue(E value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	private static class Node<E> {
		private E value;
		private Node<E> next;

		public Node(E value) {
			this.value = value;
		}
	}

}
