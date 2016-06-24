package Run;

import Applications.StackApplications;
import BasicDataStructures.LinkedList;
import BasicDataStructures.Stack;

/**
 * Created by sheshnath on 6/1/2016.
 */
public class Controller {
    public static void main(String args[]){
       String s = "[]()({})[({}()]";
        String s1 = "12+2-";
        StackApplications sa = new StackApplications();
        System.out.println(sa.isBalancedParanthesis(s));
        System.out.println(sa.evaluatePostFix(s1));
    }
}
