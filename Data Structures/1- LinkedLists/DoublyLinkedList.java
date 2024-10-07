package DSA.LinkedLists;

public class DoublyLinkedList <T> {
    
class Node{
    T data;
    Node next;
    Node back;
        
    Node(T d){
        data=d;
        next=null;
        back=null;
        }
}
    
    Node Head;
    Node Tail;
    
public void insertFirst(T value){
    Node n=new Node(value);
        if(Head==null){
        Head=n;
        Tail=n;        
        }
        else{
        n.next=Head;
        Head.back=n;
        Head=n;
        }
    }

public void insertEnd(T value){
    Node n=new Node(value);
    if(Head==null){
        Head=n;
        Tail=n;
    }
    else{
    Tail.next=n;
    n.back=Tail;
    Tail=n;
    }
}

public void deleteStart(){
    if(Head==null){
        System.out.println("List is Empty!!!");
    }
    else if(Head==Tail){
    Head=null;
    Tail=null;
    }
    else{
    Head=Head.next;
    Head.back=null;
    }
}

public void deleteEnd(){
    if(Head==null){
        System.out.println("List is Empty!!!");
    }
    else if(Head==Tail){
    Head=null;
    Tail=null;
    }
    else{
    Tail=Tail.back;
    Tail.next=null;
    }
}

public void Search(T key){
    int count=1;
    Node temp=Head;
    while(temp.next!=null){
        if(key==temp.data){
        System.out.println(temp.data+" is found at Node #"+count);
        return;
        }
    temp=temp.next;
    count++;
    }
    System.out.println("Value not Found");
}

public void traverseForward(){
    Node temp=Head;
    while(temp!=null){
        System.out.print(temp.data+"-->");
        temp=temp.next;
    }
    System.out.print("Null\n");
}

public void traverseBackward(){
    Node temp=Tail;
    while(temp!=null){
        System.out.printf(temp.data+"-->");
        temp=temp.back;
    }
    System.out.printf("null\n");
}
    
}