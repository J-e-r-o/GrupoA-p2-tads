package TestUnitarios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uy.edu.um.adt.linkedlist.MyLinkedListImpl;
import uy.edu.um.adt.queue.EmptyQueueException;
import uy.edu.um.adt.queue.MyQueue;


class QueueTest {

    @Test
    public void Test1() {

        MyQueue<String> testQueue = new MyLinkedListImpl<>();

        testQueue.enqueue("1");
        testQueue.enqueue("2");
        testQueue.enqueue("3");

        Assertions.assertTrue(testQueue.contains("1"));
        Assertions.assertTrue(testQueue.contains("2"));
        Assertions.assertTrue(testQueue.contains("3"));
        Assertions.assertFalse(testQueue.contains("4"));

    }

    @Test
    public void Test2() throws EmptyQueueException {

        MyQueue<String> testQueue = new MyLinkedListImpl<>();


        testQueue.enqueue("1");
        testQueue.enqueue("2");
        testQueue.enqueue("3");
        testQueue.enqueue("4");

        Assertions.assertFalse(testQueue.contains("5"));

        testQueue.dequeue();
        Assertions.assertFalse(testQueue.contains("1"));

        testQueue.dequeue();
        Assertions.assertFalse(testQueue.contains("2"));

        testQueue.dequeue();
        Assertions.assertFalse(testQueue.contains("3"));

        testQueue.dequeue();
        Assertions.assertFalse(testQueue.contains("4"));
    }


    @Test
    public void Test3() throws EmptyQueueException {

        MyQueue<String> testQueue = new MyLinkedListImpl<>();

        Assertions.assertEquals(0, testQueue.size());
        testQueue.enqueue("1");
        Assertions.assertEquals(1, testQueue.size());
        testQueue.enqueue("2");
        Assertions.assertEquals(2, testQueue.size());

        testQueue.dequeue();
        testQueue.dequeue();

        Assertions.assertEquals(0, testQueue.size());

    }

}
