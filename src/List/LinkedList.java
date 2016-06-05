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
        newNode.data = n;
        if(i == 1){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for(int j = 0 ;j<i-2;j++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void deleteNodeAt(int n){
        if(n<1){
            return;
        }
        if(n==1){
            head = head.next;
            return;
        }
        Node temp = head;
        for(int i = 0 ;i<n-2;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    public void reverse(){
        Node prev = null;
        Node current = head;
        Node next;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void printAll(Node head) {
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.getN()+" ");
            temp = temp.next;
        }
    }

    public void printReverse(Node head){
        if(head==null){
            return;
        }
        printReverse(head.next);
        System.out.print(head.data+" ");
    }

}
