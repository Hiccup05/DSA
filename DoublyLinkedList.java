public class DoublyLinkedList {
    private node head;
    private node tail;
    private int size;
    public class node{
        int data;
        node next;
        node prev;
        public node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public int size(){
        return size;
    }
}
