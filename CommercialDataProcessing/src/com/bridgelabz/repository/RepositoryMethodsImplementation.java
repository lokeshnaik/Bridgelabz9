package com.bridgelabz.repository;



import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.model.BeanClassName;
import com.bridgelabz.service.ServicesProvidingInterface;
import com.bridgelabz.utility.InputScanner;
import com.bridgelabz.utility.UtilLogicsCommonCode;




public class RepositoryMethodsImplementation implements ServicesProvidingInterface
{

@Override
public void addThecompany(String filepath) throws IOException
{
	BeanClassName br=new BeanClassName();
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
json.put("stockAccountCompany",br.getstockAccountCompany());
json.put("symbol",br.getSymbol());
json.put("date",br.getDate());
json.put("sharePrice",br.getSharePrice());
json.put("noOfShares",br.getNoOfShares());
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
}

@Override
public void deleteThecompany(String filepath)
{
System.out.print("Enter the company name to remove from commercial data:");
String name=InputScanner.stringInput();
JSONArray array=null;
try {
array=UtilLogicsCommonCode.readJsonFile(filepath);
}catch(Exception e) {System.out.println(e);}
//System.out.println(array);
for(int i=0;i<array.size();i++)
{
JSONObject jo=(JSONObject)array.get(i);
if(jo.get("stockAccountCompany").equals(name))
{
array.remove(jo);
}

}
System.out.println(array);
try {
//System.out.println(array);
FileWriter fw=new FileWriter(filepath);
PrintWriter pw=new PrintWriter(fw);
pw.print(array.toString());
pw.close();
fw.close();
}catch(Exception e)
{
System.out.println(e);
}
}



@Override
public void editTheCompanyToPurchase(String filepath)
{
Boolean find=false;
System.out.print("Enter the stock account company  to purchase:");
String str=InputScanner.stringInput();
JSONArray array=null;
try {
array=UtilLogicsCommonCode.readJsonFile(filepath);
}catch(Exception e) {
System.out.println(e);
}
for(int i=0;i<array.size();i++)
{
JSONObject jo=(JSONObject) array.get(i);
if(str.equalsIgnoreCase((String) jo.get("stockAccountCompany")))
{
find=true;
System.out.println("Enter the no of stock you want to purchase");
double integer=InputScanner.integerInput();
double k=(double) jo.get("noOfShares")+integer;
jo.put("noOfShares",k);

JSONObject joj=new JSONObject();
JSONArray arr=new JSONArray();
arr.add(joj);
arr.add(jo);
try {
FileWriter fw=new FileWriter(filepath);
PrintWriter pw=new PrintWriter(fw);
pw.println(array.toString());
pw.close();
fw.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}
if(find==false)
System.out.println("Invalid input");
}


@Override
public void editTheCompanyToSell(String filepath)
{
	Boolean find=false;
	System.out.print("Enter the stock account company  to purchase:");
	String str=InputScanner.stringInput();
	JSONArray array=null;
	try {
	array=UtilLogicsCommonCode.readJsonFile(filepath);
	}catch(Exception e) {
	System.out.println(e);
	}
	for(int i=0;i<array.size();i++)
	{
	JSONObject jo=(JSONObject) array.get(i);
	if(str.equalsIgnoreCase((String) jo.get("stockAccountCompany")))
	{
	find=true;
	System.out.println("Enter the no of stock you want to sell:");
	double integer=InputScanner.integerInput();
	double k=(double) jo.get("noOfShares")-integer;
	jo.put("noOfShares",k);

	JSONObject joj=new JSONObject();
	JSONArray arr=new JSONArray();
	arr.add(joj);
	arr.add(jo);
	try {
	FileWriter fw=new FileWriter(filepath);
	PrintWriter pw=new PrintWriter(fw);
	pw.println(array.toString());
	pw.close();
	fw.close();
	}
	catch(Exception e)
	{
	System.out.println(e);
	}
	}
	}
	if(find==false)
	System.out.println("Invalid input");

}


@Override
public void DisplayTheEntireCompantDetails(String filepath)
{
try {
JSONArray array=UtilLogicsCommonCode.readJsonFile(filepath);
System.out.println(array);
}catch(Exception e) {
System.out.println(e);
}
}



@Override
public void searchTheSingleCompanyDetails(String filepath)
{
	int k=0;
	System.out.println("Enter the company to find the whole details:");
	String name=InputScanner.stringInput();
	JSONArray array= null;
try {
array=UtilLogicsCommonCode.readJsonFile(filepath);
//System.out.println(array);
}catch(Exception e) {
System.out.println(e);
}
for(int i=0;i<array.size();i++)
{
JSONObject jo=(JSONObject) array.get(i);
if(name.equalsIgnoreCase((String) jo.get("stockAccountCompany")))
{
k++;
System.out.println("Single company details are:");
 System.out.println("Company="+(String)jo.get("stockAccountCompany"));
 System.out.println("symbol="+(String)jo.get("symbol"));
 System.out.println("Date="+(String)jo.get("date"));
 System.out.println("Share Price="+(double)jo.get("sharePrice"));
 System.out.println("no of shares="+(double)jo.get("noOfShares"));
}

}
if(k==0)
{
	System.out.println("Company is not found");
}
	
}

}
