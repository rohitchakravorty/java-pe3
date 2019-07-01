package com.stackroute.pe3;

public class CatchExceptions {
    public static void  main(String[] args)
    {
        try{
            int[] arrayToBeTested=new int[-14];
        }
        catch (NegativeArraySizeException e)
        {
            e.printStackTrace();
        }
        try {
            int[] arrayToBeTested=new int[2];
            arrayToBeTested[4]=12;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
        try {
            String stringToBeTested=null;
            stringToBeTested.indexOf('a');
            }
        catch (NullPointerException e)
        {
            e.printStackTrace();
        }
    }

}
