/*
Determine if a string has all Unique Characters 

Input : abcd10jk
Output : true

Input : hutg9mnd!nk9
Output : false

*/
import java.util.*;
 
class GfG {
    boolean uniqueCharacters(String str)
    {
        // If at any time we encounter 2 same
        // characters, return false
        for (int i = 0; i < str.length(); i++)
            for (int j = i + 1; j < str.length(); j++)
                if (str.charAt(i) == str.charAt(j))
                    return false;
 
        // If no duplicate characters encountered,
        // return true
        return true;
    }
 
    public static void main(String args[])
    {
        GfG obj = new GfG();
        String input = "GeeksforGeeks";
 
        if (obj.uniqueCharacters(input))
            System.out.println("The String " + input + " has all unique characters");
        else
            System.out.println("The String " + input + " has duplicate characters");
    }
}
