/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int finalNumber = 0;
		
		for( int i = 100 ; i <= 9000 ; i++)
		{
			if(i%7 == 0)
			{
			 finalNumber +=i;	
			}
		}
		System.out.println(finalNumber);
		
		int sum =0;
		int low = (100/7)+1;
		int hi = 9000/7;
		// System.out.println(low);
		// System.out.println(hi);
		
		for(int i =low;i<=hi;i++){
			sum+=i*7;
		}
		System.out.println(sum);
		
		
		
	}
}
