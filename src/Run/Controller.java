package Run;

import List.LinkedList;

/**
 * Created by sheshnath on 6/1/2016.
 */
public class Controller {
    public static void main(String args[]){
        LinkedList l = new LinkedList();
        l.insertAtEnd(4);
        l.insertAtEnd(2);
        l.insertAtEnd(6);
        l.insertAtBegining(300);
        l.insertAtEnd(7);
        l.insertAtBegining(200);
        //l.insertAt(5,6);
        //l.reverse();
        l.printAll(l.head);
    }
}
