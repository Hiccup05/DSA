public class RemoveDublicate extends DeleteAtDesire{
    public void removeDublicate(){
        Node current=head;
        while(current!=null && current.next!=null){ //to ensure the check ends at the end otherwise when current.next is null the if condition will give error
          if(current.data==current.next.data){
              current.next=current.next.next;
          }
          else{
              current=current.next;
          }
        }
    }

    public static void main(String[] args) {
        RemoveDublicate rd=new RemoveDublicate();
        rd.addLast(1);
        rd.addLast(2);
        rd.addLast(2);
        rd.addLast(3);
        rd.addLast(3);
        rd.addLast(3);
        rd.addLast(4);
        rd.removeDublicate();
        rd.print();
    }
}
