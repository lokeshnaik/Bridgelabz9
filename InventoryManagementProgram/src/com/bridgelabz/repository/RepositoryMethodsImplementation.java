package com.bridgelabz.repository;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.io.PrintWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;

import com.bridgelabz.service.ServicesProvidingInterface;
//import com.bridgelabz.utility.InputScanner;
import com.bridgelabz.utility.UtilLogicsCommonCode;

import utility.InputScanner;

import com.bridgelabz.model.BeanClass;

public class RepositoryMethodsImplementation implements ServicesProvidingInterface
{

@Override
public void addItemToInventory(String filepath, Object o)
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
json.put("name",((BeanClass) o).getName());
json.put("weight",((BeanClass) o).getWeight());
json.put("price",((BeanClass) o).getPrice());
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
public void deleteItemFromInventory(String filepath)
{
System.out.print("Enter the item name to remove from Inventory");
String name=InputScanner.stringInput();
JSONArray array=null;
try {
array=UtilLogicsCommonCode.readJsonFile(filepath);
}catch(Exception e) {System.out.println(e);}
System.out.println(array);
for(int i=0;i<array.size();i++)
{
JSONObject jo=(JSONObject)array.get(i);
if(jo.get("name").equals(name))
{
array.remove(jo);
}
}
System.out.println(array);
try {
System.out.println(array);
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
public void displayTheInventory(String filepath)
{
try {
JSONArray array=UtilLogicsCommonCode.readJsonFile(filepath);
System.out.println(array);
}catch(Exception e) {
System.out.println(e);
}
}

@Override
public void editTheItemValue(String filepath)
{
Boolean find=false;
System.out.print("Enter the Item name to edit:");
String str=utility.InputScanner.stringInput();
JSONArray array=null;
try {
array=UtilLogicsCommonCode.readJsonFile(filepath);
}catch(Exception e) {
System.out.println(e);
}
for(int i=0;i<array.size();i++)
{
JSONObject jo=(JSONObject) array.get(i);
if(str.equalsIgnoreCase((String) jo.get("name")))
{
find=true;
System.out.println("Enter the field you want to edit\"(Name/price/weight)\"");
String s=utility.InputScanner.stringInput();
if(s.equalsIgnoreCase("Price"))
{
System.out.println("Enter the price value to be update");
double val=utility.InputScanner.doubleInput();
jo.put("price",val);
}
else if(s.equalsIgnoreCase("Weight"))
{
System.out.println("Enter the Weight value to be update");
double val=utility.InputScanner.doubleInput();
System.out.println();
jo.put("weight",val);
}
else if(s.equalsIgnoreCase("Name"))
{
System.out.println("Enter the new item's name");
String st=utility.InputScanner.stringInput();
jo.put("Name",st);
}
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
public void totalValueOfInventory(String filepath)
{
JSONArray arr=null;
long total=0;
try
{
arr=(JSONArray)new JSONParser().parse(new FileReader(filepath));

}catch(Exception e)
{
System.out.println(e);
}
for(int i=0;i<arr.size();i++)
{
JSONObject jo=(JSONObject) arr.get(i);
 total+= (long) jo.get("price") * (long) jo.get("weight");
}
System.out.print("Total value of Inventory="+total);
System.out.println();
}


@Override
public void totalPriceOfInventory(String filepath)
{
	JSONArray arr=null;
	long total=0;
	try
	{
	arr=(JSONArray)new JSONParser().parse(new FileReader(filepath));

	}catch(Exception e)
	{
	System.out.println(e);
	}
	for(int i=0;i<arr.size();i++)
	{
	JSONObject jo=(JSONObject) arr.get(i);
	 total+= (long) jo.get("price");
	}
	System.out.print("Total Price value of Inventory="+total);
	System.out.println();

}

@Override
public void totalWeightOfInventory(String filepath)
{
	JSONArray arr=null;
	long total=0;
	try
	{
	arr=(JSONArray)new JSONParser().parse(new FileReader(filepath));

	}catch(Exception e)
	{
	System.out.println(e);
	}
	for(int i=0;i<arr.size();i++)
	{
	JSONObject jo=(JSONObject) arr.get(i);
	 total+=(long) jo.get("weight");
	}
	System.out.print("Total weight value of Inventory="+total);
	System.out.println();

}


}