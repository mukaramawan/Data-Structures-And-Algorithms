package DSA.Trees;

public class BinarySearchTree  {
    
    class Node{
    int data;
    Node left,right;
    
    Node(int value){
        data=value;
        left=null;
        right=null;
        }
    }
    
    private Node root=null;
    
    
    public void insert(int value){
        root=insert(root,value);
    }
    
    private Node insert(Node root,int value){
        if(root==null)
            root=new Node(value);
        else if(root.data>value)
            root.left=insert(root.left,value);
        else
            root.right=insert(root.right,value);
        return root;
    }
    
    
    public Node Search(int key){
        return Search(root,key);
    }
    
    public Node Search(Node Root,int key){
    Node temp;
        if(Root==null)
            return null;
        else if(Root.data==key)
            temp=Root;
        else if(Root.data>key)
            temp=Search(Root.left,key);
        else
            temp=Search(Root.right,key);
        return temp;
    }
    
    
    public void delete(int key){
        root=delete(root,key);
    }    
    
    public Node delete(Node root,int key){
        if(root==null)
            return null;
        else if(root.data>key)
            root.left=delete(root.left,key);
        else if(root.data<key)
            root.right=delete(root.right,key);
        else{
        //Case #1 if selected root have no child
            if(root.left==null && root.right==null)
                return null;
        //Case #2 if selected Root have one child    
            else if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;
        //Case #3 if selected Root have two childs    
            Node pred=root.left;
                while(pred.right!=null){
                pred=pred.right;
                }
                root.data=pred.data;
                root.left=delete(root.left,pred.data);
            }
        return root;
    }
    

    public void preOrder(){
        preOrder(root);
        System.out.println("");
    }
    
    private void preOrder(Node Root){
        if(Root==null)
            return;
        else{
            System.out.printf(Root.data+" ");
            preOrder(Root.left);
            preOrder(Root.right);
        }
    }
    
}
