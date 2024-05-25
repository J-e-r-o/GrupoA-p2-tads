package TestUnitarios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uy.edu.um.adt.circularlinkedlist.MyCircularLinkedList;
import uy.edu.um.adt.linkedlist.MyLinkedListImpl;

public class CircularLinkedListTest {

    @Test
    void Test1(){
        MyCircularLinkedList<Integer> circularList = new MyLinkedListImpl<>();

        circularList.add(8);
        circularList.add(10);
        circularList.add(15);
        circularList.add(3);
        circularList.add(1);
        circularList.add(18);

        Assertions.assertFalse(circularList.contains(12));
        Assertions.assertFalse(circularList.contains(20));
        Assertions.assertFalse(circularList.contains(5));

        Assertions.assertTrue(circularList.contains(8));
        Assertions.assertTrue(circularList.contains(10));
        Assertions.assertTrue(circularList.contains(15));

    }
    @Test
    void LinkedListContainsTest() {
        MyCircularLinkedList<Integer> circularList = new MyLinkedListImpl<>();

        Assertions.assertEquals(0, circularList.size());

        circularList.add(1);
        circularList.add(2);

        Assertions.assertEquals(2, circularList.size());
        circularList.remove(2);
        Assertions.assertEquals(1, circularList.size());
        circularList.remove(1);
        Assertions.assertEquals(0, circularList.size());

    }

    @Test
    void Test3(){
        MyCircularLinkedList<Integer> circularList = new MyLinkedListImpl<>();

        circularList.add(2);
        circularList.add(10);
        circularList.add(15);
        circularList.add(3);
        circularList.add(1);
        circularList.add(18);

        circularList.remove(18);
        Assertions.assertFalse(circularList.contains(18));
        circularList.remove(10);
        Assertions.assertFalse(circularList.contains(10));
        circularList.remove(2);
        Assertions.assertFalse(circularList.contains(2));
        circularList.remove(3);
        Assertions.assertFalse(circularList.contains(3));
        circularList.remove(1);
        Assertions.assertFalse(circularList.contains(1));
        circularList.remove(15);
        Assertions.assertFalse(circularList.contains(15));

    }

    @Test
    void Test4(){
        MyCircularLinkedList<Integer> circularList = new MyLinkedListImpl<>();

        circularList.add(8);
        circularList.add(10);
        circularList.add(15);
        circularList.add(3);
        circularList.add(1);

        Assertions.assertEquals(8, circularList.getCircularLogic(0));
        Assertions.assertEquals(10, circularList.getCircularLogic(1));
        Assertions.assertEquals(15, circularList.getCircularLogic(2));
        Assertions.assertEquals(3, circularList.getCircularLogic(3));
        Assertions.assertEquals(1, circularList.getCircularLogic(4));


        circularList.remove(15);
        Assertions.assertEquals(3, circularList.getCircularLogic(2));
        Assertions.assertEquals(1, circularList.getCircularLogic(3));

        circularList.remove(3);
        Assertions.assertEquals(1, circularList.getCircularLogic(2));

        circularList.remove(8);
        Assertions.assertEquals(10, circularList.getCircularLogic(0));
        Assertions.assertEquals(1, circularList.getCircularLogic(1));

        circularList.remove(10);
        Assertions.assertEquals(1, circularList.getCircularLogic(0));
    }


}

