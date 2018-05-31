/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num = 3532;
		int cofiecent = num;
		int palinum = 0;
		while(cofiecent > 0)
		{
		
			
			palinum = palinum * 10 + (cofiecent % 10);
			cofiecent = cofiecent / 10;
		}
		
		
		if(num == palinum)
		{
			System.out.println(palinum+" palindrome number ");	
		}
		else
		{
			System.out.println(palinum+" Not palindrome number");
		}
	}
}
