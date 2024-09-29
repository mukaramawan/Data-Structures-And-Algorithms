package DSA.Queue;

public class Queue_LL<T> {
    
    class Node{
        T data;
        Node next;
        
        Node(T value){
            data=value;
            next=null;
        }
    }
    
    
    Node head=null;
    Node tail=null;
    int count=0;
    
    
    public boolean isEmpty(){
        return head==null;
    }
    
    
    public void enQueue(T value){
    Node n=new Node(value);
        if(head==null){
        head=n;
        tail=n;
        }
        else{
        tail.next=n;
        tail=n;
        }
    count++;
    }
    
    
    public T deQueue(){
        if(isEmpty())
            return null;
        else if(head==tail){
            T temp=head.data;
            head=null;
            tail=null;
            count--;
        return temp;
        }
        else{
            T temp=head.data;
            head=head.next;
            count--;
        return temp;
        }    
    }
    
    
    public T front(){
        if(head==null)
            return null;
        return head.data;
    }
    
    public int size(){
        return count;
    }
    
    
    public void printQueue() {
        Node temp = head;
        System.out.println("H------->T");
        while (temp != null) {
            System.out.print("" + temp.data + " |");
            temp = temp.next;
        }
        System.out.println("");
    }
    
}
