package StackAndQueue;

/**
 * Class that implements a Stack.
 * Created for the Activity Number 2: "Implementacion
 * de una pila y cola dinamicas". UNIR.
 * @author Arnaldo Quintero Segura.
 *
 */
public class Stack {
	/**
	 * Variable that holds the amount of elements
	 * present in the Queue.
	 */
	private int count;
	/**
	 * Pointer to the first element (top) of the Stack.
	 */
	private Node top;

	/**
	 * Initializes a new Stack with the top set to null
	 * and count set to zero.
	 */
	public Stack() {
		count = 0;
		top = null;
	}

	/**
	 * @return the amount of elements present in the Stack.
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
		Node temp = top;
	
		if (temp == null) {
			return "Empty Stack";
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
	 * of the Stack
	 */
	public void print() {
		System.out.println(this.toString());
	}

	/**
	 * @return the first element of the Queue as an Object.
	 */
	public Object pop() {
		Object result = null;
		if (top != null) {
			result = top.getValue();
			top = top.getNext();
			count = count - 1;
		}
		
		return result;
	}
	
	/**
	 * Function that inserts a given Object at the top of the Stack.
	 * @param value to insert.
	 */
	public boolean push(Object value) {
		boolean resValue = true;
		try {
			Node newNode = new Node(value);
			newNode.setNext(top);
			top = newNode;
			count = count + 1;
		} catch (Exception e) {
			resValue = false;
		}
		return resValue;
	}
	
	/**
	 * Function that gets the value of the element at the top of the Stack.
	 * Without taking it out of the Stack.
	 * @param element to insert.
	 */
	public Object peek() {
		Object value = null;
		if (top != null) {
			value = top.getValue();
		}
		return value;
	}
	
	/**
	 * Function that checks if a given element is present inside
	 * of the Stack.
	 * @param value to look for.
	 * @return -1 if the element is not found in the Stack, the position
	 * 			of the element otherwise.
	 */
	public int search(Object value) {
		int result = 0;
		
		Node tempNode = top;
		while (tempNode != null) {
			if (tempNode.getValue().equals(value)) {
				break;
			}else {
				tempNode = tempNode.getNext();
				result = result + 1;
			}
		}
		
		if (result >= count) result = -1;
		return result;
	}

}
