package deqo.nbro.mysimplestack;

import java.util.EmptyStackException;

public interface SimpleStack {

    /**
     * Tests if this stack is empty
     */
    public boolean isEmpty();

    /**
     * Returns the number of items in this stack.
     */
    public int getSize();

    /**
     * Pushes an item onto the top of this stack.
     * null item is alowed
     */
    public void push(Item item);

    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     */
    public Item peeks()throws EmptyStackException;

    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
     * @throws EmptyStackException
     */
    public Item pop() throws EmptyStackException;


}
