/*

Check if two strings are permutation of each other

Write a function to check whether two given strings are Permutation of each other or not. 
A Permutation of a string is another string that contains same characters, 
  only the order of characters can be different. 
For example, “abcd” and “dabc” are Permutation of each other.

*/

import java.util.*;
class GfG {
 
  /* function to check whether two strings are
  Permutation of each other */
  static boolean arePermutation(String str1, String str2)
  {
    // Get lengths of both strings
    int n1 = str1.length();
    int n2 = str2.length();
 
    // If length of both strings is not same,
    // then they cannot be Permutation
    if (n1 != n2)
    return false;
    char ch1[] = str1.toCharArray();
    char ch2[] = str2.toCharArray();
 
    // Sort both strings
    Arrays.sort(ch1);
    Arrays.sort(ch2);
 
    // Compare sorted strings
    for (int i = 0; i < n1; i++)
    if (ch1[i] != ch2[i])
        return false;
 
    return true;
  }
 
  /* Driver program to test to print printDups*/
  public static void main(String[] args)
  {
    String str1 = "test";
    String str2 = "ttew";
    if (arePermutation(str1, str2))
    System.out.println("Yes");
    else
    System.out.println("No");
 
  }
}

// Output: No
