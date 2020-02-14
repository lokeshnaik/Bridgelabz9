package utility;

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
 
 public static String find(JSONArray array,int index)
 {
	 JSONObject obj=(JSONObject) array.get(index);
	 long result=(long) obj.get("weight") * (long) obj.get("price");
	 return "Amount for "+obj.get("weight")+"Kg of "+obj.get("name")+" is: "+result;
 }
}