/*
One Away: There are three types of edits that can be performed on strings: insert a character,
remove a character, or replace a character. Given two strings, write a function to check if they are
one edit (or zero edits) away.

Check if edit distance between two strings is one

An edit between two strings is one of the following changes. 

  1. Add a character
  2. Delete a character
  3. Change a character
  
Given two string s1 and s2, find if s1 can be converted to s2 with exactly one edit. Expected time complexity is O(m+n) where m and n are lengths of two strings. 

Examples: 
  Input:  s1 = "geeks", s2 = "geek"
  Output: yes
  Number of edits is 1

  Input:  s1 = "geeks", s2 = "geeks"
  Output: no
  Number of edits is 0

  Input:  s1 = "geaks", s2 = "geeks"
  Output: yes
  Number of edits is 1

  Input:  s1 = "peaks", s2 = "geeks"
  Output: no
  Number of edits is 2

*/

class GFG
{
  // Returns true if edit distance
  // between s1 and s2 is one, else false
  static boolean isEditDistanceOne(String s1, String s2)
  {
    // Find lengths of given strings
    int m = s1.length(), n = s2.length();
 
    // If difference between lengths is
    // more than 1, then strings can't
    // be at one distance
    if (Math.abs(m - n) > 1)
        return false;
 
    int count = 0; // Count of edits
 
    int i = 0, j = 0;
    while (i < m && j < n)
    {
        // If current characters don't match
        if (s1.charAt(i) != s2.charAt(j))
        {
            if (count == 1)
                return false;
 
            // If length of one string is
            // more, then only possible edit
            // is to remove a character
            if (m > n)
                i++;
            else if (m< n)
                j++;
            else // Iflengths of both strings
                // is same
            {
                i++;
                j++;
            }
             
            // Increment count of edits
            count++;
        }
 
        else // If current characters match
        {
            i++;
            j++;
        }
    }
 
    // If last character is extra
    // in any string
    if (i < m || j < n)
        count++;
 
    return count == 1;
}
 
// driver code
public static void main (String[] args)
{
    String s1 = "gfg";
    String s2 = "gf";
    if(isEditDistanceOne(s1, s2))
        System.out.print("Yes");
    else
        System.out.print("No");
 }
}
