package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberIsPowerOfFourTest {

    NumberIsPowerOfFour numberPower;

      /* @Before annotation is used on a method containing Java
    code to run before each test case. i.e it runs before each test execution.
    In the setup method ,object of class is declared
    */
      @Before
      public void setUp() {
          //arrange
          this.numberPower = new NumberIsPowerOfFour();
      }

       /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */

    @After
    public void tearDown(){

        numberPower = null;
    }

    /* this function will check the given number is power of four if it is power of four then test case will pass
     */

    @Test
    public void givenIntegerShouldReturnTrue() {
        //act
        String actualResult = this.numberPower.powerNumber(22);
        //assert
        assertEquals("True", actualResult);

    }

    /* this function will check the given number is power of four if it is power of four then test case will pass
     */
    @Test
    public void givenIntegerShouldReturnFalse() {
        //act
        String actualResult = this.numberPower.powerNumber(22);
        //assert
        assertEquals("False", actualResult);

    }
    /* this function will check the given number is negative if it is null returnn false and test case will pass
     */

    @Test
    public void givenNegativeIntegerShouldReturnFalse() {
        //act
        boolean actualResult = this.numberPower.powerNumber(-20);
        //assert
        assertEquals(false, actualResult);

    }
    /* this function will check the given number is null if it is null returnn false and test case will pass
     */

    @Test
    public void givenNullShouldReturnFalse() {
        //act
        boolean actualResult = this.numberPower.powerNumber();
        //assert
        assertEquals(false, actualResult);



    }


}