public class IntLinkedList {

    IntNode head;
    IntNode tail;
    int length;

    public void insert(int n) {
        IntNode newNode = new IntNode(n, null);
        if (length == 0) {
            this.head = newNode;
        } else {
            tail.setRef(newNode);
        }
        this.tail = newNode;
        length++;
    }

    public void displayList() {
        IntNode node = head;
        for (int i = 1; i <= length; i++) {
            if (i != length) {
                System.out.print(node.getValue() + "-->");
                node = node.getRef();
            } else {
                System.out.print(node.getValue());
            }
        }
    }

}