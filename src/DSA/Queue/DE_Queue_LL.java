package DSA.Queue;
                            //Double Ended Queue with LinkedList
public class DE_Queue_LL <T> {
    
    class Node{
        T data;
        Node next,back;
            
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
    
    public void enQueueAtTail(T value){
    Node n=new Node(value);
        if(head==null){
        head=n;
        tail=n;
        }
        else{
            tail.next=n;
            n.back=tail;
            tail=n;
        }
    count++;
    }
    
    public void enQueueAtHead(T value){
    Node n=new Node(value);
        if(head==null){
        head=n;
        tail=n;
        }
        else{
            n.next=head;
            head.back=n;
            head=n;
        }
    count++;
    }
    
    public T deQueueAtHead(){
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
        head.back=null;
        count--;
        return temp;     
        }
    }
    
    public T deQueueAtTail(){
        if(head==null)
            return null;
        else if(head==tail){
        T temp=tail.data;
        head=null;
        tail=null;
        count--;
        return temp;
        }
        else{
        T temp=tail.data;
        tail=tail.back;
        tail.next=null;
        count--;
        return temp;     
        }
    }
    
    public void traverse(){
    Node temp=head;
        if(isEmpty())
            System.out.println("Queue is Empty!!!");
        else{
        while(temp!=null){
            System.out.printf(temp.data+"-->");
        temp=temp.next;
        }
            System.out.printf("null\n");
        }
    }
    
    
}
