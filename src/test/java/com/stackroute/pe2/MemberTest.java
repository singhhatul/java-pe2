package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {
    MemberChild memberObject;

    /* @Before annotation is used on a method containing Java
 code to run before each test case. i.e it runs before each test execution.
 In the setup method ,object of class is declared
 */
    @Before
    public void setUp() {
        //arrange
        this.memberObject = new MemberChild();
    }
       /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */
    @After
    public void tearDown(){
        memberObject= null;
    }
    /* this function will return Name from child class of abstract class and test case will pass
     */

    @Test
    public void givenStringShouldReturnName() {
        //act
        String actualResult = this.memberObject.returnName("Atul");
        //assert
        assertEquals("Atul", actualResult);
    }
    /* this function will return age from child class of abstract class and test case will pass
     */

    @Test
    public void givenIntegerShouldReturnAge() {
        //act
        int actualResult = this.memberObject.returnAge(22);
        //assert
        assertEquals(22, actualResult);
    }
    /* this function will returnn salary from child class of abstract class and test case will pass
     */

    @Test
    public void givenIntegerShouldReturnSalary() {
        //act
        int actualResult = this.memberObject.returnSalary(22000);
        //assert
        assertEquals(22000, actualResult);
    }
}