package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelTest {
    RemoveVowel ob;
    @Before
    public void setUp(){
        ob=new RemoveVowel();
    }

    @After
    public void tearDown() {
        ob=null;
    }
    @Test
    public void givenInputIsConsecuitveShouldReturnMessage()
    {
        String result=ob.places("India");
        assertEquals("nd",result);
    }
    @Test
    public void givenIntegerShouldReturErrorMessage()
    {
        boolean result=ob.isNumeric("123123");
        assertEquals(true,result);
    }


}