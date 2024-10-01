package DSA.Queue;

public class PriorityQueue <T> {
    
    Queue_LL q1=new Queue_LL();
    Queue_LL q2=new Queue_LL();
    Queue_LL q3=new Queue_LL();
    
    public void enQueue(T value, int priority){
        if(priority==3)
            q3.enQueue(value);
        else if(priority==2)
            q2.enQueue(value);
        else
            q3.enQueue(value);
    }
    
    public void deQueue(){
        if(!q3.isEmpty())
            q3.deQueue();
        else if(!q2.isEmpty())
            q2.deQueue();
        else
            q1.deQueue();
    }
    
}
