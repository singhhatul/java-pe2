package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseAndCheckPalindromeTest {

    StringReverseAndCheckPalindrome stringReverseAndCheckPalindrome;


   /* @Before annotation is used on a method containing Java
    code to run before each test case. i.e it runs before each test execution.
    In the setup method ,object of class is declared
    */

    @Before
    public void setUp() {
        //arrange
        this.stringReverseAndCheckPalindrome = new StringReverseAndCheckPalindrome();
    }

  /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */

    @After
    public void tearDown(){
        stringReverseAndCheckPalindrome = null;
    }

       /* this function will check the given string is paindrome if it is palindrome then test case will pass

        */

    @Test
    public void givenStringShouldReturnAPalindrome() {
        //act
        String actualResult = this.stringReverseAndCheckPalindrome.reverseAndPalindrome("abbba");
        //assert
        assertEquals("Palindrome", actualResult);

    }

    /* this function will check the given string is not a paindrome if it is not a palindrome then test case will pass

     */
    @Test
    public void givenStringShouldReturnNotAPalindrome() {
        //act
        String actualResult = this.stringReverseAndCheckPalindrome.reverseAndPalindrome("abcdefg");
        //assert
        assertEquals("Not A Palindrome", actualResult);


    }
    /* this function will check the given number is not a proper input if it is not proper input then return proper
    message and test case will pass

     */
    @Test
    public void givenIntegerShouldReturnErrorMessage() {
        //act
        String actualResult = this.stringReverseAndCheckPalindrome.reverseAndPalindrome(12345);
        //assert
        assertEquals("Not A Valid input", actualResult);
    }

    /* this function will check the given input is null then return proper message
     and test case will pass

     */
    @Test
    public void givenIntegerShouldReturnNotAPalindrome() {
        //act
        String actualResult = this.stringReverseAndCheckPalindrome.reverseAndPalindrome();
        //assert
        assertEquals("input is  null", actualResult);


    }

}