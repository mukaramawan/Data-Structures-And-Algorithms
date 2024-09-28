package DSA.Stack;
    
                                    //Stack implementation by LinkedList method
public class Stack<T> {

class Node{
    T data;
    Node next;
    
    Node(T d){
    data=d;
    next=null;
    }
}
 
Node top=null;

public boolean isEmpty(){
    if(top==null)
    return true;
    else
    return false;
}

public void push(T value){
    Node n=new Node(value);
    if(isEmpty()){
        top=n;
    }
    else{
    n.next=top;
    top=n;
    }
}

public T pop(){
    if(isEmpty()){
        System.out.println("Stack is underflow!!!");
        return null;
    }
    else{
    T data=top.data;
    top=top.next;
    return data;
    }
}

public void peek(){
    if(isEmpty()){
        System.out.println("Stack is underflow!!!");
    }
    else{
        System.out.println("The next value is "+top.data);
    }
}

public void printStack(){
    Node temp=top;
    if(isEmpty()){
        System.out.println("Stack is underflow!!!");
    }
    else{
       while(temp!=null){
           System.out.println("|\t"+temp.data+"\t|");
           temp=temp.next;
       }
        System.out.println(" -------------- ");
    }
}

}

