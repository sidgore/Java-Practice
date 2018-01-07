package com.ctci;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IsUnique {
	
	
	static String isUnique(String input)
	{
		for(int i=0;i<input.length();i++)
		{
			System.out.print("i  "+i);	
			char temp=input.charAt(i);
			for(int j=i+1;j<input.length();j++)
			{
				System.out.println("j  "+j);	
			if(input.charAt(j)==temp)
			{
				System.out.println("Not Unique!!");
				return "Not Unique";
				
				
			}
			}
		}
		return "Unique";
		
	}
	
	
	static String isUniqueSet(String input)
	{ 
		 Set<Character> s = new HashSet<Character>();
		for (char a : input.toCharArray())
        s.add(a);
		
		if(s.size()==input.length())
			return "Unique";
		else return "Not Unique";
        
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter a String");

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner( System.in );

		String input=scanner.nextLine();
		System.out.println( "Status is  = " + isUniqueSet(input) );


		

	}
}
