/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	static void findIndex(String orinalString){
		
		int length = orinalString.length();
		String eachWord = "";
		String finalString = "";
		for(int i = 0; i < length ; i ++)
		{
			if (orinalString.charAt(i) == ' ')
			{
				if(eachWord.trim().isEmpty())
				{
					
				}else
				{
				finalString = " " + eachWord + finalString;
				eachWord = "";
				}
			}else
			{
				 eachWord += Character.toString(orinalString.charAt(i));
			}
			
		}
		finalString = eachWord + finalString;
		System.out.println(finalString);
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		String orinalString = "   My     name    Rakesh    ";
		orinalString=orinalString.trim();
		findIndex(orinalString);
	}
}

