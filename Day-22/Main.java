// Day 22: Binary Search Trees
// https://www.hackerrank.com/challenges/30-binary-search-trees/copy-from/182774139
import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

	public static int getHeight(Node root){
      //Write your code here
      int counterL = 0;
      int counterR = 0;
      if (root.left != null) {
          counterL = getHeight(root.left) + 1;
      }
      if (root.right != null) {
          counterR = getHeight(root.right) + 1;
      }
      
      if (counterL < counterR) {
          return counterR;
      } else {
          return counterL;
      }
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	 public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}