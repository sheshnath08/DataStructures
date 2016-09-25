package BasicDataStructures;

/**
 * Created by sheshnath on 9/25/2016.
 */
public class Queue {
    Node front;
    Node rear;
    public Queue(){
        front = null;
        rear = null;
    }

    public void insert(int x){
        Node n = new Node();
        n.data = x;
        if(rear==null){
            rear = n;
            front = n;
        }
        else{
            n.next = rear;
            rear = n;
        }
    }
    public void delete(){
        if(!isEmpty()){
            if(front == rear){
                front = rear = null;
            }
            else{

                Node temp = rear;
                while (temp.next != front){
                    temp = temp.next;
                }
                temp.next = null;
                front = temp;
            }
        }
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return front.data;
    }
    public boolean isEmpty(){
        return front == null;
    }
}
