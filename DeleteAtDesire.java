public class DeleteAtDesire {
    Node head;
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void print(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public void delete(int position){
        Node current = head;
        if(current == null){
            return;
        }
        int counter=1;
        if(position==1){
            head = current.next;
            return;
        }
        Node previous = null;
        while(counter != position){
            previous = current;
            current = current.next;
            counter++;
        }
        previous.next = current.next;
    }
    public static void main(String[] args) {
        DeleteAtDesire deleteAtDesire = new DeleteAtDesire();
        deleteAtDesire.addLast(5);
        deleteAtDesire.addLast(10);
        deleteAtDesire.addLast(15);
        deleteAtDesire.addLast(20);
        deleteAtDesire.addLast(25);
        deleteAtDesire.print();
        deleteAtDesire.delete(1);
        deleteAtDesire.print();
    }
}
