package DSA.LinkedLists;

public class SinglyLinkedList2 <T> {
    class Node{
    T data;
    Node link;
    
        Node(T d){
        this.data=d;
        link=null;
        }
    }
    
    Node Head=null;
    Node Tail=null;
    
    public void insertFirst(T value){
    Node n=new Node(value);
        if(Head==null){
        Head=n;
        Tail=n;
        }
        else{
        n.link=Head;
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
            Node temp=Head;
            while(temp.link!=null){
            temp=temp.link;
            }
            temp.link=n;
            Tail=n;
        }
    }
    
    
    public void deleteStart(){
    if(Head==null){
        System.out.println("List is empty!!!");
    }
    else{
        Head=Head.link;
    }
    }
    
    public void deleteEnd(){
    if(Head==null){
        System.out.println("List is empty!!!");
    }
    else{
        Node temp=Head;
        while(temp.link.link!=null){
        temp=temp.link;
        }
        temp.link=null;
        }
    }
    
    public void traverse(){
    Node temp=Head;
        while(temp!=null){
        System.out.printf(temp.data+"-->");
        temp=temp.link;   
        }
        System.out.printf("Null");
    }
    
}
