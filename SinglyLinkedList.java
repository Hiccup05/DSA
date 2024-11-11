public class SinglyLinkedList {
    Node head;
    public class Node {
        String data;
        Node next;
        public Node(String data){
            this.data = data;
            next = null;
        }
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(String data){  //function that takes a string
        Node newNode = new Node(data);  //create new node
        if(head==null){  //if head is null than new node is a head
            head=newNode; //new node is a head
            return;  //function finish
        }
        Node current=head;  //if head is not null assign current node as head
        while(current.next!=null){ //continuing loop until we reach the end of the list
            current=current.next;  // every time asigining the next value as a current node
        }
        current.next=newNode;  //if next is null than assign the new node to current.next to form link
    }

    public int length(){
        int length=0;
        Node current=head;
        while(current!=null){
            length++;
            current=current.next;
        }
        return length;
    }

    public void print(){
        Node current=head;
        while(current!=null){
            System.out.println(current.data);
            current= current.next;
        }
    }
    public void deleteFirst(){
        Node temp=head;
        head=head.next;  //if we make second a next that the connection with first will remove which means deleting the node.
        temp.next=null;
    }

    public void deleteLast(){
        Node current=head;  //inisitaing our run
        while(current.next.next!=null){  //to find the last the next node should be empty means next of next of our secondlast should be empty
            current=current.next;  //until that point increasing by one
        }
        current.next=null;   //if next to next is null that removing next or making it null which removes the connection between second last and last
    }

    public void deleteLast2(){
        //concept is to store last and second last node. when we reach last node apply condition next is null
        // then previous.next=null will remove the linkage between second last and last node.
        Node current=head;
        Node previous=null;
        while(current.next!=null){
            previous=current;
            current=current.next;
        }
        previous.next=null;
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addLast("Hello");
        list.addFirst("World");
        list.addLast("Its good");
        list.addLast("Its bad");
        list.print();
        System.out.println(list.length());
        list.deleteLast();
        list.print();

        list.deleteFirst();
        list.print();
    }
}
