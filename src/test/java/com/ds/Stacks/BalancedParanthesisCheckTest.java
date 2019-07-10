package com.ds.Stacks;

import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedParanthesisCheckTest {

    @Test
    public void testBalancedParanthesis() {
        BalancedParanthesisCheck paranthesis = new BalancedParanthesisCheck();

        assertTrue(paranthesis.checkBalancedParanthesis("({[]})"));
        assertFalse(paranthesis.checkBalancedParanthesis("({[]}))))"));
        assertFalse(paranthesis.checkBalancedParanthesis("({[]}}"));
    }
}