package com.aboylan.algorithms.linkedlist;

public class MyLinkedListImpl<E> implements MyLinkedList<E> {

	private int size;
	private Node<E> head;

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public void addFront(E value) {
		Node<E> node = new Node<E>(value);

		if (this.head == null) {
			this.head = node;
			this.size++;
			return;
		}

		node.next = this.head;

		this.head = node;
		this.size++;
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
