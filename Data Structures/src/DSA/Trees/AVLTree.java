package DSA.Trees;

public class AVLTree {
    
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
    
    private Node insert(Node Root,int value){
        if(Root==null)
            Root=new Node(value);
        else if(Root.data>value)
            Root.left=insert(Root.left,value);
        else
            Root.right=insert(Root.right,value);
        Root=balance(Root);
        return Root;
    }
    
    public Node search(int key){
        return search(root,key);
    }
    
    private Node search(Node Root,int key){
    Node temp;  
        if(Root==null)
            return null;
        else if(Root.data==key)
            temp=Root;
        else if(Root.data>key)
            temp=search(Root.left,key);
        else
            temp=search(Root.right,key);
        return temp;
    }
    
    
    public void delete(int value){
        root=delete(root,value);
    }
    
    public Node delete(Node root,int key){
        if(root==null)
            return null;
        else if(root.data>key){
            root.left=delete(root.left,key);
            root=balance(root);
            return root;
        }
        else if(root.data<key){
            root.right=delete(root.right,key);
            root=balance(root);
            return root;
        }
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
        root=balance(root);
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
            System.out.print(Root.data+" ");
            preOrder(Root.left);
            preOrder(Root.right);
        }
    }
    
    private int height(Node Root){
        if(Root==null)
            return -1;
        return (Math.max(height(Root.left), height(Root.right))+1);
    }
    
    private int balanceFactor(Node Root){
        return height(Root.left)-height(Root.right);
    }
    
    private Node rotateRight(Node Root){
        Node temp1=Root;
        Node temp2=Root.left.right;
        Root=Root.left;
        Root.right=temp1;
        Root.right.left=temp2;
        return Root;
    }
    
    private Node rotateLeft(Node Root){
        Node temp1=Root;
        Node temp2=Root.right.left;
        Root=Root.right;
        Root.left=temp1;
        Root.left.right=temp2;
        return Root;
    }
    
    
    private Node balance(Node Root){
        if(balanceFactor(Root)==2 && balanceFactor(Root.left)==1)
            Root=rotateRight(Root);
        else if(balanceFactor(Root)==-2 && balanceFactor(Root.right)==-1)
            Root=rotateLeft(Root);
        else if(balanceFactor(Root)==2 && balanceFactor(Root.left)==-1){
            Root.left=rotateLeft(Root.left);
            Root=rotateRight(Root);
        }
        else if(balanceFactor(Root)==-2 && balanceFactor(Root.right)==1){
            Root.right=rotateRight(Root.right);
            Root=rotateLeft(Root);
        }
        return Root;
    }
    
}
