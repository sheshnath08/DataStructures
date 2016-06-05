package List;

/**
 * Created by sheshnath on 5/31/2016.
 */

public class LinkedList {
    public Node head;
    public LinkedList(){
        this.head = null;
    }
    Node getHead(){
        return head;
    }
    public void insertAtEnd(int n){
        Node newNode = new Node();
        newNode.data = n;
        if(head == null){
            head = newNode;
        }
        else{
            Node temp  = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
        }

    }

    public void insertAtBegining(int n){
        Node newNode = new Node();
        newNode.data = n;
        newNode.next = head;
        head = newNode;
    }

    /*inserting n at ith location in the list */
    public void insertAt(int n,int i){
        Node newNode = new Node();
        Node temp = head;
        int c = 1;
        while(c<i-1 && temp!=null){
            temp = temp.next;
            c++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public Node reverse(){
        Node prev = null;
        while(head.next != null){
            Node second = head.next;
            head.next = prev;
            prev = head;
            head = second;
        }
        head.next = prev;
        return head;
    }

    public void printAll(Node head) {
        Node temp = head;
        while(temp!= null){
            System.out.println(temp.getN());
            temp = temp.next;
        }
    }

}
