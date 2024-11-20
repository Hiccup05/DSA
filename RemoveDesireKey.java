public class RemoveDesireKey extends DeleteAtDesire {
    public void removeKey(int key){
        Node current=head;
        Node prev=null;
        while(current!=null && current.data!=key){
            prev=current;
            current=current.next;
        }
        prev.next=current.next;
    }

    public static void main(String[] args) {
        RemoveDesireKey test=new RemoveDesireKey();
        test.addLast(1);
        test.addLast(2);
        test.addLast(3);
        test.addLast(4);

        test.print();
        test.removeKey(2);
        test.print();
    }
}
