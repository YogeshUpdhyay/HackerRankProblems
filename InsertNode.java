import java.util.*;


class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class InsertNode {
   
  	public static void preOrder( Node root ) {
      
    	if( root == null)
        	return;
      
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
     
    }

	public static Node insert(Node root,int data) {
        if(root == null){
            Node newNode = new Node(data);
            root = newNode;
        }
        if(data > root.data){
            if(root.right == null){
                Node newNode = new Node(data);
                root.right= newNode;
            } else {
                root.right = insert(root.right,data);
            }
        }
        if(data < root.data){
            if(root.left == null){
                Node newNode = new Node(data);
                root.left = newNode;
            } else {
                root.left = insert(root.left,data);
            }
        }
    	return root;
    }

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
      	preOrder(root);
    }	
}