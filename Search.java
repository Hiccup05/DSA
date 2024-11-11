public class Search extends DeleteAtDesire {
    public boolean search(int data) {
        Node current=head;
        while(current!=null) {
            if(data==current.data) {
                return true;
            }
            current=current.next;
        }
        return false;
    }
    public static void main(String[] args) {
        Search s=new Search();
        s.addLast(5);
        s.addLast(10);
        s.addLast(15);
        System.out.println(s.search(15));
    }
}
