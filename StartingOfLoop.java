public class StartingOfLoop extends DeleteAtDesire{
    public Node startingNode(){
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next;
            slow=slow.next;

            if(fast==slow){
                return getStarting(slow);
            }
        }
        return null;
    }
    public Node getStarting(Node slow){
        //this concept is Floyd cycle detection
        Node temp=head;
        while(temp!=slow){
            temp=temp.next;
            slow=slow.next;
        }
        return temp;
    }
}
