package com.brideglabz.stockaccountmanagement.repository;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

//import com.brideglabz.stockaccountmanagement.model.BeanClass;
import com.brideglabz.stockaccountmanagement.utility.UtilLogicsCommonCode;

//import com.bridgelabz.utility.UtilLogicsCommonCode;


public class RepositoryMethodImplementation 
{
	/*public void addItemToInventory(String filepath, Object o)
	{
	try
	{
	JSONArray arr=new JSONArray();
	JSONObject json=new JSONObject();
	File fr=new File(filepath);
	if(fr.length()!=0)
	{
	try
	{
	arr=(JSONArray) new JSONParser().parse(new FileReader(filepath));
	}catch(Exception e)
	{
	System.out.println(e);
	}
	}
	json.put("stockname",((BeanClass) o).getStockname());
	json.put("shareprice",((BeanClass) o).getShareprice());
	json.put("noofshares",((BeanClass) o).getNoofshares());
	FileWriter fw=new FileWriter(filepath);
	PrintWriter pw=new PrintWriter(fw);
	arr.add(json);
	pw.println(arr.toString());
	fw.close();
	pw.close();
	}
	catch(Exception e)
	{
	System.out.println(e);
	}
	}*/
	

	
	public void displayTheInventory(String filepath)
	{
	try {
	JSONArray array=UtilLogicsCommonCode.readJsonFile(filepath);
	System.out.println(array);
	}catch(Exception e) {
	System.out.println(e);
	}
	}

}
