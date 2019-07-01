package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks ob;
    @Before
    public void setUp() {
        ob=new StudentMarks();
    }

    @After
    public void tearDown(){
        ob=null;
    }
    @org.junit.Test
    public void checkInvalidityShouldReturnTrue(){

        assertEquals(true,ob.checkInvalidity(0));
    }

    @org.junit.Test
    public void checkInvalidityShouldReturnTrue1(){
        StudentMarks sm=new StudentMarks();
        assertEquals(true,ob.checkInvalidity(100));
    }
    @org.junit.Test
    public void checkInvalidityShouldReturnFalse(){
        StudentMarks sm=new StudentMarks();
        assertEquals(false,ob.checkInvalidity(66));
    }

}

