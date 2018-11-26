package StackAndQueue;

/**
 * Class that implements a Queue.
 * Created for the Activity Number 2: "Implementacion
 * de una pila y cola dinamicas". UNIR.
 * @author Arnaldo Quintero Segura.
 *
 */
public class Queue {
	/**
	 * Variable that holds the amount of elements
	 * present in the Queue.
	 */
	private int count;
	/**
	 * Pointer to the first element (front) of the Queue.
	 */
	private Node front;
	/**
	 * Pointer to the last element (rear) of the Queue.
	 */
	private Node rear;
	
	/**
	 * Initializes a new Queue with the front and rear set to null
	 * and count set to zero.
	 */
	public Queue() {
		count = 0;
		rear = null;
		front = null;
	}

	/**
	 * @return the amount of elements present in the Queue.
	 */
	public int getCount() {
		return count;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String result = "[ ";
		boolean first = true;
		Node temp = front;
	
		if (temp == null) {
			return "Empty Queue";
		}

		do {
			if (first) {
				first = false;
			}else{
				result += ", ";	
			}
			
			result += "\"" + temp.getValue() + "\"";
			temp = temp.getNext();
		} while (temp != null);
		result += " ]";
		
		return result;
	}
	
	/**
	 * Function that prints to the StdOut the representation
	 * of the Queue
	 */
	public void print() {
		System.out.println(this.toString());
	}
	
	/**
	 * @return the first element of the Queue as an Object.
	 */
	public Object dequeue() {
		Object result = null;
		if (front != null) {
			result = front.getValue();
			front = (front.getNext());
			count = count - 1;	
		}

		return result;
	}
	
	/**
	 * Function that inserts a given Object at the rear of the Queue.
	 * @param value to insert.
	 */
	public boolean enqueue(Object value) {
		boolean resValue = true;
		try {
			Node newNode = new Node(value);
			if (rear != null) rear.setNext(newNode);
			rear = newNode;
			if (count == 0) front = rear;
			count = count + 1;
		} catch (Exception e) {
			resValue = false;
		}
		return resValue;
	}
	
	/**
	 * Function that gets the value of the element at the front of the Queue.
	 * Without taking it out of the Stack.
	 * @param element to insert.
	 */
	public Object peek() {
		Object value = null;
		if (front != null) {
			value = front.getValue();
		}
		return value;
	}
	
	/**
	 * Function that checks if a given element is present inside
	 * of the Queue.
	 * @param value to look for.
	 * @return -1 if the element is not found in the Queue, the position
	 * 			of the element otherwise.
	 */
	public int search(Object value) {
		int result = 0;
		
		Node tempNode = front;
		while (tempNode != null) {
			if (tempNode.getValue().equals(value)) {
				break;
			} else {
				tempNode = tempNode.getNext();
				result = result + 1;
			}
		}
		
		if (result >= count) result = -1;
		return result;
	}

}
