package BasicDataStructures;


/**
 * Created by sheshnath on 6/13/2016.
 */
public class Stack {
    // Array Implementation of tree
    int top;
    int stackArray[];
    int max[];
    int maxTop;
    public Stack(){
        top = -1;
        stackArray = new int[100];
        maxTop = 0;
        max = new int[100];
    }
    public void push(int x){
        if(top  > stackArray.length){
            System.out.println("Push Error: Overflow");
        }
        else{
            stackArray[++top] = x;
            if(x>max[maxTop]){
                max[++maxTop] =x;
            }
        }
    }
    public int pop(){
        if(top<0){
            return 0;
        }
        if(top() >= max[maxTop]){
            maxTop--;
        }
        return stackArray[top--];
    }
    public int top(){
        return stackArray[top];
    }
    public void printStackElement(){
        for(int i = 0;i<=top;i++){
            System.out.print(stackArray[i] + " ");
        }
        System.out.println("");
    }
    public int maxElement(){
        return max[maxTop];
    }

}
