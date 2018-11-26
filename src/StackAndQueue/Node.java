package StackAndQueue;

/**
 * Class that implements the Node for a Stack or Queue,
 * for elements of type String.
 * @author Arnaldo Quintero Segura.
 *
 */
public class Node {

	/**
	 * Pointer to the next element of the DoublyLinkedList.
	 */
	private Node next;
	/**
	 * Variable that holds the value of the element in this given Node.
	 */
	private Object value;
	
	/**
	 * Initializes a new Node, with the given value and the pointers next
	 * and previous set to null.
	 * @param value to be used in the Node.
	 */
	public Node(Object value) {
		this.setValue(value);
	}
	
	/**
	 * @return the pointer to the next element on the DoublyLinkedList.
	 */
	public Node getNext() {
		return next;
	}
	
	/**
	 * @return the value of the string stored in this Node.
	 */
	public Object getValue() {
		return value;
	}
	
	/**
	 * Sets the next Node of this Node, to a given Node.
	 * @param next Node to be set.
	 */
	public void setNext(Node next) {
		this.next = next;
	}

	/**
	 * Sets the value of the Node to a given string.
	 * @param value to be set.
	 */
	public void setValue(Object value) {
		this.value = value;
	}

}
