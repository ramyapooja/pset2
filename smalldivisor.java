/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int r=sc.nextInt();
		int c=0;
		for(int i=1;i<=100000;i++)
		{
			if((i%l==0)&&(i%r==0))
			{
				c=i;
				break;
			}
		}
		System.out.println(c);
	}
}
