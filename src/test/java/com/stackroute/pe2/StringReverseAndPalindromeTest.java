package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseAndPalindromeTest {

    StringReverseAndPalindrome stringReverseAndPalindrome;


   /* @Before annotation is used on a method containing Java
    code to run before each test case. i.e it runs before each test execution.
    In the setup method ,object of class is declared
    */

    @Before
    public void setUp() {
        //arrange
        this.stringReverseAndPalindrome = new StringReverseAndPalindrome();
    }

  /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */

    @After
    public void tearDown(){
        stringReverseAndPalindrome = null;
    }

       /* this function will check the given string is paindrome if it is palindrome then test case will pass

        */

    @Test
    public void givenStringShouldReturnAPalindrome() {
        //act
        String actualResult = this.stringReverseAndPalindrome.reverseAndPalindrome("abbba");
        //assert
        assertEquals("Palindrome", actualResult);

    }

    /* this function will check the given string is not a paindrome if it is not a palindrome then test case will pass

     */
    @Test
    public void givenIntegerShouldReturnNotAPalindrome() {
        //act
        String actualResult = this.stringReverseAndPalindrome.reverseAndPalindrome("abcdefg");
        //assert
        assertEquals("Not A Palindrome", actualResult);


    }

}