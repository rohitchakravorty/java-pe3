package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class ConsecutiveNumberTest {

        ConsecutiveNumber ob;
        @Before
        public void setUp(){
            ob=new ConsecutiveNumber();
        }

        @After
        public void tearDown() {
            ob=null;
        }
        @Test
        public void givenInputIsConsecuitveShouldReturnMessage()
        {
            String result=ob.checkConsecutiveNumbers("1 2 3 4 5");
            assertEquals("consecutive",result);
        }
        @Test
        public void givenInputIsNotConsecuitveShouldReturnMessage()
        {
        String result=ob.checkConsecutiveNumbers("1 2 3 4 4");
        assertEquals("not consecutive",result);
        }
        @Test
        public void givenNotIntegerShouldReturErrorMessage()
        {
                boolean result=ob.isNumeric("abcd");
                assertEquals(false,result);
        }
}