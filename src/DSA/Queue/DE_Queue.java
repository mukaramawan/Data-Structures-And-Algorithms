package DSA.Queue;
                            //Double Ended Queue with Array
public class DE_Queue <T> {
    
    T[] arr;
    
    DE_Queue(int size){
    arr=(T[])new Object[size];
    }
    
    int head=0;
    int tail=-1;
    
    public boolean isEmpty(){
        return tail<=-1;
    }
    
    public boolean isFull(){
        return tail>=arr.length-1;
    }
    
    public void enQueueAtTail(T value){
        if(isFull())
            System.out.println("Queue is Full!!!");
        else
        arr[++tail]=value; 
    }
    
    public void enQueueAtHead(T value){
        if (isFull())
            System.out.println("Queue is full!!!");
        else{
        moveBack();
        arr[head]=value;
        }
    }

    public void moveBack(){
        if(isFull())
            System.out.println("Queue is Full!!!");
        else{
        for(int i=tail;i>=0;i--){
            arr[i+1]=arr[i];
        }
        tail++;
        }
    }
    
    public T deQueueAtHead(){
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
    
    public T deQueueAtTail(){
        if(isEmpty())
            return null;
        else{
        T temp=arr[tail];
        tail--;
        return temp;
        }
    }
    
    public T front(){
        if(isEmpty())
            return null;
        return arr[head];
    }
    
    public void printQueue(){
        if(isEmpty())
            System.out.println("Queue is Empty!!!");
        else{
            for(int i=0;i<=tail;i++){
                System.out.print(arr[i]+"-->");
            }
            System.out.print("null");
        }
    }
    
    
}
    

