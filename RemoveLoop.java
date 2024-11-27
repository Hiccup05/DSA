public class RemoveLoop extends DeleteAtDesire {
    public void removeLoop() {
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow) {
                removeLoop(slow);
                return;
            }
        }
    }

    public void removeLoop(Node slow) {
        Node temp=head;
        while(temp.next!=slow.next) {
            temp=temp.next;
            slow=slow.next;
        }
        slow.next=null;
    }

    public void makeLoop(){
        Node current=head;
        Node loopPoint=head;
        while(current.next.next!=null){
            current=current.next.next;
            loopPoint=loopPoint.next;
        }
        current.next=loopPoint;
    }

    public static void main(String[] args) {
        RemoveLoop r = new RemoveLoop();
        r.addLast(1);
        r.addLast(2);
        r.addLast(3);
        r.addLast(4);
        r.addLast(5);
        r.addLast(6);
        r.addLast(7);
        r.addLast(8);
        r.makeLoop();
        r.removeLoop();
        r.print();
    }
}
