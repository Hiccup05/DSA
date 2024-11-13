public class FindNthTerm {
    // To find the nth term from last.
    Node head;
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public Node nthTerm(int n){
        Node firstPointer=head;  //first pointer
        Node secondPointer=head;
        int counter=0;
        while(counter<n){
            secondPointer=secondPointer.next; //making second pointer couter time far from first pointer so when second pointer reach null the first pointer will be the nth term from last
            counter++;
        }
        while(secondPointer != null){
            firstPointer=firstPointer.next;
            secondPointer=secondPointer.next;
        }
        return firstPointer;
    }

    public static void main(String[] args) {
        FindNthTerm obj=new FindNthTerm();
        obj.addLast(1);
        obj.addLast(2);
        obj.addLast(3);
        obj.addLast(4);
        System.out.println(obj.nthTerm(1).data);
    }
}
