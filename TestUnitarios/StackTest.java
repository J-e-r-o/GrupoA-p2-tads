package TestUnitarios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uy.edu.um.adt.linkedlist.MyLinkedListImpl;
import uy.edu.um.adt.stack.EmptyStackException;
import uy.edu.um.adt.stack.MyStack;


public class StackTest {

    @Test
    public void Test1() throws EmptyStackException {

        MyStack<String> testStack = new MyLinkedListImpl<>();

        testStack.push("1");
        testStack.push("2");
        testStack.push("3");
        Assertions.assertEquals("3",testStack.peek());
        testStack.pop();
        Assertions.assertEquals("2",testStack.peek());
        testStack.pop();
        Assertions.assertEquals("1",testStack.peek());
        testStack.pop();
    }

    @Test
    public void Test2() throws EmptyStackException {

        MyStack<String> testStack = new MyLinkedListImpl<>();


        testStack.push("1");
        testStack.push("2");
        testStack.push("3");
        testStack.push("4");

        Assertions.assertNotEquals("1",testStack.peek());

        testStack.pop();
        Assertions.assertNotEquals("1",testStack.peek());

        testStack.pop();
        Assertions.assertNotEquals("1",testStack.peek());

        testStack.pop();
        Assertions.assertEquals("1",testStack.peek());
    }


    @Test
    public void Test3() throws EmptyStackException {

        MyStack<String> testStack = new MyLinkedListImpl<>();

        Assertions.assertEquals(0, testStack.size());
        testStack.push("1");
        Assertions.assertEquals(1, testStack.size());
        testStack.push("2");
        Assertions.assertEquals(2, testStack.size());

        testStack.pop();
        testStack.pop();

        Assertions.assertEquals(0, testStack.size());

    }

}