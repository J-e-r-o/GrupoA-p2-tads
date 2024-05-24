package TestUnitarios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uy.edu.um.adt.linkedlist.MyList;
import uy.edu.um.adt.linkedlist.MyLinkedListImpl;
public class LinkedListTest {
    @Test
    void LinkedListGetTest(){
        MyList<Integer> list = new MyLinkedListImpl<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        Assertions.assertNull(list.get(7));
        Assertions.assertNull(list.get(11));
        Assertions.assertNotNull(list.get(2));
        Assertions.assertNotNull(list.get(5));
        Assertions.assertEquals(6,list.get(5));
        Assertions.assertEquals(2,list.get(1));
        Assertions.assertNotEquals(1,list.get(1));
        Assertions.assertNotEquals(6,list.get(2));

    }
    @Test
    void LinkedListContainsTest() {
        MyList<Integer> list = new MyLinkedListImpl<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        Assertions.assertFalse(list.contains(9));
        Assertions.assertFalse(list.contains(7));
        Assertions.assertTrue(list.contains(5));
        Assertions.assertTrue(list.contains(1));

    }
    @Test
    void LinkedListRemoveTest(){
        MyList<Integer> list = new MyLinkedListImpl<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.remove(1);
        list.remove(5);
        Assertions.assertNull(list.get(5));
        Assertions.assertNotNull(list.get(2));
        Assertions.assertEquals(2,list.get(0));
        Assertions.assertNotEquals(1,list.get(0));
    }
    @Test
    void LinkedListRemoveLastTest(){
        MyLinkedListImpl<Integer> list = new MyLinkedListImpl<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.removeLast();
    }
    @Test
    void LinkedListSizeTest(){
        MyList<Integer> list = new MyLinkedListImpl<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        Assertions.assertEquals(6,list.size());
        Assertions.assertNotEquals(7,list.size());
        list.remove(2);
        Assertions.assertNotEquals(6,list.size());
        Assertions.assertEquals(5,list.size());
        list.add(7);
        list.add(8);
        Assertions.assertNotEquals(5,list.size());
        Assertions.assertEquals(7,list.size());
    }
}

