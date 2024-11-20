public class CheckingLoopInList extends DeleteAtDesire {
    //the concept is that sometime at some point there might loop in list which donesnt end to null as it rotate continously to check it.
    public boolean checkLoop(){
        Node fast=head;  //move it by 2
        Node slow=head;  // move it by 1
        // if there is loop that at some point fast will meet slow which will make their value same and we can know it is loop

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
}
