public class MergeList {
    static Node head1, head2, head;
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void mergeList(Node a, Node b) {
        head=new Node(0);
        Node current=head;
        while(a!=null && b!=null) {
            if(a.data<=b.data) {
                current.next=a;
                a=a.next;
            }
            else {
                current.next=b;
                b=b.next;
            }
            current=current.next;
        }
        if(a!=null) {
            current.next=a;
            // the concept is when b is null it adds all the elemnt of a. because we have moved a in above loop. at this point a will be the head in this case
            // as when we add head to current.next then all the element connected with head also comes together.
            //if a=1->2->3 and when i said current.next=a then if current is 5 linked list will become 5->1->2->3
        }
        if(b!=null) {
            current.next=b;
        }
    }
    public void addLast1(int data) {
        Node newNode = new Node(data);
        if(head1==null){
            head1 = newNode;
            return;
        }
        Node current = head1;
        while(current.next!=null){
            current = current.next;
        }
        current.next = newNode;
    }
    public void  addLast2(int data) {
        Node newNode = new Node(data);
        if(head2==null){
            head2 = newNode;
            return;
        }
        Node current = head2;
        while(current.next!=null){
            current = current.next;
        }
        current.next = newNode;
    }
    public void print(){
        while(head1!=null){
            System.out.print(head1.data+" ");
            head1 = head1.next;
        }
        System.out.println();
        while(head2!=null){
            System.out.print(head2.data+" ");
            head2 = head2.next;
        }
        System.out.println();
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    public static void main(String[] args) {
        MergeList mergeList = new MergeList();
        mergeList.addLast1(1);
        mergeList.addLast2(2);
        mergeList.addLast1(3);
        mergeList.addLast2(4);
        mergeList.addLast1(5);
        mergeList.addLast2(6);
        mergeList.mergeList(head1,head2);
        mergeList.print();
//        while(head1!=null){
//            System.out.print(head1.data+" ");
//            head1 = head1.next;
//        }
    }
}