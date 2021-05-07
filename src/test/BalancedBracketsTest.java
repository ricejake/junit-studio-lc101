package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    //1
    @Test
    public void singleBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    //2
    @Test
    public void bracketsAroundWordReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    //3
    @Test
    public void bracketOpeningInWordWithCloserReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[code]"));
    }
    //4
    @Test
    public void bracketOpeningInWordWithoutCloserReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch[code"));
    }
    //5
    @Test
    public void backwardBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    //6
    @Test
    public void multipleBalancedBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }
    //7
    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    //8
    @Test
    public void oddNumberOfBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]]]"));
    }
    //9
    @Test
    public void BracketsFollowedByTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    //10
    @Test
    public void backwardBracketsInTextReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    //11
    @Test
    public void singleForwardBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    //12
    @Test
    public void singleBackwardBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

}
