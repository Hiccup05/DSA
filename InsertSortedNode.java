//to insert a node in a way which will maintain the sorting order
public class InsertSortedNode extends DeleteAtDesire{
    public void insert(int data){
        Node current=head;
        Node temp=new Node(data);  //we surly need to insert node so creating a node
        if(current.data>data){  //to tackle possibility that the desire node maybe smaller than head
            temp.next=head;
            head=temp;
            return;
        }
        while(current.next!=null && current.next.data<data){
            current=current.next;  // to ensure loop runs to last
        }
        temp.next=current.next;
        current.next=temp;
    }

    public static void main(String[] args) {
        InsertSortedNode i = new InsertSortedNode();
        i.addLast(1);
        i.addLast(2);
        i.addLast(3);
        i.addLast(5);
        i.insert(4);
        i.insert(-1);
        i.insert(20);
        i.print();
    }
}
