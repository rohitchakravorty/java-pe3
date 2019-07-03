package com.stackroute.pe3;

/*find if the numbers are consecutive or not*/
public class ConsecutiveNumber {

    public static boolean isNumeric(String strNum)    //To validate the input
    {
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }


    public static String checkConsecutiveNumbers(String inputString) {
        String[] numbers = inputString.split(" ");   //To split the inoutString
        for (int loop = 1; loop < numbers.length; loop++) {
            if (Integer.parseInt(numbers[loop]) - Integer.parseInt(numbers[loop - 1]) != 1) {
                return "not consecutive";
            }

        }
        return "consecutive";
    }
}
