package com.stackroute.pe3;

public class Exception {
    public static void main(String[] args)
    {
        try {
            System.out.println("Try block");
            throw new java.lang.Exception();

        }
        catch (java.lang.Exception e)
        {
            System.out.println("Catch block");
        }
        finally {
            System.out.println("Finally block");
        }
    }
}
