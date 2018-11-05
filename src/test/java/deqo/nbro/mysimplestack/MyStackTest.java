package deqo.nbro.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class MyStackTest {

    private MyStack ms1,ms2;
    private Item it;

    @Before
    public void setUp() {
        ms1 = new MyStack();
        ms2 = new MyStack();
        it = new Item(2);
        ms2.push(new Item(1));
        ms2.push(it);
    }

    @Test (expected = EmptyStackException.class)
    public void testStackEmpty() {
        ms1.pop();
    }

    @Test
    public void testGetSize() {
        assertEquals(0,ms1.getSize());
        assertEquals(2,ms2.getSize());
    }

    @Test
    public void testNewStackSize() {
        assertEquals("The size of a new stack should be zero",0,ms1.getSize());
    }

    @Test (expected = EmptyStackException.class)
    public void testPeekEmptyStack() throws EmptyStackException{
        ms1.peeks();
    }
}