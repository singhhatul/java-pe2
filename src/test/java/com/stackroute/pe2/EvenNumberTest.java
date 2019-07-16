package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumberTest {
    EvenNumber evenNumber;

    /* @Before annotation is used on a method containing Java
  code to run before each test case. i.e it runs before each test execution.
  In the setup method ,object of class is declared
  */
    @Before
    public void setUp() {
        //arrange
        this.evenNumber = new EvenNumber();
    }

       /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */

    @After
    public void tearDown(){

        evenNumber= null;
    }

    /* this function will check the given number is even number if it is even returnn true and test case will pass
     */

    @Test
    public void givenIntegerShouldReturnTrue() {
        //act
        boolean actualResult = this.evenNumber.isEven(22);
        //assert
        assertEquals(true, actualResult);


    }
    /* this function will check the given number is even number if it is even returnn true and test case will pass
     */

    @Test
    public void givenIntegerShouldReturnFalse() {
        //act
        boolean actualResult = this.evenNumber.isEven(33);
        //assert
        assertEquals(false, actualResult);

    }
    /* this function will check the given number is negative if it is negative returnn false and test case will pass
     */

    @Test
    public void givenNegativeIntegerShouldReturnFalse() {
        //act
        boolean actualResult = this.evenNumber.isEven(-20);
        //assert
        assertEquals(false, actualResult);

    }
    /* this function will check the given number is null if it is null returnn false and test case will pass
     */

    @Test
    public void givenNullShouldReturnFalse() {
        //act
        boolean actualResult = this.evenNumber.isEven();
        //assert
        assertEquals(false, actualResult);



    }

}