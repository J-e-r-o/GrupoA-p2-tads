package TestUnitarios;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uy.edu.um.adt.binarytree.MySearchBinaryTreeImpl;

public class binarytreeTest {
    @Test
    void binarytreeFindTest(){
        MySearchBinaryTreeImpl<Integer,Integer> tree= new MySearchBinaryTreeImpl<>();
        tree.add(1,11);
        tree.add(2,12);
        tree.add(3,13);
        tree.add(4,14);
        tree.add(5,15);
        tree.add(6,16);
        tree.add(7,17);
        Assertions.assertEquals(11,tree.find(1));
        Assertions.assertEquals(17,tree.find(7));
        Assertions.assertNotEquals(5,tree.find(2));
        Assertions.assertNotEquals(6,tree.find(3));
        Assertions.assertNotNull(tree.find(4));
        Assertions.assertNotNull(tree.find(5));
        Assertions.assertNull(tree.find(11));
        Assertions.assertNull(tree.find(16));
    }
    @Test
    void binarytreeContainsTest(){
        MySearchBinaryTreeImpl<Integer,Integer> tree= new MySearchBinaryTreeImpl<>();
        tree.add(1,11);
        tree.add(2,12);
        tree.add(3,13);
        tree.add(4,14);
        tree.add(5,15);
        tree.add(6,16);
        tree.add(7,17);
        Assertions.assertNotNull(tree.contains(8));
        Assertions.assertNotNull(tree.contains(1));
        Assertions.assertFalse(tree.contains(9));
        Assertions.assertFalse(tree.contains(11));
        Assertions.assertTrue(tree.contains(2));
        Assertions.assertTrue(tree.contains(7));
    }
    @Test
    void binarytreeRemoveTest() {
        MySearchBinaryTreeImpl<Integer, Integer> tree = new MySearchBinaryTreeImpl<>();
        tree.add(1, 11);
        tree.add(2, 12);
        tree.add(3, 13);
        tree.add(4, 14);
        tree.add(5, 15);
        tree.add(6, 16);
        tree.add(7, 17);
        tree.remove(1);
        tree.remove(4);
        Assertions.assertFalse(tree.contains(1));
        Assertions.assertFalse(tree.contains(4));
        Assertions.assertNull(tree.find(1));
        Assertions.assertNull(tree.find(4));
    }
//    @Test
//    void binarytreeinOrderTest(){
//        MySearchBinaryTreeImpl<Integer,Integer> tree= new MySearchBinaryTreeImpl<>();
//        tree.add(1,11);
//        tree.add(2,12);
//        tree.add(3,13);
//        tree.add(4,14);
//        tree.add(5,15);
//        tree.add(6,16);
//        tree.add(7,17);

}
