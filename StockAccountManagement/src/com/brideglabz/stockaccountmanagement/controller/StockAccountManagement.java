package com.brideglabz.stockaccountmanagement.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;

//import com.brideglabz.stockaccountmanagement.model.BeanClass;
import com.brideglabz.stockaccountmanagement.repository.RepositoryMethodImplementation;
import com.brideglabz.stockaccountmanagement.utility.Utility;
import com.brideglabz.stockaccountmanagement.utilityscanner.UtilityScanner;
//import com.bridgelabz.model.BeanClass;


public class StockAccountManagement 
{

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException
	{
		RepositoryMethodImplementation repository=new RepositoryMethodImplementation();
		JSONArray array=new JSONArray();
		String filepath="/home/bridgelabz/Desktop/json1.json";	
		int value=1;
		array=Utility.read(filepath);
		while(value!=2)
		{
			System.out.println("Enter the choice that you want to find the stock details");
			System.out.println("0.HDFC Bank");
			System.out.println("1.Reliance");
			System.out.println("2.Jio");
			System.out.println("3.tata Consultancy");
			//System.out.println("4.Add the new stock name company and details:");
			System.out.println("4.Display the whole content of stock available:");
			System.out.println("5.Exit");
			
	         int index = UtilityScanner.integerInput();
	         switch (index)
	         {
			case 0:
				Utility.display(array, index);
				System.out.println(	Utility.find(array, index));
				break;
			case 1:
				Utility.display(array, index);
				System.out.println(	Utility.find(array, index));
				break;
			case 2:
				Utility.display(array, index);
				System.out.println(	Utility.find(array, index));
				break;
			case 3:
				Utility.display(array, index);
				System.out.println(	Utility.find(array, index));
				break;
			case 4:
				repository.displayTheInventory(filepath);
				break;
			case 5:
				value=2;
				System.out.println("Program exits");
				break;
			default:
				System.out.println("Enter the option in between 0 to 5:");
				break;
			}
		}
	}
}
