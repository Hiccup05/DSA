public class RevisedInsert extends DeleteAtDesire{
    //this algorithm helps to insert into the sorted linked list not infront
    public void insert(int data){
        Node newNode = new Node(data);
        Node current = head;
        Node temp=null;
        while(current != null && current.data<newNode.data){
            temp = current;
            current = current.next;
        }
        newNode.next=current;
        temp.next=newNode;
    }

    public static void main(String[] args) {
        RevisedInsert revisedInsert = new RevisedInsert();
        revisedInsert.addLast(4);
        revisedInsert.addLast(5);
        revisedInsert.addLast(6);
        revisedInsert.addLast(7);
        revisedInsert.addLast(18);
        revisedInsert.addLast(20);
        revisedInsert.insert(21);
        revisedInsert.print();
    }
}
