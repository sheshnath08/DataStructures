package Run;

import Applications.StackApplications;
import BasicDataStructures.LinkedList;
//import BasicDataStructures.Stack;
import Trees.BinaryTree;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by sheshnath on 6/1/2016.
 */
public class Controller {
    public static void main(String args[]){
     /*  int nums[] = {1,2,3,4,5,6};
        int a = 39601;
        String n = "123456";
        int hash[] = new int[10];
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<n.length();i++){
            int temp = Integer.parseInt(n.charAt(i)+"");
            hash[temp]++;
        }
        for(int i = 9;i>=0;i--){
            while(hash[i]!=0){
                sb.append(i);
                hash[i]--;
            }
        }
        System.out.println(sb.toString());*/
       /* System.out.println((int)Math.sqrt(a));
        System.out.println(binarySearch(nums,3));*/

        String s = "dir1\n" +
                " dir12\n"+
                "  picture.jpeg\n"+
                "dir2\n"+
                " test.png";

        System.out.println(myMethod(s));

       /* String s1 = "this is\n" +
                "to.png" +
                "how it works";
        System.out.println(findTotalAbsoluteLength(s1));*/

    }

    public static int myMethod(String s){
        int totalLength = 0;
        if(s == null || s.length() ==0){
            return totalLength;
        }
        String[] tokens = s.split("\n");
        Stack<Integer> dfsStack = new Stack<>();
        int levelCount = 0;
        int currentLength = 0;
        for(int i=0;i<tokens.length;i++){
            String name = tokens[i];
            levelCount = name.length() - name.trim().length();
            if(name.contains(".png")|| name.contains(".gif") || name.contains(".jpeg")){
               while(dfsStack.size()>= levelCount){
                   if(dfsStack.size() == levelCount)
                    totalLength = totalLength+dfsStack.pop();
                   dfsStack.pop();
               }
                //totalLength = totalLength +dfsStack.peek();
            }else{
                if(!dfsStack.empty())
                    currentLength = dfsStack.peek();
                if(!name.contains("."))
                    dfsStack.push(name.trim().length()+currentLength+1);
            }
        }
        return totalLength;
    }
    public static int binarySearch(int nums[],int key){
        int low = 0;
        int high = nums.length -1;
        while(low<=high){
            int m = (low+high)/2;
            if(key == nums[m]){
                return m;
            }
            if(key <= nums[m]){
                high = m-1;
            }
            else{
                low = m+1;
            }
        }
        return -1;
    }

    public static int findTotalAbsoluteLength(String s){
        if(s.length()<=3){
            return 0;
        }
        if(!s.contains(".gif") && !s.contains(".jpeg") && !s.contains(".png")){
            return 0;
        }
        String[] lines=s.split("\n");
        int totalAbsoluteLength=0;
        int level=0;
        for(int i=lines.length-1;i>=0;i--){
            String name=lines[i];
            if(name.contains(".gif") || name.contains(".jpeg") || name.contains(".png")){
                level = name.length()- name.trim().length();
            }
            if(level > name.length()- name.trim().length() ){
                totalAbsoluteLength = totalAbsoluteLength + name.trim().length()+1;
                System.out.println(name+" "+ totalAbsoluteLength);
                level--;
            }
        }
        return totalAbsoluteLength;
    }
}
