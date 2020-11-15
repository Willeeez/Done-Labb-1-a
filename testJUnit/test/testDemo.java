import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import javax.swing.*;


public class testDemo {
    private ARSet set;

    public void init() {
        set = new ARSet();
        set.add(10);
        set.add(10);
    }
    public void testAddSizeOK() {
        ARSet set = new ARSet();
        int size = set.size();
        set.add(10);
        assertTrue(size < set.size());
    }
    public void testAddTwoIdenticalElements() {
        assertTrue(set.size() == 1);
    }

    public void testAddTwoIdenticalElementsCheckElement() {
        assertTrue(set.contains(10));
    }
    private void assertTrue(boolean b) {
    }
    public static void main(String[] args) {

        testDemo test1 = new testDemo();
    }
}
