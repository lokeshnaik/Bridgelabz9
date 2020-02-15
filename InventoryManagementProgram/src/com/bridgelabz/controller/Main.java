package com.bridgelabz.controller;

import java.io.IOException;

import com.bridgelabz.model.BeanClass;
import com.bridgelabz.repository.RepositoryMethodsImplementation;
//import com.bridgelabz.utility.InputScanner;

public class Main {

public static void main(String[] args) throws IOException
{
int choice;
do
{
System.out.println("1.Add the item\t2.Delete the item\t3.Display Inventory\t4.Edit item's value");
System.out.println("5.Total value of Inventory\t6.total value of price\t7.Total value of weight\t-1.exit");
System.out.print("Enter your choice:");
choice=utility.InputScanner.integerInput();  
RepositoryMethodsImplementation repository=new RepositoryMethodsImplementation();
String filepath="/home/bridgelabz/Desktop/file.json";
switch(choice)
{
case 1:
{
BeanClass bean=new BeanClass();
repository.addItemToInventory(filepath,bean);
break;
}
case 2:
{
repository.deleteItemFromInventory(filepath);
break;
}
case 3:
{
repository.displayTheInventory(filepath);
break;
}
case 4:
{
repository.editTheItemValue(filepath);
break;
}
case 5:
{
repository.totalValueOfInventory(filepath);
break;
}
case 6:
{
repository.totalPriceOfInventory(filepath);
break;
}
case 7:
{
repository.totalWeightOfInventory(filepath);
break;
}
default:
{
System.out.println("Invalid Option");
}
}
}while(choice!=-1);
}

}