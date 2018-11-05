package deqo.nbro.mysimplestack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Hello world!
 *
 */
public class MyStack implements SimpleStack
{
    private ArrayList<Item> stack;

    public MyStack(){
        stack = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return (stack.size() == 0);
    }

    @Override
    public int getSize() {
        return stack.size();
    }

    @Override
    public void push(Item item) {
        stack.add(item);
    }

    @Override
    public Item peeks() throws EmptyStackException {
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }
        return stack.get(getSize()-1);
    }

    @Override
    public Item pop() throws EmptyStackException {
        Item tmp;
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }else{
            tmp = peeks();
            stack.remove(getSize()-1);
            return tmp;
        }
    }
}
