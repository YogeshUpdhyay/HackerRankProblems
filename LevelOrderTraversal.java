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

public class LevelOrderTraversal {
    public static void levelOrder(Node root) {
      Queue<Node> queue = new LinkedList<>();
      queue.add(root);
      while(!queue.isEmpty()){
        System.out.print(queue.peek().data + " ");
        if(queue.peek().left != null){
            queue.add(queue.peek().left);
        }
        if(queue.peek().right != null){
            queue.add(queue.peek().right);
        }
        queue.remove();
      }
    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
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
        levelOrder(root);
    }
}