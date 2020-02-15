package com.bridgelabz.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import com.bridgelabz.utility.InputScanner;

public class BeanClass
{
private String name;
private double price,weight;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public BeanClass() throws IOException
{
System.out.print("Enter the name:");
this.name=br.readLine();
System.out.print("Enter the price:");
this.price=utility.InputScanner.doubleInput();
System.out.print("Enter the weight:");
this.weight=utility.InputScanner.doubleInput();
}
public String getName()
{
return name;
}
public void setName(String name)
{
this.name = name;
}
public double getPrice()
{
return price;
}
public void setPrice(double price)
{
this.price = price;
}
public double getWeight()
{
return weight;
}
public void setWeight(double weight)
{
this.weight = weight;
}
}