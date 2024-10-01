package DSA.Trees;

public class BinaryTree <T> {
    
    class Node{
    T data;
    Node left,right;
        
    Node(T value){
        data=value;
        left=null;
        right=null;
        }
    }
    
    private Node root=null;
    
    
    public void insertRoot(T value){
        if(root!=null)
            System.out.println("Root already exists!!!");
        else{
        Node n=new Node(value);
        root=n;
        }
    }
    
    
    private Node Search(Node root,T key){
        if(root==null)
            return null;
        else{
            if(root.data==key)
                return root;
            else{
            Node temp=Search(root.left,key);
                if(temp!=null)
                    return temp;
                else{
                temp=Search(root.right,key);
                }
                return temp;
            }
        }
    }
    
    
    public void insertLeft(T value,T parent){
        Node p=Search(root,parent);
        if(p==null)
            System.out.println("Parent does not exist!!!");
        else{
            if(p.left!=null)
                System.out.println("Left child already exists!!!");
            else{
            Node n=new Node(value);
            p.left=n;
            }
        }
    }
    
    
    public void insertRight(T value,T parent){
        Node p=Search(root,parent);
        if(p==null)
            System.out.println("Parent does not exists!!!");
        else{
            if(p.right!=null)
                System.out.println("Right child already exists!!!");
            else{
            Node n=new Node(value);
            p.right=n;
            }
        }       
    }
    
    public void preOrder(){
        preOrder(root);
    }
    
    private void preOrder(Node Root){
        if(Root==null)
            return;
        else{
            System.out.print(Root.data+"-->");
            preOrder(Root.left);
            preOrder(Root.right);
        }
    }
    
}
