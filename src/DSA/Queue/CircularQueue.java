package DSA.Queue;
                                
                    //Circular Queue with Linked List

public class CircularQueue <T> {
    
    class Node{
    T data;
    Node next,back;
        
        Node(T value){
            data=value;
            next=null;
            back=null;
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
            tail.next=head;
            head.back=tail;
        }
        else{
            n.back=tail;
            tail.next=n;
            tail=n;
            tail.next=head;
            head.back=tail;
        }
        count++;
    }
    
    
    public T deQueue(){
        if(head==null)
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
        head.back=tail;
        tail.next=head;
        count--;
        return temp;
        }
    }
    
    public T front(){
        return head.data;
    }
    
    public int size(){
        return count;
    }
    
    
    public void traverse(){
    Node temp=head;
        for(int i=0;i<count;i++){
            System.out.print(temp.data+" | ");
            temp=temp.next;
        }
        System.out.printf("null\n");
    }
    
    
//to check wether it is circular Queue or not
    public void circleTraverse(){
    Node temp=head;
        for(int i=0;i<2*count;i++){
            System.out.print(temp.data+" | ");
            temp=temp.next;
        }
        System.out.printf("null\n");
    }
    
}
