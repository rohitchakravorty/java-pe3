package com.stackroute.pe3;

public class RemoveVowel {
    String[] places;
    String result="";
    public String places(String input)
    {
        input=input.replaceAll("a|e|i|o|u","");
        input=input.replaceAll("A|E|I|O|U","");
        places=input.split(" ");
        for(String s:places)
        {
            result=result.concat(s).concat(" ");
        }
        return result.trim();
    }
}
