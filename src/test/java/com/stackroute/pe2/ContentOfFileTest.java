package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContentOfFileTest {
    ContentOfFile filesContent;

    /* @Before annotation is used on a method containing Java
  code to run before each test case. i.e it runs before each test execution.
  In the setup method ,object of class is declared
  */
    @Before
    public void setUp() {
        //arrange
        this.filesContent = new ContentOfFile();
    }
      /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */

    @After
    public void tearDown() {
        filesContent= null;
    }


    /* this function will check the file input if it is not valid then raise a message wrong file and then
     test case will pass
     */
    @Test
    public void givenInvalidFileShouldReturnError(){
        //act
        String fileLocation="/home/cgi/Desktop/test.txt";
        String actualResult=this.filesContent.fileReader(fileLocation);
        //assert
        assertEquals("wrong file",actualResult);
    }
    /* this function will check the file input if it is valid then read file content and sent it back if both the
    data are same then match the file content.
     */

    @Test
    public void givenFileShouldReturnContentOfFiles(){
        //act
        String fileLocation="/home/cgi/Desktop/test.txt";
        String[] actualResult=this.filesContent.fileReader(fileLocation);
        String[] fileContent={"ATUL","IS","BOY"};
        //assert
        assertArrayEquals(fileContent,actualResult);
    }

    @Test
    public void givenFileShouldReturnError(){
        //act
        String fileLocation="/home/cgi/Desktop/test.txt";
        String actualResult=this.filesContent.fileReader(fileLocation);
        //assert
        assertaEquals("file empty",actualResult);
    }



}