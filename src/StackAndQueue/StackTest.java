package StackAndQueue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

/**
 * Test Methods for the Stack Class.
 * @author Arnaldo Quintero Segura
 *
 */
class StackTest {

	@Test
	void stackCreationTest() {
		System.out.println("-- Stack Creation Test:");
		Stack stack = getStack();
		assertEquals(0, stack.getCount());
		System.out.println(stack);
		System.out.println();
	}
	
	@Test
	void getStackCountFromEmptyStackTest() {
		System.out.println("-- Empty Stack Get Count Test:");
		Stack stack = getStack();
		assertEquals(0, stack.getCount());
		System.out.println(stack);
		System.out.println("Count: " + stack.getCount());
		System.out.println();
	}
	
	@Test
	void getStackCountFromStackWithOnlyOneElementTest() {
		System.out.println("-- Stack With One Element Get Count Test:");
		int ammountOfElements = 1;
		Stack stack = getStack(ammountOfElements);
		assertEquals(1, stack.getCount());
		System.out.println(stack);
		System.out.println("Count: " + stack.getCount());
		System.out.println();
	}
	
	@Test
	void getStackCountFromStackWithSeveralElementsTest() {
		System.out.println("-- Stack With Several Elements Get Count Test:");
		int ammountOfElements = 4;
		Stack stack = getStack(ammountOfElements);
		assertEquals(4, stack.getCount());
		System.out.println(stack);
		System.out.println("Count: " + stack.getCount());
		System.out.println();
	}
	
	
	@Test
	void pushElementToEmptyStackTest() {
		System.out.println("-- Push to Empty Stack Test:");
		Stack stack = getStack();
		System.out.println("Before: " + stack);
		boolean insert = stack.push(1);
		assertEquals(1, stack.getCount());
		assertEquals(insert, true);
		System.out.println("After: " + stack);
		System.out.println();
	}
	
	@Test
	void pushElementToStackWithOnlyOneElementTest() {
		System.out.println("-- Push to Stack With One Element Test:");
		Stack stack = getStack(1);
		System.out.println("Before: " + stack);
		boolean insert = stack.push(2);
		assertEquals(2, stack.getCount());
		assertEquals(insert, true);
		System.out.println("After: " + stack);
		System.out.println();
	}
	
	@Test
	void pushElementToStackWithSeveralElementsTest() {
		System.out.println("-- Push to Stack With Several Elements Test:");
		Stack stack = getStack(3);
		System.out.println("Before: " + stack);
		boolean insert = stack.push(4);
		assertEquals(4, stack.getCount());
		assertEquals(insert, true);
		System.out.println("After: " + stack);
		System.out.println();
	}
	
	@Test
	void peekElementFromEmptyStackTest() {
		System.out.println("-- Peek from Empty Stack Test:");
		Stack stack = getStack();
		assertEquals(null, stack.peek());
		assertEquals(0, stack.getCount());
		System.out.println("Stack: " + stack);
		System.out.println("Peek: " + stack.peek());
		System.out.println();
	}
	
	@Test
	void peekElementFromStackWithOnlyOneItemTest() {
		System.out.println("-- Peek from Stack With One Element Test:");
		Stack stack = getStack(1);
		assertEquals(1, stack.peek());
		assertEquals(1, stack.getCount());
		System.out.println("Stack: " + stack);
		System.out.println("Peek: " + stack.peek());
		System.out.println();
	}
	
	@Test
	void peekElementFromStackWithSeveralItemsTest() {
		System.out.println("-- Peek from Stack With Several Elements Test:");
		Stack stack = getStack(3);
		assertEquals(1, stack.peek());
		assertEquals(3, stack.getCount());
		System.out.println("Stack: " + stack);
		System.out.println("Peek: " + stack.peek());
		System.out.println();
	}
	
	@Test
	void popElementFromEmptyStackTest() {
		System.out.println("-- Pop from Empty Stack Test:");
		Stack stack = getStack();
		System.out.println("Before: " + stack);
		Object val = stack.pop();
		assertEquals(0, stack.getCount());
		assertEquals(val, null);
		System.out.println("After: " + stack);
		System.out.println();
	}
	
	@Test
	void popElementFromStackWithOnlyOneElementTest() {
		System.out.println("-- Pop from Stack With One Element Test:");
		Stack stack = getStack(1);
		System.out.println("Before: " + stack);
		Object val = stack.pop();
		assertEquals(0, stack.getCount());
		assertEquals(val, 1);
		System.out.println("After: " + stack);
		System.out.println();
	}
	
	@Test
	void popElementFromStackWithSeveralElementsTest() {
		System.out.println("-- Pop from Stack With Several Elements Test");
		Stack stack = getStack(3);
		System.out.println("Before: " + stack);
		Object val = stack.pop();
		assertEquals(2, stack.getCount());
		assertEquals(val, 1);
		System.out.println("After: " + stack);
		System.out.println();
	}
	
	@Test
	void searchNonExistingElementOnEmptyStackTest() {
		System.out.println("-- Search Non Existing Element On Empty Stack Test:");
		Stack stack = getStack();
		Object position = stack.search("false");
		assertEquals(0, stack.getCount());
		assertEquals(position, -1);
		System.out.println("Stack: " + stack);
		System.out.println("Search: \"false\"; Position: " + position);
		System.out.println();
	}
	
	@Test
	void searchNonExistingElementOnStackWithOnlyOneItemTest() {
		System.out.println("-- Search Non Existing Element On Stack With One Item Test:");
		Stack stack = getStack(1);
		Object position = stack.search("false");
		assertEquals(1, stack.getCount());
		assertEquals(position, -1);
		System.out.println("Stack: " + stack);
		System.out.println("Search: \"false\"; Position: " + position);
		System.out.println();
	}
	
	@Test
	void searchNonExistingElementOnStackWithSeveralItemsTest() {
		System.out.println("-- Search Non Existing Element On Stack With Several Items Test:");
		Stack stack = getStack(4);
		Object position = stack.search("false");
		assertEquals(4, stack.getCount());
		assertEquals(position, -1);
		System.out.println("Stack: " + stack);
		System.out.println("Search: \"false\"; Position: " + position);
		System.out.println();
	}
	
	@Test
	void searchExistingElementOnStackWithOnlyOneItemTest() {
		System.out.println("-- Search Existing Element On Stack With One Item Test:");
		Stack stack = getStack(1);
		Object position = stack.search(1);
		assertEquals(1, stack.getCount());
		assertEquals(position, 0);
		System.out.println("Stack: " + stack);
		System.out.println("Search: 1; Position: " + position);
		System.out.println();
	}
	
	@Test
	void searchExistingElementOnStackWithSeveralItemsTest() {
		System.out.println("-- Search Existing Element On Stack With Several Items Test:");
		Stack stack = getStack(5);
		Object position = stack.search(1);
		assertEquals(5, stack.getCount());
		assertEquals(position, 0);
		System.out.println("Stack: " + stack);
		System.out.println("Search: 1, Position: " + position);
		System.out.println();
	}
	
	@Test
	void printEmptyStackTest() {
		PrintStream stdOut = System.out;
		System.out.println("-- Print Empty Stack Test:");
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Stack stack = getStack();
		stack.print();
		assertEquals("Empty Stack\n", outContent.toString());
		System.setOut(stdOut);
		System.out.println(stack);
		System.out.println();
	}
	
	@Test
	void printStackWithOnlyOneElementTest() {
		PrintStream stdOut = System.out;
		System.out.println("-- Print Stack With One Element Test:");
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Stack stack = getStack(1);
		stack.print();
		assertEquals("[ \"1\" ]\n", outContent.toString());
		System.setOut(stdOut);
		System.out.println(stack);
		System.out.println();
	}
	
	@Test
	void printStackWithSeveralElementsTest() {
		PrintStream stdOut = System.out;
		System.out.println("-- Print Stack With Several Elements Test:");
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Stack stack = getStack(3);
		stack.print();
		assertEquals("[ \"1\", \"2\", \"3\" ]\n", outContent.toString());
		System.setOut(stdOut);
		System.out.println(stack);
		System.out.println();
	}
	
	private Stack getStack() {
		return new Stack();
	}
	
	private Stack getStack(int ammountOfElements) {
		Stack q = this.getStack();
		for (int i = ammountOfElements; i > 0; i--) {
			q.push(i);
		}
		return q;
	}

}