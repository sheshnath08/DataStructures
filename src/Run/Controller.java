package Run;

import BasicDataStructures.LinkedList;
import BasicDataStructures.Stack;

/**
 * Created by sheshnath on 6/1/2016.
 */
public class Controller {
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(4);
        s.push(5);
        System.out.println(s.maxElement());
        s.printStackElement();
        s.pop();
        System.out.println(s.maxElement());
        s.printStackElement();
        s.pop();
        s.pop();
        s.push(3);
        System.out.println(s.maxElement());
        s.printStackElement();
    }
}
