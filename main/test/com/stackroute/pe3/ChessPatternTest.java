package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessPatternTest {
    ChessPattern ob;
    @Before
    public void setUp(){
        ob=new ChessPattern();
    }

    @After
    public void tearDown() {
        ob=null;
    }
    @Test
    public void givenInputShouldReturnMessage()
    {
        ob.matrixInitialise(4);
        String result=ob.chessBoard();
        assertEquals("BB Ww BB Ww \n" +
                "BB Ww BB Ww \n" +
                "BB Ww BB Ww \n" +
                "BB Ww BB Ww \n",result);
    }
    @Test
    public void givenNotIntegerShouldReturErrorMessage()
    {
        boolean result=ob.isNumeric("abcd");
        assertEquals(false,result);
    }

}