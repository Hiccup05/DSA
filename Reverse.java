import java.util.LinkedList;

public class Reverse extends DeleteAtDesire {
    public void reverse(){
        Node current = head;
        Node previous = null;
        Node next = null;
        while(current != null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
    }
    public static void main(String[] args) {
        Reverse r = new Reverse();
        r.addLast(1);
        r.addLast(2);
        r.addLast(3);
        r.addLast(4);
        r.addLast(5);
        r.addLast(6);
        r.addLast(7);
        r.addLast(8);
        r.addLast(9);
        r.addLast(10);
    }
}
