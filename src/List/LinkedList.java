package List;

/**
 * Created by sheshnath on 5/31/2016.
 */

public class LinkedList {
    Node head;
    LinkedList(){
        this.head = null;
    }
    Node getHead(){
        return head;
    }
    public void insert(int n){
        if(head == null){
            head = new Node(n);
        }
        else{
            Node newNode = new Node(n);
            Node temp  = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
        }

    }

    public void printAll() {
        Node temp = head;
        while(temp!= null){
            System.out.println(temp.getN());
            temp = temp.next;
        }
    }

}
