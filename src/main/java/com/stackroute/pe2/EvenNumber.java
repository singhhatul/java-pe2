package com.stackroute.pe2;

        /*This is first program of java practice exercise 2.
        a boolean method called isEven() in a class called EvenNumTest, which takes
        an int as input and returns true if the input is even. The signature of the method is as
        follows: public static boolean isEven(int number)*/

public class EvenNumber {
    public static boolean isEven(int inputNumber)
    {
        if(inputNumber<0)
            return false;
        else {
            if (inputNumber % 2 == 0)
                return true;
            else
                return false;
        }
    }
    public static boolean isEven()
    {
        return false;
    }

}
