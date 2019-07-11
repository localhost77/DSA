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

            // If the character is ), }, ] then pop an element from the stack
            // and check if its matching the paranthesis with the current characters

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

        // If the stack is still not empty,
        // it means there are still some operators left that were unmatched

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
