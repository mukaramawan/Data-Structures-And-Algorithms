package Algorithms;

public class Linear_Search  {
    
    public int linerSearch(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)
                return i;
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
