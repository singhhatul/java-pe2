package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGradesTest {
    StudentGrades grades;

    /* @Before annotation is used on a method containing Java
  code to run before each test case. i.e it runs before each test execution.
  In the setup method ,object of class is declared
  */
    @Before
    public void setUp() {
        //arrange
        this.grades = new StudentGrades();
    }

    /*  @After annotation is used on a method containing java code to run after each test case.
 These methods will run even if any exceptions are thrown in the test case or in the case
 of assertion failures.
 In the tear down method ,object is initialized with null so that obj is destroyed
 */
    @After
    public void tearDown() {

        grades = null;
    }
    /* this function will check the given number is in range and should return proper string message
     */
    @Test
    public void givenNumberShouldReturnErrorIfNumberIsNotValid() {
        String actualresult = grades.getDataOfStudent(120, 30, -20, 59);
        assertEquals("entered proper value between range", actualresult);
    }
    /* this function will input 4 grades of students and should return minimum grade
     */
    @Test
    public void givenNumberShouldReturnMinimum() {
        int actualresult = grades.getDataOfStudent(80, 30, 66, 59);
        assertEquals(30, actualresult);
    }
    /* this function will input 4 grades of students and should return avearge of grades
     */
    @Test
    public void givenNumberShouldReturnAverage() {
        float actualresult = grades.getDataOfStudent(80, 30, 66, 59);
        assertEquals(58.75, actualresult,2);
    }
    /* this function will input 4 grades of students and should return maximum grade
     */
    @Test
    public void givenNumberShouldReturnMaximum() {
        int actualresult = grades.getDataOfStudent(80, 30, 66, 59);
        assertEquals(80, actualresult);
    }

}