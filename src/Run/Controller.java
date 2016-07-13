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
        int a[] = {1,3,4,5,6,7};
        int b[] = {1,1};
        StackApplications sa = new StackApplications();
        Misc m = new Misc();
        System.out.println(m.findMin(a));
        //System.out.println(sa.kSmallestPairs(a,b,2));
        //System.out.println(sa.evaluatePostFix(s1));
    }
}
