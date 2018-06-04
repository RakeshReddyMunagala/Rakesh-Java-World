/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
     static	boolean ispal(String IntailString)
     {
	int length = IntailString.length();
		int i = 0;
		int j = length / 2;
		while(i <= j){
		if(IntailString.charAt(i) == IntailString.charAt(length-1-i))
			{
				i++;
			}
			else
			{
			return false;
			}
				
		}
	
		return true;	
	}
	public static void main (String[] args) throws java.lang.Exception
	{
	       if(ispal("NITVIN"))
	       { 
		System.out.println("Plindrome");
	       }
	       else
	       {
	       	System.out.println("NoT Plindrome");
	       }
		
	}
	
}
