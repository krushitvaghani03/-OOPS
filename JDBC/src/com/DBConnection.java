package com;

public class DBConnection
{
	public static void main(String[] args) {
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded...");
			
		} 
		catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
		}
	}
}
