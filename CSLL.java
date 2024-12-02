public class CSLL {
    node last;
    int length;
    private class node {
        int data;
        node next;
        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public CSLL(){
        last=null;
        length=0;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void simpleCSLL(){
        node first=new node(1);
        node second=new node(2);
        node third=new node(3);
        node fourth=new node(4);

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=first;

        last=fourth; //as we track last node need to refrence fourth node as last as its a last node
        System.out.println("I have come here");
    }
    public void insert(int data) {
        node newNode = new node(data);
        node first;
        if (last == null) {
            last=newNode;
            last.next=last;
        }
    }

    public void print(){      if(last==null){
            System.out.println("List is empty");
            return;
        }
        node first=last.next;
        while(first!=last){
            System.out.print(first.data+"->");
            first=first.next;
        }
        System.out.print(first.data);

    }
    public static void main(String[] args) {
        CSLL csll=new CSLL();
        csll.simpleCSLL();
        csll.print();
    }
}
