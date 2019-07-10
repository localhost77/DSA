package com.ds.Stacks;

import java.util.Stack;

public class BalancedParanthesisCheck {

    Stack<Character> stack = new Stack<>();

    public boolean checkBalancedParanthesis(String str) {

        // Iterate through the string
        // If the character is (, {, [ then push it to stack
        //

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                stack.push(str.charAt(i));
            }

            if (str.charAt(i) == ')' || str.charAt(i) == '}' || str.charAt(i) == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                Character temp = stack.pop();
                if (!isMatchingParanthesis(temp, str.charAt(i))) {
                    return false;
                }
            }
        }

        if (!stack.isEmpty()) {
            return false;
        }

        return true;
    }

    private boolean isMatchingParanthesis(Character temp1, Character temp2) {
        return ((temp1 == '(' && temp2 == ')') ||
                (temp1 == '{' && temp2 == '}') ||
                (temp1 == '[' && temp2 == ']'));
    }
}
