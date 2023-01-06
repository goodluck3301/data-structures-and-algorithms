// Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method to rotate the image by 90 degrees

public static void rotation( int [][] matrix, int n )
{
  int start = 0, end = n - 1;
  int temp = 0;
  //save left vertical line to temp and rotate 90 degree line by line
  while( start < end ){
  for( int i = 0; i < end - start; i++ )
  {
    temp = matrix[ start ][ start + i ];
    matrix[ start ][ start + i ] = matrix[ end - i ][ start ];
    matrix[ end - i ][ start ] = matrix[ end ][ end - i ];
    matrix[ end ][ end - i ] = matrix[ start + i ][ end ];
    matrix[ start + i ][ end ] = temp;
  }
  start++;
  end--;
  }   
}
