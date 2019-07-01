package com.stackroute.pe3;

public class ConsecutiveNumber {
    public static String checkConsecutiveNumbers(String inputString)
    {
        String[] numbers=inputString.split(" ");
        for(int loop=1;loop<numbers.length;loop++)
        {
            if(Integer.parseInt(numbers[loop])-Integer.parseInt(numbers[loop-1])!=1)
            {
                return "not consecutive";
            }

        }
        return "consecutive";
    }
}
