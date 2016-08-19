package Trees;

import java.util.ArrayList;

/**
 * Created by sheshnath on 7/12/2016.
 */
public class BinaryTree {
    Node root;
    public BinaryTree(){
        root = null;
    }
    //method to insert data onto binary tree
    public void insert(int data){
        Node temp = new Node();
        temp.data = data;
        if(root == null){
            root = temp;
            return;
        }
        Node current = root;
        Node parent = root;
        while (true){
            //moving right
            if(parent.data < data){
                current = current.right;
                if(current == null){
                    parent.right = temp;
                    return;
                }
            }
            else{
                current = current.left;
                if(current == null){
                    parent.left = temp;
                    return;
                }
            }
            parent = current;

        }
    }

    /*Method to print elements inOrder*/
    public void inorder(){
        inordrHelper(root);
        System.out.println();
    }
    void inordrHelper(Node node){
        if(node == null){
            return;
        }
        inordrHelper(node.left);
        System.out.print(node.data +" ");
        inordrHelper(node.right);
    }
    /*Method for preorder traversal*/
    public void preorder(){
        System.out.println();
        preoderHelper(root);
    }
    void preoderHelper(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data + " ");
        preoderHelper(node.left);
        preoderHelper(node.right);
    }
    /*Method for postorder traversal*/
    public void postorder(){
        System.out.println();
        postorderHelper(root);
    }

    private void postorderHelper(Node node) {
        if(node == null){
            return;
        }
        postorderHelper(node.left);
        postorderHelper(node.right);
        System.out.print(node.data+ " ");
    }

    /*method for Depth First Search*/
    public void depthFirst(int key){

    }
    /*Method for Breadth first Search*/
    public void breadthFirstSearch(int key){

    }


}
