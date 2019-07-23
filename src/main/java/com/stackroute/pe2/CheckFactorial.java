package com.stackroute.pe2;

public class CheckFactorial {
    public String intFactrial(int inputNumber) {
        int factorialInt = 1;
        if (inputNumber < 0) {
            return "negative number";
        } else if(inputNumber<13) {

            for (int i = 1; i <= inputNumber; i++) {
                factorialInt = factorialInt * i;
            }

        }
        if(inputNumber<=13)
            return "value is in int range";
        else
            return "value not in int range";
    }
    public String longFactrial(long n) {
        if(n>=13 && n<=20)
        {
            return "value is in long range";
        }
        long factorialLong = 1;
        //long rangeOfLong=243290200817664000;
        if (n < 0) {
            return "negative number";
        }
        else if(n>13 && n<=20) {

            for (int i = 1; i <= n; i++) {
                factorialLong = factorialLong * i;
            }

        }
        else
            return "value not in range";
        return null;
    }

}