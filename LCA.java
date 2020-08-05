package HackerRankProblems;

import java.util.*;
import java.io.*;

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

class LCA {

	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
    */

    public static List<Node> path1 = new ArrayList<>();
    public static List<Node> path2 = new ArrayList<>();

    static void findNode(Node root, int n, List<Node> path) {
        path.add(root);
        if (root.data != n) {
            if (n > root.data) {
                findNode(root.right, n, path);
            } else {
                findNode(root.left, n, path);
            }

        }
    }

    public static Node lca(Node root, int v1, int v2) {
        // Write your code here.
        findNode(root, v1, path1);
        findNode(root, v2, path2);
        int i;
        for (i = 0; i < path1.size() && i < path2.size(); i++) { 
              
            // System.out.println(path1.get(i) + " " + path2.get(i)); 
            if (!path1.get(i).equals(path2.get(i))) 
                break; 
        }
        return path1.get(i-1);
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
      	int v1 = scan.nextInt();
      	int v2 = scan.nextInt();
        scan.close();
        Node ans = lca(root,v1,v2);
        System.out.println(ans.data);
    }	
}