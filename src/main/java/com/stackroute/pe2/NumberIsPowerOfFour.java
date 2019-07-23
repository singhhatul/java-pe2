package com.stackroute.pe2;

        /*A Java method to check if a given number is power of 4
        This is first program of java practice exercise 2
        */
        public class NumberIsPowerOfFour {

                public String powerNumber(long inputNumber) {
                        while (inputNumber > 0) {
                                if (inputNumber == 1) {
                                        return "true";
                                }

                                if (inputNumber % 4 != 0) {
                                        return "false";
                                } else {
                                        inputNumber = inputNumber / 4;
                                }
                        }

                        return "false";
                }


                private int n;

                public boolean powerNumber(int inputInteger)
                {
                        this.n = inputInteger;
                        while(inputInteger>0){
                                if(inputInteger==1){
                                        return true;
                                }

                                if(inputInteger%4!=0){
                                        return false;
                                }else{
                                        inputInteger=inputInteger/4;
                                }
                        }

                        return false;
                }



        }