package utility;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class UtilLogicsCommonCode
{
public static JSONArray readJsonFile(String filepath) throws FileNotFoundException, IOException, ParseException
{
JSONArray array=new JSONArray();
JSONObject json=new JSONObject();
Object o=new Object();
File f=new File(filepath);
if(f.length()!=0)
{
array=(JSONArray)new JSONParser().parse(new FileReader(filepath));
}
return array;
}
}