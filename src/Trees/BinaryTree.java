package Trees;

/**
 * Created by sheshnath on 7/12/2016.
 */
public class BinaryTree {
    Node root;
    public BinaryTree(){
        root = null;
    }
    //methdo to insert data onto binary tree
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
}
