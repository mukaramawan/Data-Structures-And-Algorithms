package DSA.LinkedLists;

public class CircularLinkedList<T> {

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
    Node Head=null;
    Node Tail=null;
    int count;
    
public void insertFirst(T value){
    Node n=new Node(value);
    if(Head==null){
    Head=n;
    Tail=n;
    Tail.next=Head;
    Head.back=Tail;
    count++;
    }
    else{
    n.next=Head;
    Head.back=n;
    Head=n;
    Tail.next=Head;
    Head.back=Tail;
    count++;
    }
}
    
public void insertEnd(T value){
    Node n=new Node(value);
    if(Head==null){
    Head=n;
    Tail=n;
    Tail.next=Head;
    Head.back=Tail;
    count++;
    }
    else{
    n.back=Tail;
    Tail.next=n;
    Tail=n;
    Head.back=Tail;
    Tail.next=Head;
    count++;
    }
}

public void deleteFirst(){
    if(Head==null){
    System.out.println("List is empty!!!");
    }
    else if(Head==Tail){
    Head=null;
    Tail=null;
    count--;
    }
    else{
    Head=Head.next;
    Head.back=Tail;
    Tail.next=Head;
    count--;
    }
}

public void deleteEnd(){
    if(Head==null){
        System.out.println("List is empty!!!");
    }
    else if(Head==Tail){
    Head=null;
    Tail=null;
    count--;
    }
    else{
    Tail=Tail.back;
    Tail.next=Head;
    Head.back=Tail;
    count--;
    }
}

public void Search(T key){
Node temp=Head;
    for(int i=0;i<count;i++){
    if(key==temp.data){
    System.out.println(key+" is found at Node #"+count);
    return;
    }
    temp=temp.next;
    }
    System.out.println("Value not found");
}

public void Traverse(){
Node temp=Head;
    for(int i=0;i<count;i++){
        System.out.printf(temp.data+"-->");
        temp=temp.next;
    }
    System.out.printf("Null\n");
}


//to check wether it is circular LinkedList or not
public void CircleTraverse(){
Node temp=Head;
    for(int i=0;i<2*count;i++){
        System.out.printf(temp.data+"-->");
        temp=temp.next;
    }
    System.out.printf("Null\n");
}


}
