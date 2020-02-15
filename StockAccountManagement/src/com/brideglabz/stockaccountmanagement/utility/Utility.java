package com.brideglabz.stockaccountmanagement.utility;

import java.io.File;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Utility 
{
 public static JSONArray read(String fileName) throws IOException, ParseException
 {
	 JSONArray array = new JSONArray();
	// JSONParser parse = null;
 File filename=new File(fileName);
 if(filename.length() != 0)
 {
	 array=(JSONArray) new JSONParser().parse(new FileReader(fileName));
 }
	 return array;
 }
	public static void display(JSONArray array,int index)
	{
		JSONObject obj=(JSONObject) array.get(index);
		System.out.println("Name of the company:"+obj.get("stockname"));
		System.out.println("Share price of the company:"+obj.get("shareprice"));
		System.out.println("No share of the company:"+obj.get("noofshares"));
		
		
	}
 
 
	
 public static String find(JSONArray array,int index)
 {
	 JSONObject obj=(JSONObject) array.get(index);
	 long result=(long) obj.get("shareprice") * (long) obj.get("noofshares");
	 return "Amount for whole stock of "+obj.get("stockname")+" having share price "+obj.get("shareprice")+" of these numbers of shares "+obj.get("noofshares")+" is: "+result;
 }
}
