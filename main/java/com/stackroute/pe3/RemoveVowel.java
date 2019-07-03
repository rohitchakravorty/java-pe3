package com.stackroute.pe3;
/*to set up an array of places, Loop round and remove the vowels*/
public class RemoveVowel
{
    String[] places;
    String result="";
    public static boolean isNumeric(String strNum)    //To validate the input
    {
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }
    public String places(String input)
    {
        input=input.replaceAll("a|e|i|o|u","");  //Replaced all the
        input=input.replaceAll("A|E|I|O|U","");  //vowels
        places=input.split(" ");
        for(String s:places)
        {
            result=result.concat(s).concat(" ");
        }
        return result.trim();
    }
}
