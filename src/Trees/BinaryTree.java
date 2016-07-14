package Trees;

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

    }

    /*Method for preorder traversal*/
    public void preorder(){

    }
    /*Method for postorder traversal*/
    public void postorder(){

    }

    /*method for Depth First Search*/
    public void depthFirst(){

    }
    /*Method for Breadth first Search*/
    public void breadthFirstSearch(){

    }

}
