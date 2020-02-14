package com.bridgelabz.inventorydatamanagement.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;

import utility.Utility;
import utilityscanner.UtilityScanner;


public class InventoryDataManagement {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException
	{
		JSONArray array=new JSONArray();
		// JSONObject obj=new JSONObject();
		String string="/home/bridgelabz/Desktop/file.json";
		// String str="/java1/src/main/java/json/json.json";
		int value=1;
		array=Utility.read(string);
		while(value!=2)
		{
			System.out.println("Enter the number you want to find the price of the item:");
			System.out.println("0.Rice");
			System.out.println("1.Pulses");
			System.out.println("2.Wheat");
			System.out.println("3.Exit");
			
	         int index = UtilityScanner.integerInput();
	         switch (index)
	         {
			case 0:
			System.out.println(	Utility.find(array, index));
				break;
			case 1:
				System.out.println(Utility.find(array, index));
				break;
			case 2:
				System.out.println(Utility.find(array, index));
				break;
			case 3:
				value=2;
				System.out.println("Program exits");
				break;
			default:
				System.out.println("Enter the option in between 0 to 2:");
				break;
			}
		}
	}
	

}
