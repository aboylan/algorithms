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
		Node<E> node = new Node<E>(value);

		if (this.head == null) {
			this.head = node;
			this.size++;
			return;
		}

		Node<E> currentNode = head;

		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = node;
		this.size++;
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E getFirst() {
		return (E) this.head.value;
	}

	@Override
	public E getLast() {

		Node<E> currentNode = this.head;

		while (currentNode.next != null) {
			currentNode = currentNode.next;
			if (currentNode.next == null) {
				return (E) currentNode.value;
			}
		}

		return null;
	}

	@Override
	public void removeFirst() {

		if (this.size == 0) {
			return;
		}

		Node<E> currentHead = this.head;
		this.head = this.head.next;
		currentHead.value = null;
		currentHead.next = null;
		this.size--;
	}

	@Override
	public void removeLast() {

		if (this.size == 0) {
			return;
		}

		Node<E> currentNode = this.head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
			if (currentNode.next.next == null) {
				currentNode.next.value = null;
				currentNode.next = null;
				this.size--;
				return;
			}
		}
	}

	@Override
	public void removeValue(E value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clear() {
		while (this.size != 0) {
			this.removeFirst();
		}
	}

	private static class Node<E> {
		private E value;
		private Node<E> next;

		public Node(E value) {
			this.value = value;
		}
	}

}
