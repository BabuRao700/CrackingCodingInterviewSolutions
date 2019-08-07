public class IntNode {
    int value;
    IntNode ref;

    public IntNode(int value, IntNode ref) {
        this.value = value;
        this.ref = ref;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public IntNode getRef() {
        return ref;
    }

    public void setRef(IntNode ref) {
        this.ref = ref;
    }
}
