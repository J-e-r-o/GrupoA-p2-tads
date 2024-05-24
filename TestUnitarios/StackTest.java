import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import uy.edu.um.adt.linkedlist.MyLinkedListImpl;
import uy.edu.um.adt.stack.EmptyStackException;
import uy.edu.um.adt.stack.MyStack;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackTest {

    @Test
    @DisplayName("Test 1")
    public void test1() throws EmptyStackException {

        MyStack<String> testStack = new MyLinkedListImpl<>();

        testStack.push("1");
        testStack.push("2");
        testStack.push("3");
        testStack.pop();
        assertEquals("2",testStack.peek());
        testStack.pop();
        assertEquals("1",testStack.peek());
        testStack.pop();

        System.out.println("Passed");
    }

    @Test
    @DisplayName("Test 2")
    public void test2() {

        MyStack<String> testStack = new MyLinkedListImpl<>();

        testStack.push("1");
        assertEquals("1",testStack.peek());
        testStack.push("2");
        assertEquals("2",testStack.peek());
        testStack.push("3");
        assertEquals("3",testStack.peek());
        assertEquals(3,testStack.size());

        System.out.println("Passed");
    }


    @Test
    @DisplayName("Test 3")
    public void test3() {

        MyStack<String> testStack = new MyLinkedListImpl<>();

        testStack.push("4");
        assertEquals("4",testStack.peek());
        testStack.push("5");
        assertEquals("5",testStack.peek());
        assertEquals(2,testStack.size());

        System.out.println("Passed");
    }

    @Test
    @DisplayName("Test 4")
    public void test4() throws EmptyStackException {

        MyStack<String> testStack = new MyLinkedListImpl<>();

        testStack.push("1");
        testStack.push("2");
        testStack.push("3");
        testStack.push("4");
        testStack.push("5");

        testStack.pop();
        testStack.pop();
        testStack.pop();
        testStack.pop();
        assertEquals(1, testStack.size());
        testStack.pop();
        assertEquals(0, testStack.size());

        System.out.println("Passed");
    }

}
