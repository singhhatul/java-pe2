package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckFactorialTest {
    CheckFactorial factorial;

     /* @Before annotation is used on a method containing Java
    code to run before each test case. i.e it runs before each test execution.
    In the setup method ,object of class is declared
    */

    @Before
    public void setUp() {
        //arrange
        this.factorial = new CheckFactorial();
    }

  /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */

    @After
    public void tearDown()
    {
        factorial = null;
    }
    /* this function will check the given integer is valid integer in range should return value in range
     */

    @Test
    public void givenIntegerShouldReturnInRange(){
        //act
        String actualResult = this.factorial.intFactrial(6);
        //assert
        assertEquals("value is in int range", actualResult);
    }
    /* this function will check the given integer is not valid integer in range should return value not in range
     */
    @Test
    public void givenIntegerShouldReturnNotInRange(){
        //act
         String actualResult = this.factorial.intFactrial(15);
        //assert
        assertEquals("value not in int range", actualResult);
    }
    /* this function will check the given negative integer is not a valid input should return negative number
     */
    @Test
    public void givenNegativeIntegerShouldReturnErrorforInt(){
        //act
        String actualResult = this.factorial.intFactrial(-6);
        //assert
        assertEquals("negative number", actualResult);
    }
    /* this function will check the given integer is valid long integer in range should return value in range
     */

    @Test
    public void givenIntegerShouldReturnLongInRange(){
        //act
        String actualResult = this.factorial.longFactrial(18);
        //assert
        assertEquals("value is in long range", actualResult);
    }
    /* this function will check the given integer is not valid long integer in range should return value not in range
     */
    @Test
    public void givenLongIntegerShouldReturnNotInRange(){
        //act
        String actualResult = this.factorial.longFactrial(30);
        //assert
        assertEquals("value not in range", actualResult);
    }
    /* this function will check the given negative integer is not a valid input should return negative number
     */
    @Test
    public void givenNegativeIntegerShouldReturnErrorforLong(){
        //act
        String actualResult = this.factorial.longFactrial(-16);
        //assert
        assertEquals("negative number", actualResult);
    }



}