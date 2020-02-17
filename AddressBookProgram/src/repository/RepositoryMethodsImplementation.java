package repository;


//import java.awt.List;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
//import java.io.IOException;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.Collections;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;

import model.BeanClass;
import service.ServicesProvidingInterface;
import utility.InputScanner;
import utility.UtilLogicsCommonCode;



public class RepositoryMethodsImplementation implements ServicesProvidingInterface
{

@Override
public void addThePersonDetails(String filepath, Object o)
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
json.put("firstName",((BeanClass) o).getFirstName());
json.put("lastName",((BeanClass) o).getLastName());
json.put("address",((BeanClass) o).getAddress());
json.put("city",((BeanClass) o).getCity());
json.put("state",((BeanClass) o).getState());
json.put("zip",((BeanClass) o).getZip());
json.put("phoneNumber",((BeanClass) o).getPhoneNumber());
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
public void deleteThePersonDetails(String filepath)
{
System.out.print("Enter the item name to remove from Inventory");
String name=InputScanner.stringInput();
JSONArray array=null;
try {
array=UtilLogicsCommonCode.readJsonFile(filepath);
}catch(Exception e) {System.out.println(e);}
//System.out.println(array);
for(int i=0;i<array.size();i++)
{
JSONObject jo=(JSONObject)array.get(i);
if(jo.get("firstName").equals(name))
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
public void editPersonDetails(String filepath)
{
Boolean find=false;
System.out.print("Enter the firstName of person to edit:");
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
if(str.equalsIgnoreCase((String) jo.get("firstName")))
{
find=true;
System.out.println("Enter the field you want to edit\"(FirstName/LastName/address/city/state/zip/phoneNumber)\"");
String s=InputScanner.stringInput();
if(s.equalsIgnoreCase("LastName"))
{
System.out.println("Enter the last name of the person to be update");
 String val=InputScanner.stringInput();
jo.put("lastName",val);
}
else if(s.equalsIgnoreCase("Address"))
{
	System.out.println("Enter the address of the person to be update");
	 String val=InputScanner.stringInput();
	jo.put("address",val);
}
else if(s.equalsIgnoreCase("City"))
{
	System.out.println("Enter the city of the person to be update");
	 String val=InputScanner.stringInput();
	jo.put("city",val);
}
else if(s.equalsIgnoreCase("State"))
{
	System.out.println("Enter the state of the person to be update");
	 String val=InputScanner.stringInput();
	jo.put("state",val);
}
else if(s.equalsIgnoreCase("Zip"))
{
	System.out.println("Enter the pine code of the person to be update");
	 String val=InputScanner.stringInput();
	jo.put("zip",val);
}
else if(s.equalsIgnoreCase("PhoneNumber"))
{
	System.out.println("Enter the city of the person to be update");
	 String val=InputScanner.stringInput();
	jo.put("phoneNumber",val);
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
public void searchThePersonDetails(String filepath)
{
try {
JSONArray array=UtilLogicsCommonCode.readJsonFile(filepath);
System.out.println(array);
}catch(Exception e) {
System.out.println(e);
}
}


public void searchTheSinglePersonDetails(String filepath)
{
	int k=0;
	System.out.println("Enter the firstName of the person to find the whole details:");
	String name=InputScanner.stringInput();
	JSONArray array= null;
try {
 array=UtilLogicsCommonCode.readJsonFile(filepath);
System.out.println(array);
}catch(Exception e) {
System.out.println(e);
}
for(int i=0;i<array.size();i++)
{
JSONObject jo=(JSONObject) array.get(i);
if(name.equalsIgnoreCase((String) jo.get("firstName")))
{
k++;
System.out.println("Person details are:");
   System.out.println((String)jo.get("firstName"));
   System.out.println((String)jo.get("lastName"));
   System.out.println((String)jo.get("address"));
   System.out.println((String)jo.get("city"));
   System.out.println((String)jo.get("state"));
   System.out.println((String)jo.get("zip"));
   System.out.println((String)jo.get("phoneNumber"));
}

}
if(k==0)
{
	System.out.println("Person in not found");
}

}


/*

@Override
public void sortByName(String filepath)
{

 
try
{
JSONArray array=UtilLogicsCommonCode.readJsonFile(filepath);
System.out.println(array);
}catch(Exception e)
{
System.out.println(e);
}
}

@Override
public void sortByZip(String filepath)
{
try
{
JSONArray array=UtilLogicsCommonCode.readJsonFile(filepath);
System.out.println(array);
}catch(Exception e)
{
System.out.println(e);
}
}

@Override
public void sortByPhoneNumber(String filepath)
{
try 
{
JSONArray array=UtilLogicsCommonCode.readJsonFile(filepath);
System.out.println(array);
}catch(Exception e)
{
System.out.println(e);
}
}*/

}
