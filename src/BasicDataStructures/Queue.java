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
        if(isEmpty()){
            rear = n;
            front = n;
        }
        else{
            rear.next = n;
            rear = n;
        }
    }
    public void delete(){
        if(!isEmpty()){
            if(front == rear){
                front = rear = null;
            }
            else{
                front = front.next;
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
