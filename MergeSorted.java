public class MergeSorted extends DeleteAtDesire{
    static Node head1;
    static Node head2;
    static Node head;
//    public class Node{
//        int data;
//        Node next;
//        public Node(int data){
//            this.data = data;
//            this.next = null;
//        }
//    }
    public Node merge(Node a, Node b) {  //two node came
        head = new Node(0);  //made new node with head as 0
        Node current=head;   //marking list data as current to insert a and b

        while(a!=null&&b!=null){   //checking for null pointer
            if(a.data<=b.data){  //if a is smaller we need to insert a and increase a only
                current.next=a;
                a=a.next;
            }
            else{
                current.next=b;  //vice  versa
                b=b.next;
            }
            current=current.next;
        }
        if(a==null){  //if a is null we just need to add
            current.next=b;
        }
        else{
            current.next=a;
        }
//        head=head.next;
        return head;
    }
    public void addLast1(int data){
        Node newNode = new Node(data);
        if(head1 == null){
            head1 = newNode;
            return;
        }
        Node current = head1;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }
    public void addLast2(int data){
        Node newNode = new Node(data);
        if(head2 == null){
            head2 = newNode;
            return;
        }
        Node current = head2;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }
    public void print(){
//        Node current1 = head1;
//        while(current1 != null){
//            System.out.print(current1.data + " ");
//            current1 = current1.next;
//        }
//        Node current2 = head2;
//        while(current2 != null){
//            System.out.print(current2.data + " ");
//            current2 = current2.next;
//        }
//        System.out.println();
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeSorted obj = new MergeSorted();
        obj.addLast1(1);
        obj.addLast2(2);
        obj.addLast1(3);
        obj.addLast2(4);
        obj.addLast1(5);
        obj.addLast2(6);
        obj.addLast1(7);
//        obj.print();

        obj.merge(head1,head2);
        obj.print();
    }
}
