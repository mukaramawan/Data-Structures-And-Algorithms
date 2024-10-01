package DSA.Stack;

                        //Stack implementation by Array
public class Stack2<T>
{
    T[] arr;
    int top=-1;
    
    Stack2(int size){
    arr=(T[])new Object[size];
    }

    
    public boolean isFull(){
        if(top>=arr.length-1)
            return true;
        return false;
    }
    
    
    public boolean isEmpty(){
        return top<=-1;
    }
    
    
    public void push(T value){
        if(isFull())
            System.out.println("Stack is Overflow!!!");
        else{
        top++;
        arr[top]=value;
        }
    }
    
    
    public T pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return null;
        }
        else{
        T temp=arr[top];
        top--;
        return temp;
        }
    }
    
    
    public T peek(){
    if(isEmpty())
        return null;
    return arr[top];
    }

    
    public void printStack(){
        for(int i=top;i>=0;i--){
            System.out.println("|\t"+arr[i]+"\t|");
        }
        System.out.println("----------------");
    
    }
   
}
