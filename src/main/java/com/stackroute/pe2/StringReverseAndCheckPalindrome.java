package com.stackroute.pe2;

/*This is first program of java practice exercise 2
A Java method to Reverse the given input & Check if it is a Palindrome.*/

public class StringReverseAndCheckPalindrome {
    public String reverseAndPalindrome(String input)
    {
        if(input.length()==0)
        {
            return "input is  Null";
        }
        String reverseString="";
        for (int i = input.length() - 1; i >= 0; i--)
        {
            reverseString +=  input.charAt(i);
        }
        if(input.equals(reverseString))
            return "Palindrome";
        else
            return "Not A Palindrome";

    }
    public String reverseAndPalindrome(int number)
    {
        return "Not A Valid input";
    }

    public String reverseAndPalindrome()
    {
        return "input is  null";
    }



}
