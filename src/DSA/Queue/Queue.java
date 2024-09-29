package DSA.Queue;
                            //Queue with Array Implementation
public class Queue <T> {
    
    T[] arr;
    
    Queue(int size){
    arr=(T[])new Object[size];
    }
    
    int head=0;
    int tail=-1;
    
    public boolean isFull(){
        return tail>=arr.length-1;
    }
    
    public boolean isEmpty(){
        return tail<=-1;
    }
    
    public void enQueue(T value){
        if(isFull())
            System.out.println("Queue is Full!!!");
        else{
            arr[++tail]=value;
        }
    }
    
    public T deQueue(){
        if(isEmpty())
            return null;
        else{
            T temp=arr[head];
            moveForward();
            return temp;
        }
    }
    
    public void moveForward(){
        for(int i=1;i<=tail;i++){
            arr[i-1]=arr[i];
        }
        tail--;
    }
    
    public T front(){
        if(isEmpty())
            return null;
        return arr[head];
    }
    
    public void printQueue(){
        for(int i=0;i<=tail;i++){
            System.out.print(arr[i]+" |");
        }  
    }
    
}


