package deqo.nbro.mysimplestack;

import edu.umd.cs.findbugs.OpcodeStack;

public class Item {

    private int value;

    Item(int v) {
        setValue(v);
    }

    public int  getValue() {
        return value;
    }

    private void setValue(int value) {
        this.value = value;
    }

    public String toString(){
        return String.valueOf(value);
    }

}
