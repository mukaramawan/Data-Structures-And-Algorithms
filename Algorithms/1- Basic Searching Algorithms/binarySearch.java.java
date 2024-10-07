package Algorithms;

public class binarySearch  {
    
    public int binarySearch(int[] arr,int key,int low,int high){
        int mid=low+(high-low)/2;
        if(high>=low){
            if(arr[mid]==key)
                return mid;
            else if(key>arr[mid])
                return binarySearch(arr,key,mid+1,high);
            else 
                return binarySearch(arr,key,low,mid-1);
        }
        return -1;
    }
    
    
    public void traverse(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    
    
}
