package Algorithms;

public class insertionSort  {
    
    public void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=1;
            while(j>0 && arr[j-1]> temp){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;
        }
    }
    
    
    public void traverse(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    
    
}
