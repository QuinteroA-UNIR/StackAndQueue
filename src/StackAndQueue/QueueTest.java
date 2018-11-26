/**
 * 
 */
package StackAndQueue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

/**
 * Test Methods for the Queue Class.
 * @author Arnaldo Quintero Segura
 *
 */
class QueueTest {

	@Test
	void queueCreationTest() {
		System.out.println("-- Queue Creation Test:");
		Queue queue = getQueue();
		assertEquals(0, queue.getCount());
		System.out.println(queue);
		System.out.println();
	}
	
	@Test
	void getQueueCountFromEmptyQueueTest() {
		System.out.println("-- Empty Queue Get Count Test:");
		Queue queue = getQueue();
		assertEquals(0, queue.getCount());
		System.out.println(queue);
		System.out.println("Count: " + queue.getCount());
		System.out.println();
	}
	
	@Test
	void getQueueCountFromQueueWithOnlyOneElementTest() {
		System.out.println("-- Queue With One Element Get Count Test:");
		int ammountOfElements = 1;
		Queue queue = getQueue(ammountOfElements);
		assertEquals(1, queue.getCount());
		System.out.println(queue);
		System.out.println("Count: " + queue.getCount());
		System.out.println();
	}
	
	@Test
	void getQueueCountFromQueueWithSeveralElementsTest() {
		System.out.println("-- Queue With Several Elements Get Count Test:");
		int ammountOfElements = 4;
		Queue queue = getQueue(ammountOfElements);
		assertEquals(4, queue.getCount());
		System.out.println(queue);
		System.out.println("Count: " + queue.getCount());
		System.out.println();
	}
	
	
	@Test
	void enqueueElementToEmptyQueueTest() {
		System.out.println("-- Enqueue to Empty Queue Test:");
		Queue queue = getQueue();
		System.out.println("Before: " + queue);
		boolean insert = queue.enqueue(1);
		assertEquals(1, queue.getCount());
		assertEquals(insert, true);
		System.out.println("After: " + queue);
		System.out.println();
	}
	
	@Test
	void enqueueElementToQueueWithOnlyOneElementTest() {
		System.out.println("-- Enqueue to Queue With One Element Test:");
		Queue queue = getQueue(1);
		System.out.println("Before: " + queue);
		boolean insert = queue.enqueue(2);
		assertEquals(2, queue.getCount());
		assertEquals(insert, true);
		System.out.println("After: " + queue);
		System.out.println();
	}
	
	@Test
	void enqueueElementToQueueWithSeveralElementsTest() {
		System.out.println("-- Enqueue to Queue With Several Elements Test:");
		Queue queue = getQueue(3);
		System.out.println("Before: " + queue);
		boolean insert = queue.enqueue(4);
		assertEquals(4, queue.getCount());
		assertEquals(insert, true);
		System.out.println("After: " + queue);
		System.out.println();
	}
	
	@Test
	void peekElementFromEmptyQueueTest() {
		System.out.println("-- Peek from Empty Queue Test:");
		Queue queue = getQueue();
		assertEquals(null, queue.peek());
		assertEquals(0, queue.getCount());
		System.out.println("Queue: " + queue);
		System.out.println("Peek: " + queue.peek());
		System.out.println();
	}
	
	@Test
	void peekElementFromQueueWithOnlyOneItemTest() {
		System.out.println("-- Peek from Queue With One Element Test:");
		Queue queue = getQueue(1);
		assertEquals(1, queue.peek());
		assertEquals(1, queue.getCount());
		System.out.println("Queue: " + queue);
		System.out.println("Peek: " + queue.peek());
		System.out.println();
	}
	
	@Test
	void peekElementFromQueueWithSeveralItemsTest() {
		System.out.println("-- Peek from Queue With Several Elements Test:");
		Queue queue = getQueue(3);
		assertEquals(3, queue.peek());
		assertEquals(3, queue.getCount());
		System.out.println("Queue: " + queue);
		System.out.println("Peek: " + queue.peek());
		System.out.println();
	}
	
	@Test
	void dequeueElementFromEmptyQueueTest() {
		System.out.println("-- Dequeue from Empty Queue Test:");
		Queue queue = getQueue();
		System.out.println("Before: " + queue);
		Object val = queue.dequeue();
		assertEquals(0, queue.getCount());
		assertEquals(val, null);
		System.out.println("After: " + queue);
		System.out.println();
	}
	
	@Test
	void dequeueElementFromQueueWithOnlyOneElementTest() {
		System.out.println("-- Dequeue from Queue With One Element Test:");
		Queue queue = getQueue(1);
		System.out.println("Before: " + queue);
		Object val = queue.dequeue();
		assertEquals(0, queue.getCount());
		assertEquals(val, 1);
		System.out.println("After: " + queue);
		System.out.println();
	}
	
	@Test
	void dequeueElementFromQueueWithSeveralElementsTest() {
		System.out.println("-- Dequeue from Queue With Several Elements Test");
		Queue queue = getQueue(3);
		System.out.println("Before: " + queue);
		Object val = queue.dequeue();
		assertEquals(2, queue.getCount());
		assertEquals(val, 3);
		System.out.println("After: " + queue);
		System.out.println();
	}
	
	@Test
	void searchNonExistingElementOnEmptyQueueTest() {
		System.out.println("-- Search Non Existing Element On Empty Queue Test:");
		Queue queue = getQueue();
		Object position = queue.search("false");
		assertEquals(0, queue.getCount());
		assertEquals(position, -1);
		System.out.println("Queue: " + queue);
		System.out.println("Search: \"false\"; Position: " + position);
		System.out.println();
	}
	
	@Test
	void searchNonExistingElementOnQueueWithOnlyOneItemTest() {
		System.out.println("-- Search Non Existing Element On Queue With One Item Test:");
		Queue queue = getQueue(1);
		Object position = queue.search("false");
		assertEquals(1, queue.getCount());
		assertEquals(position, -1);
		System.out.println("Queue: " + queue);
		System.out.println("Search: \"false\"; Position: " + position);
		System.out.println();
	}
	
	@Test
	void searchNonExistingElementOnQueueWithSeveralItemsTest() {
		System.out.println("-- Search Non Existing Element On Queue With Several Items Test:");
		Queue queue = getQueue(4);
		Object position = queue.search("false");
		assertEquals(4, queue.getCount());
		assertEquals(position, -1);
		System.out.println("Queue: " + queue);
		System.out.println("Search: \"false\"; Position: " + position);
		System.out.println();
	}
	
	@Test
	void searchExistingElementOnQueueWithOnlyOneItemTest() {
		System.out.println("-- Search Existing Element On Queue With One Item Test:");
		Queue queue = getQueue(1);
		Object position = queue.search(1);
		assertEquals(1, queue.getCount());
		assertEquals(position, 0);
		System.out.println("Queue: " + queue);
		System.out.println("Search: 1; Position: " + position);
		System.out.println();
	}
	
	@Test
	void searchExistingElementOnQueueWithSeveralItemsTest() {
		System.out.println("-- Search Existing Element On Queue With Several Items Test:");
		Queue queue = getQueue(5);
		Object position = queue.search(1);
		assertEquals(5, queue.getCount());
		assertEquals(position, 4);
		System.out.println("Queue: " + queue);
		System.out.println("Search: 1, Position: " + position);
		System.out.println();
	}
	
	@Test
	void printEmptyQueueTest() {
		PrintStream stdOut = System.out;
		System.out.println("-- Print Empty Queue Test:");
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Queue queue = getQueue();
		queue.print();
		assertEquals("Empty Queue\n", outContent.toString());
		System.setOut(stdOut);
		System.out.println(queue);
		System.out.println();
	}
	
	@Test
	void printQueueWithOnlyOneElementTest() {
		PrintStream stdOut = System.out;
		System.out.println("-- Print Queue With One Element Test:");
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Queue queue = getQueue(1);
		queue.print();
		assertEquals("[ \"1\" ]\n", outContent.toString());
		System.setOut(stdOut);
		System.out.println(queue);
		System.out.println();
	}
	
	@Test
	void printQueueWithSeveralElementsTest() {
		PrintStream stdOut = System.out;
		System.out.println("-- Print Queue With Several Elements Test:");
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Queue queue = getQueue(3);
		queue.print();
		assertEquals("[ \"3\", \"2\", \"1\" ]\n", outContent.toString());
		System.setOut(stdOut);
		System.out.println(queue);
		System.out.println();
	}
	
	private Queue getQueue() {
		return new Queue();
	}
	
	private Queue getQueue(int ammountOfElements) {
		Queue q = this.getQueue();
		for (int i = ammountOfElements; i > 0; i--) {
			q.enqueue(i);
		}
		return q;
	}

}
