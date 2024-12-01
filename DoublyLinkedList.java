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
    public void print(){
        node current = head;
        while(current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null"); //if there is node then it will become last node and if not it show message that the list is empty
    }
    public void addFirst(int data){
        node newNode = new node(data);
        if(isEmpty()){  //if list is empty that is ok
            head = newNode;
            return;
        }
        //in case list is not empty,
        head.prev = newNode;  //pervious of head is pointed to new node
        newNode.next = head;  //in doubly we need to assign the next node also so assigned next of new node to head
        head = newNode;  //if there is new node before then we need to make it head
        size++;
    }
    public void addLast(int data){
        node newNode = new node(data);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    public void deleteFirst(){
        node temp = head;
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        temp.next = null;
        head.prev = null;
        size--;
    }


    public void deleteLast(){
        node temp=tail;
        if(isEmpty()){
            System.out.println("LIst is empty");
            return;
        }
        tail=tail.prev;
        tail.next=null;
        temp.prev=null;
        size--;
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast(6);        list.addLast(7);
        list.addLast(8);
        list.print();
        list.deleteLast();
        list.print();
    }
}
