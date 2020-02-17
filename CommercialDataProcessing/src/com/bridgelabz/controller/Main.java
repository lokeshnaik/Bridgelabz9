package com.bridgelabz.controller;


import java.io.IOException;

import com.bridgelabz.model.BeanClassName;
import com.bridgelabz.repository.RepositoryMethodsImplementation;
import com.bridgelabz.utility.InputScanner;




public class Main {

public static void main(String[] args) throws IOException
{
int choice;
do
{
System.out.println("1.Add the company details in the commercial data:");
System.out.println("2.Delete the company details in the commercial data:");
System.out.println("3.Edit the the company details in the commercial data to purchase the shares:");
System.out.println("4.Edit the the company details in the commercial data to sell the shares:");
System.out.println("5.Search the single company details in the commercial data:");
System.out.println("6.Display the entire companies details");
System.out.println("7.To exit the program:");
System.out.print("Enter your choice:");
choice=InputScanner.integerInput();
RepositoryMethodsImplementation repository=new RepositoryMethodsImplementation();
String filepath="/home/bridgelabz/eclipse-workspace/BridgeLabz7/CommercialDataProcessing/src/com/bridgelabz/repository/sample9.json";
switch(choice)
{
case 1:
{
repository.addThecompany(filepath);
break;
}
case 2:
{
repository.deleteThecompany(filepath);
break;
}
case 3:
{
repository.editTheCompanyToPurchase(filepath);
break;
}
case 4:
{
repository.editTheCompanyToSell(filepath);
break;
}
case 5:
{
repository.searchTheSingleCompanyDetails(filepath);
break;
}
case 6:
{
	repository.DisplayTheEntireCompantDetails(filepath);
	break;
}
case 7:
{
  choice=-1;
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
