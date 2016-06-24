package Applications;


import java.util.Stack;

/**
 * Created by sheshnath on 6/17/2016.
 */
public class StackApplications {
    public boolean isBalancedParanthesis(String s){
        boolean result = false;
        Stack<Character> stack = new Stack();
        char c;
        for(int i = 0;i<s.length();i++){
            c = s.charAt(i);
            if(c == '[' || c == '{'|| c=='('){
                stack.push(c);
            }
            else{
                char c2 = stack.pop();
                if((c=='(' && c2 !=')')||(c == '[' && c2 != ']')||(c == '{' && c2 != '}')){
                    return false;
                }
            }
        }
        if(stack.empty()){
            result = true;
        }
        return result;
    }

    public int evaluatePostFix(String exp){
        Stack<Integer> st = new Stack<Integer>();
        int op1;
        int op2;
        for(int i = 0;i<exp.length();i++){
            if(exp.charAt(i) == '*' || exp.charAt(i) == '/' || exp.charAt(i) == '+' || exp.charAt(i) == '-'){
                op2 = st.pop();
                op1 = st.pop();
                int res = perform(exp.charAt(i),op1,op2);
                st.push(res);
            }
            else{
                st.push(Character.getNumericValue(exp.charAt(i)));
            }
        }
        return st.pop();
    }
    public int perform(char c,int op1,int op2){
        int res = 0;
        if(c== '*'){
            return op1*op2;
        }
        if(c == '/'){
            return op1/op2;
        }
        if(c == '+'){
            return op1 + op2;
        }
        if(c == '-'){
            return op1-op2;
        }
        return res;
    }
}
