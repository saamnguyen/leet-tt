package easy;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s){
        //Khoi tao 1 stack, rong se la []
        Stack<Character> stack = new Stack<Character>();

        //check
        if(s == null || s.length() == 0) return false;

        System.out.println(s.toCharArray());

        //loop
        for(char c: s.toCharArray()){
            System.out.println(c);
            System.out.println(stack + " stack start");
            if(c == '('){
                stack.push(')');
                System.out.println(0);

            }
            else if (c == '{'){

                stack.push('}');
                System.out.println(1);
            }
            else if (c == '['){
                stack.push(']');
                System.out.println(2);
            }
            else if(stack.isEmpty() || stack.pop() != c){
                System.out.println("123");
                return  false;

            }
            System.out.println(stack + " stack end");
            System.out.println(stack.isEmpty());
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();

        System.out.println(validParentheses.isValid("()()"));
    }
}

//Input: s = "()"
//        Output: true
//        Input: s = "()[]{}"
//        Output: true
//        Input: s = "()[]{}"
//        Output: true